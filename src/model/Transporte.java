package model;

public class Transporte extends Despesa{
    private double kmPercorrida;
    private double valorPedagios;

    public Transporte(){

    }

    public Transporte(double kmPercorrida, double valorPedagios) {
        this.kmPercorrida = kmPercorrida;
        this.valorPedagios = valorPedagios;
    }

    public double getValorPedagios() {return valorPedagios;}
    public void setValorPedagios(double valorPedagios) {this.valorPedagios = valorPedagios;}

    public double getKmPercorrida() {return kmPercorrida;}
    public void setKmPercorrida(double kmPercorrida) {this.kmPercorrida = kmPercorrida;}

    public void cadastrarDespesa(String descricao, double valorPedagios, double kmPercorrida)
    {
        valorPedagios = 0;
        this.kmPercorrida = kmPercorrida;
        super.cadastrarDespesa(descricao);
    }

    @Override
    public double calcularDespesa() {
        setValortotal((kmPercorrida * 3) + valorPedagios);
        return 0;
    }

    @Override
    public String listarDespesa() {
        return getDescricao() + "\n" + "Valor do transporte: R$ " + getValortotal();
    }
}
