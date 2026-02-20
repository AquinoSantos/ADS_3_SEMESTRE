import java.util.Scanner;


public class atvd_5 {

    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");


        String senha = "python123";

        senha = sc.nextLine();

        if(senha.equals("python123"))
            {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }
    }
}
