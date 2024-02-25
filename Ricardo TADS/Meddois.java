import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in); 

        
        double nota1; 
        double nota2;
        double soma;
        double media;


        

        System.out.println("Digite a primeira nota:");
        nota1 = input.nextInt();

        System.out.println("Digite a segunda nota:");
        nota2 = input.nextInt();

        soma = nota1 + nota2;
        media = soma / 2;

        System.out.println("Sua média é: " + media);


    }

}
