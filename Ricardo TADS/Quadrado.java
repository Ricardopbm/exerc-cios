import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in); 

        
        int numero; 
        int resultado;

        

        System.out.println("Digite um número:");
        numero = input.nextInt();

        resultado = numero * numero;
        System.out.println("Seu dobro é: " + resultado);


    }

}
