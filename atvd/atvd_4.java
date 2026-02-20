import java.util.Scanner;



public class atvd_4 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = 0;
        int b = 0;



        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();

        if (a > b) {
            System.out.println( "A é maior que B.");
        } else if (b > a) {
            System.out.println("B é maior que A! ");
        } else {
            System.out.println("Os números são iguais.");
        }

    }
}
