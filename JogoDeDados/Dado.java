public class Dado {
    private int valorFace;

    public int getValorFace() {
        return valorFace;
    }

    public void setValorFace(int valorFace) {
        this.valorFace = valorFace;
    }

    public void rolar() {
        this.valorFace = (int)(Math.random() * 6) + 1;
    }
}
