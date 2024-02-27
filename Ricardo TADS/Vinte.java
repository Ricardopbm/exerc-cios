import java.util.Scanner;

public class Vinte {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in); 

        
        int numero;
        double porcentagem;
        double resultado;

        

        System.out.println("Digite um número:");
        numero = input.nextInt();

        porcentagem = numero * 0.2 ;

        resultado = porcentagem + numero;
        
        System.out.println("20% do número inserido é: " + porcentagem);
        System.out.println("O seu número mais 20% é: " + resultado);


    }

}
