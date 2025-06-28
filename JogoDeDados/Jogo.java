import java.util.ArrayList;

public class Jogo {
    private int qtdJogadores;
    private int resultado;
    private Dado dado1 = new Dado();
    private Dado dado2 = new Dado();
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    private Boolean flage = false;

    /*public void inserirJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
        this.qtdJogadores = jogadores.length;
    }

    public void inserirApostas(int[] apostas) {
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].setValorAposta(apostas[i]);
        }
    }*/

    public int jogarDados() {
        dado1.rolar();
        dado2.rolar();
        resultado = dado1.getValorFace() + dado2.getValorFace();
        return resultado;
    }

    public void mostrarResultado() {
        System.out.println("Resultado dos dados: " + resultado);
    }

    public void mostrarVencedor(String nam, int ap) {
        if (ap == resultado) {
            System.out.println("Vencedor: " + nam);
            flage = true;
        }
    }
    public Boolean verficaId(String nam, int ap, String id, int id2) {
        if(flage == true && Integer.parseInt(id) == id2){
            return true;
        }
        return false;
    }
}
