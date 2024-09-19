package principal;

import model.Alimentacao;
import model.Diaria;
import model.Transporte;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Gerenciador de despesas" +
                "\n1 - Alimentacao" +
                "\n2 - Transporte" +
                "\n3 - Refeicao" +
                "\n0 - Sair" +
                "\nEscolha o tipo de despesa");

        int op = scan.nextInt();
        switch (op)
        {
            case '1':
                Alimentacao despAlimentacao = new Alimentacao();
                System.out.println("Descreva a despesa, quantas alimentasções e o nome do restaurante");
                despAlimentacao.cadastrarDespesa(scan.next(), scan.nextInt(), scan.next());
                break;
            case '2':
                Transporte despTransporte = new Transporte();
                System.out.println("Descreva a depesa, o valor dos pedágios e a kms percorridos");
                despTransporte.cadastrarDespesa(scan.next(), scan.nextDouble(), scan.nextDouble());
                break;
            case '3':
                Diaria despDiaria = new Diaria();
                System.out.println("Descreva a despesa e o valor da diária");
                despDiaria.cadastrarDespesa(scan.next(), scan.nextDouble());
                break;
            case '0':
                System.out.println("--------------Obrigado por usar nosso sistema---------------");
                break;
            default:
                System.out.println("Digite um valor válido!");
                break;
        }





    }
}