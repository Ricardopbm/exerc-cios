import java.util.Scanner;

public class Positivonegativo {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in);  

      int num;

        System.out.print("insira oum número positivo ou negativo: ");
        num = input.nextInt(); 
        
        if( num < 0){
          System.out.println(num + " é negativo.");
        }else{
          System.out.println(num + " é positivo.");
        }

        


    }
}
