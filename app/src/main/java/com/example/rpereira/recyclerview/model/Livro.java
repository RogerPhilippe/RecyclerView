package com.example.rpereira.recyclerview.model;

public class Livro {

    private int mId;

    private String mNome;

    private String mNomeAutor;

    private String mDescricao;

    private double mPreco;

    private Livro(int mId, String mNome, String mNomeAutor, String mDescricao, double mPreco) {
        this.mId = mId;
        this.mNome = mNome;
        this.mNomeAutor = mNomeAutor;
        this.mDescricao = mDescricao;
        this.mPreco = mPreco;
    }

    public static class Builder {

        private int id;

        private String nome;

        private String nomeAutor;

        private String descricao;

        private double preco;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setNomeAutor(String nomeAutor) {
            this.nomeAutor = nomeAutor;
            return this;
        }

        public Builder setDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder setPreco(double preco) {
            this.preco = preco;
            return this;
        }

        public Livro build() {
            return new Livro(id, nome, nomeAutor, descricao, preco);
        }

    }

    public int getmId() {
        return mId;
    }

    public String getmNome() {
        return mNome;
    }

    public String getmNomeAutor() {
        return mNomeAutor;
    }

    public String getmDescricao() {
        return mDescricao;
    }

    public double getmPreco() {
        return mPreco;
    }

}
