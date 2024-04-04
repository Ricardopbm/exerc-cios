import java.util.Scanner;

public class Simulado9{
    public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);

    float imc, altura, peso;

    System.out.println("Insira sua altura em metros e seu peso em kg: ");
    altura = in.nextFloat();
    peso = in.nextFloat();

    imc = peso / (altura * altura);

    System.out.printf("IMC = %.2f", imc);


    }
}