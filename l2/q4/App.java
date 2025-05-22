import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean ehMagico = true;
        int mat = ler.nextInt();


        if (mat <= 2 || mat >= 10) {
            System.out.println(-1);
            return;
        }

        Matriz matriz = new Matriz(mat);
        int somaEsperada = matriz.somaLinha(0);
        for (int i = 0; i < mat; i++) {
            for (int j = 0; j < mat; j++) {
                int valor = ler.nextInt();
                if (valor <= 0 || valor >= 1000) {
                    System.out.println(-1);
                    return;
                }
                matriz.setValor(i, j, valor);
            }
        }
        for (int i = 0; i < mat && ehMagico; i++) {
            if (matriz.somaLinha(i) != somaEsperada) {
                ehMagico = false;
            }
        }
        for (int j = 0; j < mat && ehMagico; j++) {
            if (matriz.somaColuna(j) != somaEsperada) {
                ehMagico = false;
            }
        }
        if (matriz.somaDp() != somaEsperada || matriz.somaDs() != somaEsperada) {
            ehMagico = false;
        }

        if(ehMagico == true){
            System.out.println(somaEsperada);

        }else{
            System.out.println("-1");
        }
    }
}
