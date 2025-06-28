import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<>();
        String[] dadosLinha;
        boolean entradaValida;
        final String caminhoCSV = "utils\\jogadores.csv";

        MyFileHandle.read(caminhoCSV);

        System.out.print("Quantos jogadores vão participar? ");
        int qtd = ler.nextInt();
        ler.nextLine(); // limpa buffer

        if (qtd < 1 || qtd > 11) {
            System.out.println("Número de jogadores inválido. Encerrando o jogo.");
            return;
        }

        for (int i = 0; i < qtd; i++) {
            Jogador jogador = new Jogador();

            System.out.print("Nome do jogador " + (i + 1) + ": ");
            jogador.setNome(ler.nextLine());

            do {
                entradaValida = true;
                System.out.print("ID: ");
                int id = ler.nextInt();
                jogador.setId(id);
                ler.nextLine(); // limpa buffer

                for (String linha : MyFileHandle.lines) {
                    if (linha.trim().isEmpty()) continue;

                    dadosLinha = linha.split(";");
                    if (dadosLinha.length < 2) continue;

                    try {
                        int idArquivo = Integer.parseInt(dadosLinha[0]);
                        String nomeArquivo = dadosLinha[1];

                        if (id == idArquivo && !jogador.getNome().equals(nomeArquivo)) {
                            entradaValida = false;
                            System.out.println("ID já existe com nome diferente. Tente outro ID.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Linha inválida no arquivo, ignorando: " + linha);
                    }
                }
            } while (!entradaValida);

            do {
                System.out.print("Aposta (entre 2 e 12): ");
                jogador.setValorAposta(ler.nextInt());
                ler.nextLine(); // limpa buffer
            } while (jogador.getValorAposta() < 2 || jogador.getValorAposta() > 12);

            jogadores.add(jogador);
        }

        // Executa o jogo
        Jogo jogo = new Jogo();
        jogo.jogarDados();
        jogo.mostrarResultado();

        for (Jogador j : jogadores) {
            jogo.mostrarVencedor(j.getNome(), j.getValorAposta());
        }

        ArrayList<Jogador> vencedores = new ArrayList<>();

        for (Jogador j : jogadores) {
            int soma = jogo.jogarDados();
            if (j.getValorAposta() == soma) {
                j.setWinner(1);
                vencedores.add(j);
            }
        }

        for (Jogador vencedor : vencedores) {
            MyFileHandle.write(caminhoCSV, vencedor.toString() + "\n", true);
        }

        if (vencedores.isEmpty()) {
            System.out.println("Nenhum jogador venceu nesta rodada.");
        } else {
            System.out.println("Vencedores registrados no arquivo:");
            for (Jogador vencedor : vencedores) {
                System.out.println("- " + vencedor.getNome() + " (ID: " + vencedor.getId() + ")");
            }
        }
    }
}
