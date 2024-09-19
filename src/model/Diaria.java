package model;

public class Diaria extends Despesa{
    private double qtdDiaria;

    public Diaria(){

    }

    public Diaria(double qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
    }

    public double getQtdDiaria() {return qtdDiaria;}
    public void setQtdDiaria(double qtdDiaria) {this.qtdDiaria = qtdDiaria;}

    public void cadastrarDespesa(String descricao, double qtdDiaria)
    {
        qtdDiaria = 0;
        super.cadastrarDespesa(descricao);
    }

    @Override
    public double calcularDespesa() {
        setValortotal(qtdDiaria * 50);
        return 0;
    }

    @Override
    public String listarDespesa() {
        return getDescricao() + "\n" + "Valor da diaria: R$ " + getValortotal();
    }
}
