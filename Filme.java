import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filme {

    private String nome;
    private LocalDate dataDeLancamento;
    private BigDecimal orcamento;
    private List<Ator> atores;
    private Diretor diretor;

        public Filme(String nome, LocalDate dataDeLancamento, BigDecimal orcamento, List<Ator> atores, Diretor diretor) {
        this.nome = nome;
        this.dataDeLancamento = dataDeLancamento;
        this.orcamento = orcamento;
        this.atores = (atores != null) ? atores : new ArrayList<>();
        this.diretor = diretor;
    }

        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
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
        this.atores = (atores != null) ? atores : new ArrayList<>();
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

        public void adicionarAtor(Ator ator) {
        if (ator != null) {
            atores.add(ator);
        }
    }

        public boolean temAtor(String nomeAtor) {
        return atores.stream()
                .anyMatch(ator -> ator.getNome().equalsIgnoreCase(nomeAtor));
    }

        @Override
    public String toString() {
        String elencoFormatado = atores.isEmpty()
                ? "Nenhum ator cadastrado"
                : atores.stream()
                .map(Ator::getNome)
                .collect(Collectors.joining(", "));

        return "🎬 Filme: " + nome +
                "\n Lançamento: " + dataDeLancamento +
                "\n Orçamento: R$ " + orcamento +
                "\n Diretor: " + (diretor != null ? diretor.getNome() : "Não informado") +
                "\n Elenco: " + elencoFormatado;
    }
}