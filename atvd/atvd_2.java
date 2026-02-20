import java.util.Scanner;

public class atvd_2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int idade = 0;
        
        System.out.println("Digite sua idade: ");
        
        idade = sc.nextInt();

        
        if (idade >= 0 && idade <= 12) {
            System.out.println("Você é uma criança.");
        } 
         else if (idade > 12 && idade <= 18) {
            System.out.println("Você é um adolescente.");
        }
         else if (idade > 18 && idade <= 60) {
            System.out.println("Você é um adulto.");
        }
         else if (idade > 60) {
            System.out.println("Você é um idoso.");
        }
         else {
            System.out.println("Idade inválida.");

        }

    }
}
