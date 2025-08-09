package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Filme {

    String nome;

    LocalDate datadeLancamento;

    BigDecimal orcamento;

    List<Ator> atores;

    Diretor diretor;

    public Filme(String nome, LocalDate datadeLancamento, BigDecimal orcamento, List<Ator> atores, Diretor diretor) {
        this.nome = nome;
        this.datadeLancamento = datadeLancamento;
        this.orcamento = orcamento;
        this.atores = atores;
        this.diretor = diretor;
    }
}
