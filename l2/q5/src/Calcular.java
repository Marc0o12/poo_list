public class Calcular {
    private int num;
    private int soma;
    private float media;
    private int maior;
    private int menor;
    private int[] ordem = new int[6];

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public int getMaior() {
        return maior;
    }

    public void setMaior(int maior) {
        this.maior = maior;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }

    public int[] getOrdem() {
        return ordem;
    }

    public void setOrdem(int[] ordem) {
        this.ordem = ordem;
    }

    public void calSoma(){
        this.soma += this.num;
    }

    public void calMedia(){
        this.media = this.soma/6;
    }

    public void calMaior(){
        int comp = 0;
        if(this.num > comp){
            this.maior = this.num;
        }
    }

    public void calMenor(){
        int comp = 100000;
        if(this.num < comp){
            this.menor = this.num;
        }
    }
}
