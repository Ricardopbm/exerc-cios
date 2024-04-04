import java.util.Scanner;

public class Simulado2{
    public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    float valorFabrica, distribuidor, imposto, valorFinal;

    distribuidor = 0.28f;
    imposto = 0.45f;

    
    System.out.println("Insira o valor de fábrica do carro: ");
    valorFabrica = in.nextFloat();

    valorFinal = (valorFabrica * distribuidor) + (valorFabrica * imposto) + valorFabrica;

    System.out.println("Valor do carro: R$" + valorFinal);

    }
}