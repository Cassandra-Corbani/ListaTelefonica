import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean estaAtivo = true;
        String entrada;
        Scanner s = new Scanner(System.in);
        String[][] listaTelefonica = new String[100][2];
        int totalContatos = 0;
        while (estaAtivo) {
            System.out.println("Digite o que deseja:\n" +
                    "1 - Adicionar contato\n" +
                    "2 - Buscar contato\n" +
                    "3 - Lista de contatos\n" +
                    "4 - Remover contatos\n" +
                    "x - Sair");
            entrada = s.nextLine();
            switch (entrada) {
                case "1":

                    boolean querContinuar = true;
                    while (querContinuar && totalContatos < listaTelefonica.length) {
                        System.out.println("Digite o nome do contato:");
                        String nome = s.nextLine();

                        System.out.println("Digite o telefone:");
                        String telefone = s.nextLine();


                        listaTelefonica[totalContatos][0] = nome;
                        listaTelefonica[totalContatos][1] = telefone;
                        totalContatos++;

                        System.out.println("Contato adicionado com sucesso!");

                        System.out.println("Deseja adicionar outro contato? (s/n)");
                        String resposta = s.nextLine();

                        if (resposta.equalsIgnoreCase("n")) {
                            querContinuar = false;
                        }
                    }

                    if (totalContatos == listaTelefonica.length) {
                        System.out.println("A agenda está cheia.");
                    }

                    break;

                case "x":
                    estaAtivo = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        System.out.println("Você saiu do programa.");
        s.close();
    }
}