import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Animal> animais = new ArrayList<>();

            int opcao;

            do {
                System.out.println("\n1 - Adicionar animal");
                System.out.println("2 - Emitir som");
                System.out.println("3 - Sair");
                System.out.print("Escolha: ");

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:{
                        System.out.println("1 - Cachorro");
                        System.out.println("2 - Gato");

                        int tipo = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();

                        if (tipo == 1) {
                            animais.add(new Cachorro(nome));
                        } else if (tipo == 2) {
                            animais.add(new Gato(nome));
                        }
                    }
                    case 2: {
                        for (int i = 0; i < animais.size(); i++) {
                            System.out.println(i + " - " + animais.get(i).getNome());
                        }

                        int escolha = scanner.nextInt();
                        animais.get(escolha).fazerSom();
                    }
                }

            } while (opcao != 3);
        }
    }
}