import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in); 

        
        double f; 
        double res1;
        double c;

        

        System.out.println("Temperatura em Fahrenheit: ");
        f = input.nextInt();

        res1 = f - 32;
        c = res1 / 9 * 5;

        
        
        System.out.println("Aqui está a conversão para Célcius: " + c);


    }

}
