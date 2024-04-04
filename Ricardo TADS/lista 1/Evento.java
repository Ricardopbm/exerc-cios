import java.util.Scanner;

public class Evento {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in); 

        
        double vi; //feito

        double vid;

        double ns1;
        double ns;

        double nc1; 
        double nc;

        double np1;
        double np;


        double soma; //feito

        double media; //feito

        double mediafinal;

        System.out.println("Insira o valor do ingresso inteiro: ");
        vi = input.nextInt();
        

        System.out.println("Insira o número de sócios participando do evento: ");
        ns1 = input.nextInt();
        ns = vi * 0.3 * ns1;

        System.out.println("Insira o número de crianças participando do evento: ");
        nc1 = input.nextInt();
         

        System.out.println("Insira o número de pessoas acima de 10 anos, não sócios, participando do evento: ");
        np1 = input.nextInt();
        np = np1 * vi;


        soma = h + m + c;
        media = soma / 3;
        mediafinal = media * 0.2;
        

        System.out.println("A quantidade de carne a ser adiquirida é: " + mediafinal + "kg");


    }

}
