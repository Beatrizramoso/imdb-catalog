package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application initiated!!!");

        // Cadastro de atores
        Ator leonardoDiCaprio = new Ator(
                "Leonardo DiCaprio",
                "@leonardodicaprio",
                "Calvin Candie");
        Ator bradPitt = new Ator(
                "Brad Pitt",
                "@bradpittofflcial",
                "Tenente Aldo Raine");

        System.out.println("Application finished!!!!");
    }

}