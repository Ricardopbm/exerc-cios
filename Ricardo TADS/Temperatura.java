import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in); 

        
        double f; 
        double c;
        

        System.out.println("Temperatura em Fahrenheit: ");
        f = input.nextInt();
        c = (f - 32) / 9 * 5;
        
        
        System.out.println("Aqui está a conversão para Célcius: " + c);


    }

}
