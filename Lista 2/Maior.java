import java.util.Scanner;

public class Maior{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int valor1, valor2;

    System.out.println("Digite dois numeros inteiros: ");
    valor1 = input.nextInt(); valor2 = input.nextInt();

    if (valor1 < valor2){
      System.out.println("a váriavel valor2 " + valor2 + " é maior." );
    } else {
      System.out.println("a váriavel valor1 " + valor1 + " é maior." );
    }
    
  }
}