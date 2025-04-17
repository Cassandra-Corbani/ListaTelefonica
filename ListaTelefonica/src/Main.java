import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean estaAtivo = true;
        String entrada;

        Scanner s = new Scanner(System.in);

        // MATRIZ com nome e telefone
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
                    // Loop para adicionar contatos até que o usuário não queira mais
                    boolean querContinuar = true;
                    while (querContinuar && totalContatos < listaTelefonica.length) {
                        System.out.println("Digite o nome do contato:");
                        String nome = s.nextLine();

                        System.out.println("Digite o telefone:");
                        String telefone = s.nextLine();

                        // Adiciona o contato na matriz
                        listaTelefonica[totalContatos][0] = nome;
                        listaTelefonica[totalContatos][1] = telefone;
                        totalContatos++;

                        System.out.println("Contato adicionado com sucesso!");

                        // Pergunta se deseja adicionar outro
                        System.out.println("Deseja adicionar outro contato? (s/n)");
                        String resposta = s.nextLine();

                        if (resposta.equalsIgnoreCase("n")) {
                            querContinuar = false;
                        }
                    }

                    // Verifica se a agenda está cheia
                    if (totalContatos == listaTelefonica.length) {
                        System.out.println("A agenda está cheia.");
                    }

                    break;

                // Coloque outras opções do menu aqui (como buscar, listar, remover)

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