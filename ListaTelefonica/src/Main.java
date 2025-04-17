import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        boolean estaAtivo = true;
        String entrada;

        Scanner s = new Scanner(System.in);
        String[][] listaTelefonica = new String[100][2]; // até 100 contatos
        int totalContatos = 0;

        while (estaAtivo) {
            System.out.println("Digite o que deseja:\n" +
                    "1 - Adicionar contato\n" +
                    "2 - Buscar contato\n" +
                    "3 - Lista de contatos\n" +
                    "4 - Remover contatos \n" +
                    "x - sair");
            entrada = s.nextLine();

            boolean querContinuar = true;
            switch (entrada) {
                case "1":
                    if (totalContatos < listaTelefonica.length) {
                        System.out.println("Digite o nome do contato:");
                        String nome = s.nextLine();

                        System.out.println("Digite o telefone:");
                        String telefone = s.nextLine();

                        listaTelefonica[totalContatos][0] = nome;
                        listaTelefonica[totalContatos][1] = telefone;
                        totalContatos++;

                        System.out.println("Contato adicionado com sucesso!");
                    } else {
                        System.out.println("A agenda está cheia. Não é possível adicionar mais contatos.");
                    }
                    break;
            }
        }
    }
}
