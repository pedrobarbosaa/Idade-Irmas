import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a primeira idade");
        int idade1 = leitura.nextInt();
        System.out.println("Digite a segunda idade");
        int idade2 = leitura.nextInt();
        System.out.println("Digite a terceira idade");
        int idade3 = leitura.nextInt();

        //utilizando o método Math.min e max a entrada será calculada por meio do máximo e do mínimo valor entre as váriaveis
        int idadeCamila = idade1 + idade2 + idade3 - Math.min(Math.min(idade1, idade2), idade3) - Math.max(Math.max(idade1, idade2), idade3);
        System.out.println("Camila tem " + idadeCamila + " anos.");
    }
}