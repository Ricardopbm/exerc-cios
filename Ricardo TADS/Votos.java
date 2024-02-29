mport java.util.Scanner;

 public class Votos {
    public static void main(String[] args) {
        
        Scanner in;

        in = new Scanner(System.in);    
        
        
        double eleitores, validos, brancos, nulos, percValidos, percBrancos, percNulos;

        System.out.println("Digite o número total de eleitores:");
        eleitores = in.nextInt();
        System.out.println("Digite o número total de votos válidos:");
        validos = in.nextInt();
       System.out.println("Digite o número total de votos brancos:");
        brancos = in.nextInt();
        System.out.println("Digite o número total de votos nulos:");
        nulos = in.nextInt();

        percValidos = validos / eleitores * 100;
        percBrancos = brancos / eleitores * 100;
        percNulos = nulos / eleitores * 100;
        
        System.out.println("Dos " + (int)eleitores + " eleitores:");
        System.out.println(percValidos + "% (" + (int)validos + ") são válidos;");
        System.out.println(percBrancos + "% (" + (int)brancos + ") são brancos;");
        System.out.println(percNulos + "% (" + (int)nulos + ") são nulos;");
    }
 }
}
