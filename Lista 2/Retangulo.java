import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in); 

        
        int base, altura, area, perimetro; 


        System.out.println("Insira a base e a altura do seu retângulo:");
        base = input.nextInt(); 
        altura = input.nextInt();

        area = base * altura;
        perimetro = (base * 2) + (altura* 2);

        System.out.println("A área do seu retângulo é igual a: " + area + "\nO perímetro do seu reângulo é igual a: " + perimetro);


    }

}
