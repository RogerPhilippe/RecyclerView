package com.example.rpereira.recyclerview.utils;

import com.example.rpereira.recyclerview.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    private List<Livro> livros;

    public List<Livro> getLivros(int size) {

        livros = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            livros.add(new Livro.Builder()
                    .setId(i)
                    .setNome("Livro "+i)
                    .setNomeAutor("O bom livro vol. "+i)
                    .setDescricao("Um livro muito bom.")
                    .setPreco(2.3*i)
                    .build()
            );
        }
        return livros;
    }

}
