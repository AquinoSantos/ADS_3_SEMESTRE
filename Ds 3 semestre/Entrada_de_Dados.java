import java.util.Scanner;

public class Entrada_de_Dados {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = sc.next();

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Seu nome é " + nome + " ,você tem " + idade + " anos.");

        sc.close();

    }

    
}
