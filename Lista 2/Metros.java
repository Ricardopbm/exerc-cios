import java.util.Scanner;

public class Metros {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in); 

        
        int metros; 
        int centimetros;

        

        System.out.println("Insira uma medida em metros:");
        metros = input.nextInt();

        centimetros = metros * 100;
        System.out.println(metros + " é equivalente a " + centimetros + "cm");


    }

}
