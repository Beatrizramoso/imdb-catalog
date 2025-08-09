package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Filme {

    private String nome;

    private LocalDate datadeLancamento;

    private BigDecimal orcamento;

    private List<Ator> atores;

    private Diretor diretor;

    public Filme(String nome, LocalDate datadeLancamento, BigDecimal orcamento, List<Ator> atores, Diretor diretor) {
        this.nome = nome;
        this.datadeLancamento = datadeLancamento;
        this.orcamento = orcamento;
        this.atores = atores;
        this.diretor = diretor;
    }

    public void cadastrarAtor(Ator ator) {
        this.atores.add(ator);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDatadeLancamento() {
        return datadeLancamento;
    }

    public void setDatadeLancamento(LocalDate datadeLancamento) {
        this.datadeLancamento = datadeLancamento;
    }

    public BigDecimal getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(BigDecimal orcamento) {
        this.orcamento = orcamento;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }
}
