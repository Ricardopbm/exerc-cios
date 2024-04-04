import java.util.Scanner;

public class Divisao{
    public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    int numerador, denominador;
    double resultado;

    System.out.println("Digite o numerador e o denominador (denominador diferente de zero): ");
    numerador = in.nextInt();
    denominador = in.nextInt();

    
    
    if(denominador == 0){
        System.out.println(" ERRO. \n DENOMINADOR = 0 ");
    } else {
         resultado = numerador / denominador;
        System.out.println("O resultado da sua divisão é: " + resultado);
    }
 

    }
}