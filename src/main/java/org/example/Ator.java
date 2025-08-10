package org.example;

//Criação da Classe Ator
public class Ator extends Pessoa {

    //Atributo Personagem Popular
    private String personagemMaisPopular;

    //*Construtor do Método cadastra Ator*//
    public Ator(String nome, String instagram, String personagemMaisPopular) {
        super(nome, instagram);
        this.personagemMaisPopular = personagemMaisPopular;
    }

    public String getPersonagemMaisPopular() {
        return personagemMaisPopular;
    }

    public void setPersonagemMaisPopular(String personagemMaisPopular) {
        this.personagemMaisPopular = personagemMaisPopular;
    }

    @Override
    public String toString() {
        return nome;
    }
}
