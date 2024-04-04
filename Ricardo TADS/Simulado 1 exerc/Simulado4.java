import java.util.Scanner;

public class Simulado4{
    public static void main(String[] args){

    Scanner in = new Scanner(System.in);
       
    int l1, l2, l3; // l = lado
    String triangulo;

    System.out.println("Insira a medida dos 3 lados: ");
    l1 = in.nextInt();
    l2 = in.nextInt();
    l3 = in.nextInt();

    if(l1 == l2 && l1 == l3){
        System.out.println("Equilatero");
    }else if(l1 == l2 || l2 == l3 || l3 == l1){
        System.out.println("Isoceles");
    }else{
         System.out.println("Escaleno");
    }


    }
}