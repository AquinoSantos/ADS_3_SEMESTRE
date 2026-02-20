import java.util.Scanner;

public class atvd_3 {
    

    public static void main(String[] args) {
        

        Scanner temperatura = new Scanner(System.in);

        double temp = 0;

        System.out.println("Digite a temperatura : ");

        temp = temperatura.nextDouble();

        if (temp < 15) {
            System.out.println("Está frio.");
        } else if (temp >= 15 && temp <=25) {
            System.out.println("Está agradável.");
        } else {
            System.out.println("Está quente.");
        }

    }
}
