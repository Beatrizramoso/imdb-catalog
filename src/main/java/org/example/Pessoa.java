package org.example;

public abstract class Pessoa {

    private String nome;

    private String instagram;

    public Pessoa(String nome, String instagram) {
        this.nome = nome;
        this.instagram = instagram;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
}
