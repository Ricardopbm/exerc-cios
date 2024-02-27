import java.util.Scanner;

public class Vinte {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in); 

        
        double base; 
        double altura;
        double resultado;

        

        System.out.println("Comprimento da base de seu triângulo:");
        base = input.nextInt();

        System.out.println("Altura do seu Triângulo:");
        altura = input.nextInt();

        resultado = base * altura / 2;
        
        System.out.println("A área do seu triângulo é: " + resultado);


    }

}
