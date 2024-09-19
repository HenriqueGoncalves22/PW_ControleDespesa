package model;

public class GerenciadorDespesa {
    private int qtdeAlimentacao;
    private int qtdeTransporte;
    private int qtdeDiaria;
    private double totalAlimentacao;
    private double totalTranporte;
    private double totalDiaria;
    private double totalDespesas;

    public void analizarDespesa(Despesa despesa)
    {
        if(despesa instanceof Alimentacao){
           qtdeAlimentacao++;
           totalAlimentacao += despesa.calcularDespesa();
        }
        else if(despesa instanceof Transporte){
            qtdeTransporte++;
            totalTranporte += despesa.calcularDespesa();
        }
        else {
            qtdeDiaria++;
            totalDiaria += despesa.calcularDespesa();
        }
        totalDespesas += totalDiaria + totalAlimentacao + totalTranporte;
    }
    public double getTotalDespesas() {return totalDespesas;}
}
