import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception{
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        Scanner ler = new Scanner(System.in);
        int op;
        do{
    
        System.out.println("--------------------------------------");
        System.out.println("Menu Principal");
        System.out.println("--------------------------------------");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Cadastrar notas");
        System.out.println("3 - Calcular Medias");
        System.out.println("4 - Informar Situacoes");
        System.out.println("5 - Informar dados de um aluno");
        System.out.println("6 - Alterar nota");
        System.out.println("7 - Sair");

        op = ler.nextInt();    
        
        switch(op){
            case 1:
            break;
        }
        }
    }
}
