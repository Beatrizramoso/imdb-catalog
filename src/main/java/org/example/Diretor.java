package org.example;

public class Diretor {

    private String nome;

    private String instagram;

    private String generoAssinatura;

    public Diretor (String nome, String instagram, String generoAssinatura) {
        this.nome = nome;
        this.instagram = instagram;
        this.generoAssinatura = generoAssinatura;
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

    public String getGeneroAssinatura() {
        return generoAssinatura;
    }

    public void setGeneroAssinatura(String generoAssinatura) {
        this.generoAssinatura = generoAssinatura;
    }
}
