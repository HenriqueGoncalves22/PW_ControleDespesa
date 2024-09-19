package model;

public abstract class Despesa {
    private String descricao;
    private double valortotal;

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    public double getValortotal() {return valortotal;}
    public void setValortotal(double valortotal) {this.valortotal = valortotal;}


    public void cadastrarDespesa(String descricao)
    {
        valortotal = 0;
        this.descricao = descricao;
    }

    public abstract double calcularDespesa();

    public abstract String listarDespesa();
}

