package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

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

        // Cadastro de diretor
        Diretor quentinTarantino = new Diretor(
                "Quentin Tarantino",
                "@quentin.tarantinoo",
                "Faroeste");

        Diretor stevenSpielberg = new Diretor(
                "Steven Spielberg",
                "@stevenspeilbergofficial",
                "Ficção Científica");

        Filme eraUmaVezEmHollywood = new Filme(
                "Era uma Vez em... Hollywood",
                LocalDate.of(2019, 8, 15),
                BigDecimal.valueOf(90000000.00),
                List.of(leonardoDiCaprio, bradPitt),
                quentinTarantino
        );

        System.out.println("Application finished!!!!");
    }

}