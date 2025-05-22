import java.util.Scanner;

public class Magico {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean ehMagico = true;
        int somaEsperada = 0;
        int somaDiagonal1 = 0;
        int N = ler.nextInt();
        int[][] matriz = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }
        for (int j = 0; j < N; j++) {
            somaEsperada += matriz[0][j];
        }
        for (int i = 0; i < N && ehMagico; i++) {
            int somaLinha = 0;
            for (int j = 0; j < N; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha != somaEsperada) {
                ehMagico = false;
            }
        }
        for (int j = 0; j < N && ehMagico; j++) {
            int somaColuna = 0;
            for (int i = 0; i < N; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna != somaEsperada) {
                ehMagico = false;
            }
        }

        for (int i = 0; i < N; i++) {
            somaDiagonal1 += matriz[i][i];
        }
        if (somaDiagonal1 != somaEsperada) {
            ehMagico = false;
        }
        int somaDiagonal2 = 0;
        for (int i = 0; i < N; i++) {
            somaDiagonal2 += matriz[i][N - 1 - i];
        }
        if (somaDiagonal2 != somaEsperada) {
            ehMagico = false;
        }
        if (ehMagico) {
            System.out.println(somaEsperada);
        } else {
            System.out.println(-1);
        }
    }
}
