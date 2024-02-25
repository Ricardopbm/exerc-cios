import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in); 

        
        double h1; //feito
        double m1; //feito
        double c1; //feito
        double h;  //feito
        double m; //feito
        double c; //feito
        double soma; //feito
        double media; //feito
        double mediafinal;

        System.out.println("Quantidade de homens: ");
        h1 = input.nextInt();
        h = h1 * 400;

        System.out.println("Quantidade de mulheres: ");
        m1 = input.nextInt();
        m = m1 * 320;

        System.out.println("Quantidade de crianças: ");
        c1 = input.nextInt();
        c = c1 * 200;


        soma = h + m + c;
        media = soma / 3;
        mediafinal = media * 0.2;
        

        System.out.println("A quantidade de carne a ser adiquirida é: " + mediafinal + "kg");


    }

}
