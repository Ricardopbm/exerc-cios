import java.util.Scanner;

public class Viagem {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in); 

        
        double velocidademedia; 
        double distancia;
        double horas;
        double minutos;


        

        System.out.println("Digite a velocidade média do veículo, em Km/h:");
        velocidademedia = input.nextInt();

        System.out.println("Digite a distância até o local desejado, em Km:");
        distancia = input.nextInt();

        horas = distancia / velocidademedia;
        minutos = horas * 60;
        

        System.out.println("Sua viagem levará: " + horas);
        System.out.println("horas \nQue em minutos são: " + minutos);


    }

}
