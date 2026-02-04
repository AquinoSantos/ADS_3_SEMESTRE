import java.util.Scanner;

public class Calc_trabalho {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a força aplicada: ");
        double forca = sc.nextDouble();

        System.out.print("Digite a distância percorrida: ");
        double distancia = sc.nextDouble();

        double trabalho = forca * distancia;

        System.out.println("O trabalho realizado é: " + trabalho);

        sc.close();
    }
}
