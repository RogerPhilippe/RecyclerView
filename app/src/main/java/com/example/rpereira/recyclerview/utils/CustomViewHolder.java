package com.example.rpereira.recyclerview.utils;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.rpereira.recyclerview.R;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    final TextView mTitleList;

    final TextView mSubTitleList;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        mTitleList = (TextView) itemView.findViewById(R.id.idtvTitleList);

        mSubTitleList = (TextView) itemView.findViewById(R.id.idtvSubTitleList);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
