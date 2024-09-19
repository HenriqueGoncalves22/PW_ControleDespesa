package model;

//Ativdade realizada por Henrique Gonçalves


public class Alimentacao extends Despesa{
    private String nomeRestaurante;
    private int qtdRefeicao;


    public Alimentacao() {

    }

    public Alimentacao(int qtdRefeicao, String nomeRestaurante) {
        this.qtdRefeicao = qtdRefeicao;
        this.nomeRestaurante = nomeRestaurante;
    }


    public int getQtdRefeicao() {return qtdRefeicao;}
    public void setQtdRefeicao(int qtdRefeicao) {this.qtdRefeicao = qtdRefeicao;}

    public String getNomeRestaurante() {return nomeRestaurante;}
    public void setNomeRestaurante(String nomeRestaurante) {this.nomeRestaurante = nomeRestaurante;}


    public void cadastrarDespesa(String descricao, int qtdRefeicao, String nomeRestaurante)
    {
        qtdRefeicao = 0;
        this.nomeRestaurante = nomeRestaurante;
        super.cadastrarDespesa(descricao);
    }

    @Override
    public double calcularDespesa() {
        super.setValortotal(qtdRefeicao * 18);
        return super.getValortotal();
    }

    @Override
    public String listarDespesa() {
        return  "Despesas" + "\n ------------------------------------------------" +
            "\n" + super.getDescricao() +
            "\nRestaurante" + this.nomeRestaurante +
             "\n" + getValortotal();
    }
}
