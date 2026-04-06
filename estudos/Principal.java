package estudos;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> lista = new ArrayList<>();
        int op;

        do {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Remover");
            System.out.println("5 - Pesquisar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
            case 1:
                System.out.println("1 - Cadastrar Aluno");
                System.out.println("2 - Cadastrar Professor");
                System.out.print("Escolha uma opção: ");
                int tipo = sc.nextInt();
                sc.nextLine();
                if (tipo == 1) {
                System.out.print("Digite o nome do aluno: ");
                String nomeAluno = sc.nextLine();
                System.out.print("Digite a idade do aluno: ");
                int idadeAluno = sc.nextInt();
                sc.nextLine();
                System.out.print("Digite a matrícula do aluno: ");
                String matricula = sc.nextLine();
                lista.add(new Aluno(nomeAluno, idadeAluno, matricula));
                } else if (tipo == 2) {
                System.out.print("Digite o nome do professor: ");
                String nomeProfessor = sc.nextLine();
                System.out.print("Digite a idade do professor: ");
                int idadeProfessor = sc.nextInt();
                sc.nextLine();
                System.out.print("Digite a disciplina do professor: ");
                String disciplina = sc.nextLine();
                lista.add(new Professor(nomeProfessor, idadeProfessor, disciplina));
                } else {
                System.out.println("Opção de cadastro inválida!");
                }
                break;
            case 2:
                if (lista.isEmpty()) {
                System.out.println("Lista vazia.");
                } else {
                System.out.println("Lista de pessoas:");
                for (int i = 0; i < lista.size(); i++) {
                    Pessoa p = lista.get(i);
                    System.out.println("Registro " + i + ":");
                    if (p instanceof Aluno) {
                    System.out.println("Tipo: Aluno");
                    System.out.println("Nome: " + p.getNome());
                    System.out.println("Idade: " + p.getIdade());
                    System.out.println("Matrícula: " + ((Aluno) p).getMatricula());
                    } else if (p instanceof Professor) {
                    System.out.println("Tipo: Professor");
                    System.out.println("Nome: " + p.getNome());
                    System.out.println("Idade: " + p.getIdade());
                    System.out.println("Disciplina: " + ((Professor) p).getDisciplina());
                    }
                    System.out.println("-------------------");
                }
                }
                break;
            case 3:
                if (lista.isEmpty()) {
                System.out.println("Lista vazia.");
                } else {
                System.out.print("Digite o nome da pessoa a alterar: ");
                String nomeAlt = sc.nextLine();
                boolean alterado = false;
                for (int i = 0; i < lista.size(); i++) {
                    Pessoa p = lista.get(i);
                    if (p.getNome().equalsIgnoreCase(nomeAlt)) {
                    if (p instanceof Aluno) {
                        System.out.print("Digite o novo nome do aluno: ");
                        String nomeAluno = sc.nextLine();
                        System.out.print("Digite a nova idade do aluno: ");
                        int idadeAluno = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Digite a nova matrícula do aluno: ");
                        String matricula = sc.nextLine();
                        lista.set(i, new Aluno(nomeAluno, idadeAluno, matricula));
                    } else if (p instanceof Professor) {
                        System.out.print("Digite o novo nome do professor: ");
                        String nomeProfessor = sc.nextLine();
                        System.out.print("Digite a nova idade do professor: ");
                        int idadeProfessor = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Digite a nova disciplina do professor: ");
                        String disciplina = sc.nextLine();
                        lista.set(i, new Professor(nomeProfessor, idadeProfessor, disciplina));
                    }
                    alterado = true;
                    System.out.println("Registro alterado com sucesso!");
                    break;
                    }
                }
                if (!alterado) {
                    System.out.println("Pessoa não encontrada.");
                }
                }
                break;
            case 4:
                if (lista.isEmpty()) {
                System.out.println("Lista vazia.");
                } else {
                System.out.print("Digite o nome da pessoa a remover: ");
                String nomeRem = sc.nextLine();
                boolean removido = false;
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getNome().equalsIgnoreCase(nomeRem)) {
                    lista.remove(i);
                    System.out.println("Registro removido com sucesso!");
                    removido = true;
                    break;
                    }
                }
                if (!removido) {
                    System.out.println("Pessoa não encontrada.");
                }
                }
                break;
            case 5:
                if (lista.isEmpty()) {
                System.out.println("Lista vazia.");
                } else {
                System.out.print("Digite o nome da pessoa para pesquisar: ");
                String nomePesq = sc.nextLine();
                boolean encontrado = false;
                for (Pessoa p : lista) {
                    if (p.getNome().equalsIgnoreCase(nomePesq)) {
                    p.exibir();
                    System.out.println("-------------------");
                    encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("Pessoa não encontrada.");
                }
                }
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
            }
        } while (op != 0);

        sc.close();
    }
}
