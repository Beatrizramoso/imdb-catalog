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
        cadastrarAListaDeSchindler();

        try {
            Filme filmeEncontrado = buscarFilmePorNome("A LISTA de SchiNdler");
            System.out.println(filmeEncontrado);

            Filme filmeQueNaoExiste = buscarFilmePorNome("A derrota: Um filme que não existe");
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

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

        // Cria filme
        Filme eraUmaVezEmHollywood = new Filme(
                "Era uma Vez em... Hollywood",
                LocalDate.of(2019, 8, 15),
                BigDecimal.valueOf(90000000.00),
                List.of(leonardoDiCaprio, bradPitt, margotRobbie),
                quentinTarantino
        );

        // Cadastra filme
        filmes.add(eraUmaVezEmHollywood);
    }

    public static void cadastrarAListaDeSchindler() {
        Diretor stevenSpielberg = new Diretor(
                "Steven Spielberg",
                "@stevenspeilbergofficial",
                "Ficção Científica");

        filmes.add(new Filme(
                "A lista de Schindler",
                LocalDate.of(2019, 8, 15),
                BigDecimal.valueOf(90000000.00),
                null, // ToDo: Adicionar mais atores
                stevenSpielberg
        ));
    }

    public static Filme buscarFilmePorNome(String nome) {
        for (Filme filme : filmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        throw new RuntimeException("Não foi possível encontrar o filme " + nome);
    }

}