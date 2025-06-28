public class Jogador {
    private String nome;
    private int valorAposta;
    private int id;
    private int winner = 1;

    public String getNome() {
    return nome;
    }
    public void setNome(String nome) {
    this.nome = nome;
    }
    public int getValorAposta() {
    return valorAposta;
    }
    public void setValorAposta(int valorAposta) {
    this.valorAposta = valorAposta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    @Override
    public String toString(){
        return "/n" + this.id + ";" + this.nome + ";" + this.winner + "\n";
    }
}
