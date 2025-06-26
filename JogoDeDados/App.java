import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos jogadores vão participar? ");
        int qtd = scanner.nextInt();
        scanner.nextLine(); // limpa buffer

        if (qtd < 1 || qtd > 11) {
            System.out.println("Número de jogadores inválido. Encerrando o jogo.");
            return;
        }

        Jogador[] jogadores = new Jogador[qtd];
        int[] apostas = new int[qtd];

        // Coletar nome e aposta de cada jogador
        for (int i = 0; i < qtd; i++) {
            jogadores[i] = new Jogador();

            System.out.print("Nome do jogador " + (i + 1) + ": ");
            jogadores[i].setNome(scanner.nextLine());

            int aposta;
            do {
                System.out.print("Aposta (entre 2 e 12): ");
                aposta = scanner.nextInt();
                scanner.nextLine(); // limpa buffer
            } while (aposta < 2 || aposta > 12);

            apostas[i] = aposta;
        }

        // Criar e configurar o jogo
        Jogo jogo = new Jogo();
        jogo.inserirJogadores(jogadores);
        jogo.inserirApostas(apostas);

        // Jogar os dados
        jogo.jogarDados();
        jogo.mostrarResultado();
        jogo.mostrarVencedor();

        scanner.close();
    }
}
