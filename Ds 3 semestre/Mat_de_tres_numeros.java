import java.util.Scanner;

public class Mat_de_tres_numeros {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int n3 = sc.nextInt();

        int soma = n1 + n2 + n3;
        double media = soma / 3.0;

        
        System.out.println("Média Aritmética: " + media);

        sc.close();
    }
}
