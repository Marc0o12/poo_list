import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Calcular> numero = new ArrayList<Calcular>();
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0; i<6; i++){
            Calcular n = new Calcular();
            System.out.println("Diga o numeros: ");
            n.setNum(ler.nextInt());
            numero.add(n);
        }

        for (Calcular num2:numero) {
            num2.calSoma();
        }
        for (Calcular nume:numero) {
            nume.calMedia();
        }
        for (Calcular num:numero) {
            num.calMaior();
        }
        for (Calcular num:numero) {
            num.calMenor();
        }
    }    
}