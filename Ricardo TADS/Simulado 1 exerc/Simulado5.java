import java.util.Scanner;

public class Simulado5{
    public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);

    int n1, n2, n3;
    int q1, q2, q3, saque;

    System.out.println("Insira o valor das notas disponíveis e o valor a sacar: ");
    n1 = in.nextInt();
    n2 = in.nextInt();
    n3 = in.nextInt();
    saque = in.nextInt();

    q3 = saque / n3;
    saque = saque % n3;

    q2 = saque / n2;
    saque = saque % n2;

    q1 = saque / n1;


    System.out.printf("%d x R$ %d,00\n", q1, n1);
    System.out.printf("%d x R$ %d,00\n", q2, n2);
    System.out.printf("%d x R$ %d,00\n", q3, n3);


    }
}