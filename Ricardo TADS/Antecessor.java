import java.util.Scanner;

public class Antecessor {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in); 

        
        int numero; 
        int resultado;

        

        System.out.println("Digite um número inteiro:");
        numero = input.nextInt();

        resultado = numero - 1;
        System.out.println("O antecessor é: " + resultado);


    }

}

