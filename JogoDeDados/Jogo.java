public class Jogo {
    private int qtdJogadores;
    private int resultado;
    private Dado dado1 = new Dado();
    private Dado dado2 = new Dado();
    private Jogador[] jogadores;
    private Boolean flag = false;

    public void inserirJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
        this.qtdJogadores = jogadores.length;
    }

    public void inserirApostas(int[] apostas) {
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].setValorAposta(apostas[i]);
        }
    }

    public void jogarDados() {
        dado1.rolar();
        dado2.rolar();
        resultado = dado1.getValorFace() + dado2.getValorFace();
    }

    public void mostrarResultado() {
        System.out.println("Resultado dos dados: " + resultado);
    }

    public void mostrarVencedor() {
        for (Jogador jogador : jogadores) {
            if (jogador.getValorAposta() == resultado) {
                System.out.println("Vencedor: " + jogador.getNome());
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("Ninguém acertou");
        }
    }
}
