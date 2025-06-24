import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Criando dados
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        System.out.print("Quantos jogadores vão apostar? ");
        int qtd = ler.nextInt();
        ler.nextLine(); // Limpa buffer

        Jogador[] jogadores = new Jogador[qtd];

        // Coleta os dados dos jogadores
        for (int i = 0; i < qtd; i++) {
            jogadores[i] = new Jogador();

            System.out.print("Nome do jogador " + (i + 1) + ": ");
            jogadores[i].setNome(ler.nextLine());

            int aposta;
            do {
                System.out.print("Aposta (soma entre 2 e 12): ");
                aposta = ler.nextInt();
                ler.nextLine();
            } while (aposta < 2 || aposta > 12);

            jogadores[i].setValorAposta(aposta);
        }

        // Rola os dados
        dado1.rolar();
        dado2.rolar();
        int resultado = dado1.getValorFace() + dado2.getValorFace();

        System.out.println("\n--- Resultado dos Dados ---");
        System.out.println("Dado 1: " + dado1.getValorFace());
        System.out.println("Dado 2: " + dado2.getValorFace());
        System.out.println("Soma: " + resultado);

        // Verifica os vencedores
        boolean houveVencedor = false;
        System.out.println("\n--- Resultado das Apostas ---");
        for (Jogador jogador : jogadores) {
            if (jogador.getValorAposta() == resultado) {
                System.out.println("Vencedor: " + jogador.getNome());
                houveVencedor = true;
            }
        }

        if (!houveVencedor) {
            System.out.println("Ninguém acertou a aposta.");
        }

        ler.close();
    }
}
