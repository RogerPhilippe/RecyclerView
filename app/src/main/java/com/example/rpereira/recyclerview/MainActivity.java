package com.example.rpereira.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.rpereira.recyclerview.model.Livro;
import com.example.rpereira.recyclerview.utils.RecyclerAdapter;
import com.example.rpereira.recyclerview.utils.Utils;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private List<Livro> mLivros;

    private Utils utils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.idMainRecyclerView);

        mRecyclerView.setHasFixedSize(true);

        utils = new Utils();

        mLivros = utils.getLivros(120);

        mRecyclerView.setAdapter(new RecyclerAdapter(MainActivity.this, mLivros));

        RecyclerView.LayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        mRecyclerView.setLayoutManager(layout);

    }
}
