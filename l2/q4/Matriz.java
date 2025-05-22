public class Matriz {
    private int[][] dados;
    private int tamanho;

    public Matriz(int tamanho) {
        this.tamanho = tamanho;
        this.dados = new int[tamanho][tamanho];
    }

    public void setValor(int linha, int coluna, int valor) {
        this.dados[linha][coluna] = valor;
    }

    public int somaDp() {
        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += dados[i][i];
        }
        return soma;
    }

    public int somaDs() {
        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += dados[i][tamanho - 1 - i];
        }
        return soma;
    }

    public int somaLinha(int linha) {
        int soma = 0;
        for (int j = 0; j < tamanho; j++) {
            soma += dados[linha][j];
        }
        return soma;
    }

    public int somaColuna(int coluna) {
        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += dados[i][coluna];
        }
        return soma;
    }

    public int getTamanho() {
        return this.tamanho;
    }
}
