import java.util.Scanner;

public class Votos {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in); 

        
        double ne; 
        double nv;
        double nb;
        double nn;


        System.out.println("Digite o número total de eleitores: ");
        ne = input.nextInt();

        System.out.println("Digite o número de votos válidos: ");
        nv = input.nextInt();

        System.out.println("Digite o número de votos em branco: ");
        nb = input.nextInt();

        System.out.println("Digite o número de votos nulos: ");
        nn = input.nextInt();

        double pv;
        double pb;
        double pn;

        pv = nv / ne;
        pb = nb / ne;
        pn = nn / ne;

        double pvp = pv * 100; 
        double pbp = pb * 100;
        double pnp = pn * 100;

        System.out.print("O percentual de votos válidos é: " + pvp + "% \n");
        System.out.print("O percentual de votos em branco é: " + pbp + "% \n");
        System.out.print("O percentual de votos nulos é: " + pnp + "% \n");


    }

}