package org.example;

public class Diretor extends Pessoa {

    private String generoAssinatura;

    public Diretor (String nome, String instagram, String generoAssinatura) {
        super(nome, instagram);
        this.generoAssinatura = generoAssinatura;
    }

    public String getGeneroAssinatura() {
        return generoAssinatura;
    }

    public void setGeneroAssinatura(String generoAssinatura) {
        this.generoAssinatura = generoAssinatura;
    }

    @Override
    public String toString() {
        return nome;
    }
}
