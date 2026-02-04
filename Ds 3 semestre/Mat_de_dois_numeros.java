import java.util.Scanner;

public class Mat_de_dois_numeros {

    public static void main( String [] args ){

        Scanner sc = new Scanner(System.in);

        System.out.print( "Digite o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.print( "Digite o segundo numero: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;
        int sub = n1 - n2;
        int div = n1 / n2;
        int mult = n1 * n2;
        double media = (n1 + n2) / 2;

        System.out.println( "Soma: " + soma );
        System.out.println( "Subtração: " + sub );
        System.out.println( "Divisão: " + div );
        System.out.println( "Multiplicação: " + mult );
        System.out.println("Média Aritmetica :" + media);





        sc.close();

    }

}
