import java.util.Scanner;

public class Votos {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in); 

        
        double vi;

        double vid;

        double ns1;
        double ns;

        double nc1; 
        double nc;

        double np1;
        double np;



        System.out.println("Insira o valor do ingresso inteiro: ");
        vi = input.nextInt();
        

        System.out.println("Insira o número de sócios participando do evento: ");
        ns1 = input.nextInt();
        ns = vi * 0.3 * ns1;

        System.out.println("Insira o número de crianças participando do evento: ");
        nc1 = input.nextInt();
        nc = nc1 * vi;

        System.out.println("Insira o número de pessoas acima de 10 anos, não sócios, participando do evento: ");
        np1 = input.nextInt();
        np = np1 * vi;


        double publicot = ns1 + nc1 + np1;
        double renda = ns + np;
        double deficit = ns1 * vi + nc + np;

        System.out.println("O Público total foi de: " + publicot + " de pessoas.");
        System.out.println("A renda total foi de: " + renda + "R$.");
        System.out.println("O valor que deixou de ser adiquirido, devido a descontos e isenções foi de: " + deficit + "R$");



    }

}
