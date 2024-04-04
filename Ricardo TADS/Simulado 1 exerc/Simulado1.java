import java.util.Scanner;

 public class Simulado1{

    public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    int ingresso, pagantes, socios, criancas, publicoTotal;
    float renda, rendaPerdida;

    System.out.println("Insira o valor do ingresso, o numero de pessoas pagantes, criancas e sócios que estiveram no evento:");
    ingresso = in.nextInt();
    pagantes = in.nextInt();
    criancas = in.nextInt();
    socios = in.nextInt();

    publicoTotal = pagantes + criancas + socios;
    renda = (socios * ingresso * 0.7f) + (pagantes * ingresso);
    rendaPerdida = (publicoTotal * ingresso) - renda;

    System.out.println("Publico total:" + publicoTotal);
    System.out.println("Renda total: R$" + renda);
    System.out.println("Renda Perdida total: R$" + rendaPerdida);



    

    }
 }