import java.util.Scanner;

public class Simulado3{
    public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);

    float nota1, nota2, optativa, media;
    String situacao;

    System.out.println("Insira as notas das duas primeiras avaliações e da optativa, caso não tenha feito a optativa, nolugar da nota insira -1");
    nota1 = in.nextFloat();
    nota2 = in.nextFloat();
    optativa = in.nextFloat();

    if(optativa == -1){
        media = (nota1 + nota2) / 2;
    } else if(nota1 <= nota2){
        media = (optativa + nota2) / 2;
    }else{
        media = (nota1 + optativa) / 2;
    }

    if(media >= 6.0){
        situacao = "APROVADO";
    }else if(media < 3.0){
        situacao = "REPROVADO";
    }else{
        situacao = "EXAME";
    }

    System.out.println("Media: " + media);
    System.out.println("Situação: " + situacao);

    }
}