package org.example;

//Criação da Classe Ator
public class Ator {

    //Atributo nome;
    private String nome;

    //Atributo Instagram
    private String instagram;

    //Atributo Personagem Popular
    private String personagemMaisPopular;

    //*Construtor do Método cadastra Ator*//
    public Ator(String nome, String instagram, String personagemMaisPopular) {
        this.nome = nome;
        this.instagram = instagram;
        this.personagemMaisPopular = personagemMaisPopular;
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

    public String getPersonagemMaisPopular() {
        return personagemMaisPopular;
    }

    public void setPersonagemMaisPopular(String personagemMaisPopular) {
        this.personagemMaisPopular = personagemMaisPopular;
    }
}
