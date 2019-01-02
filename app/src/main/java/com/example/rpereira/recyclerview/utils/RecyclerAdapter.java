package com.example.rpereira.recyclerview.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rpereira.recyclerview.R;
import com.example.rpereira.recyclerview.model.Livro;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter {

    private Context mContext;

    private List<Livro> mList;

    public RecyclerAdapter(Context parent, List<Livro> list) {
        this.mContext = parent;
        this.mList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.recyclerview_list_layout, viewGroup, false);

        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {

        CustomViewHolder holder = (CustomViewHolder) viewHolder;

        Livro livro = mList.get(position);

        holder.mTitleList.setText(livro.getmNome());
        holder.mSubTitleList.setText(livro.getmDescricao());

    }

    @Override
    public int getItemCount() {

        int retorno = 0;
        try {
            if(mList != null || mList.size() > 0) {
                retorno = mList.size();
            }
        } catch (Exception er) { er.printStackTrace(); }

        return retorno;
    }
}
