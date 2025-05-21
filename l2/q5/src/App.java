package nova;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<Integer>();
        Scanner ler = new Scanner(System.in);
        int n, maior = 0, menor;
        float media = 0, soma = 0;

        for(int i = 0; i < 6; i++){
            System.out.println("Digite o numero: ");
            n = ler.nextInt();
            numero.add(n);
        }
        for(int i = 0; i < 6 ; i++){
            soma += numero.get(i);
        }
        System.out.println(soma);
        media = soma/6;
        System.out.println(media);
        for(int i = 0; i < 6 ; i++){
            if(numero.get(i) > maior){
                maior = numero.get(i);
            }
        }
        menor = maior;
        System.out.println(maior);
        for(int i = 0; i < 6 ; i++){
            if(numero.get(i) < menor){
                menor = numero.get(i);
            }
        }
        System.out.println(menor);
    }
}
