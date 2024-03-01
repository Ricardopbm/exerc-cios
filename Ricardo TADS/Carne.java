import java.util.Scanner;

public class Carne {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in); 

        
        double quantHomens; //feito
        double quantMulheres; //feito
        double quantCriancas; //feito
        double carneHomem;  //feito
        double carnemulher; //feito
        double carneCriancas; //feito
        double soma; //feito
        double media; //feito
        double mediafinal;

        System.out.println("Quantidade de homens: ");
        quantHomens = input.nextInt();
        carneHomem = quantHomens * 400;

        System.out.println("Quantidade de mulheres: ");
        quantMulheres = input.nextInt();
        carnemulher = quantMulheres * 320;

        System.out.println("Quantidade de crianças: ");
        quantCriancas = input.nextInt();
        carneCriancas = quantCriancas * 200;


        soma = carneHomem + carnemulher + carneCriancas;
        media = soma / 3;
        mediafinal = media * 0.2;
        

        System.out.println("A quantidade de carne a ser adiquirida é: " + mediafinal + "kg");


    }

}
