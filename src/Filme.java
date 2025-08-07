public class Filme {
    private String nome;
    private String dataLancamento;
    private double orcamento;
    private String descricao;


    public Filme(String nome, String dataLancamento, double orcamento, String descricao) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;

    }

        public String getNome() {
        return nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public String getDescricao() {
        return descricao;
    }


    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Filme: " + nome +
                "\nData de Lançamento: " + dataLancamento +
                "\nOrçamento: R$ " + orcamento +
                "\nDescrição: " + descricao;
    }