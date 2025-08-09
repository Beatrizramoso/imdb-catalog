package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Filme> filmes = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Application initiated!!!");

        cadastrarEraUmaVezEmHollywood();

        System.out.println("Application finished!!!!");
    }

    public static void cadastrarEraUmaVezEmHollywood() {
        // Cadastro de atores
        Ator leonardoDiCaprio = new Ator(
                "Leonardo DiCaprio",
                "@leonardodicaprio",
                "Calvin Candie");
        Ator bradPitt = new Ator(
                "Brad Pitt",
                "@bradpittofflcial",
                "Tenente Aldo Raine");
        Ator margotRobbie = new Ator(
                "Margot Robbie",
                "@margotrobbieofficial",
                "Barbie"
        );

        // Cadastro de diretor
        Diretor quentinTarantino = new Diretor(
                "Quentin Tarantino",
                "@quentin.tarantinoo",
                "Faroeste");
        Diretor stevenSpielberg = new Diretor(
                "Steven Spielberg",
                "@stevenspeilbergofficial",
                "Ficção Científica");

        // Cria filme
        Filme eraUmaVezEmHollywood = new Filme(
                "Era uma Vez em... Hollywood",
                LocalDate.of(2019, 8, 15),
                BigDecimal.valueOf(90000000.00),
                List.of(leonardoDiCaprio, bradPitt),
                quentinTarantino
        );

        // Podemos adicionar atores posteriormente também
        eraUmaVezEmHollywood.cadastrarAtor(margotRobbie);

        // Cadastra filme
        filmes.add(eraUmaVezEmHollywood);
    }

    public static void cadastrarAListaDeSchindler() {
        Diretor stevenSpielberg = new Diretor(
                "Steven Spielberg",
                "@stevenspeilbergofficial",
                "Ficção Científica");
    }

}