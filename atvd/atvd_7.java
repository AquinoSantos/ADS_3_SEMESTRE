import java.util.Scanner;

public class atvd_7 {

    public static void main(String[] args) 
    
    {
        Scanner sc = new Scanner(System.in);

        double salario = 0;

        System.out.println("Digite o salario: ");
        salario = sc.nextDouble();

        if(salario > 5000){
            System.out.println("Salario alto");
        } else {
            System.out.println("Salario dentro da media");
        }
    }
}
    