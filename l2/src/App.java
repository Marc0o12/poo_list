import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception{
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        int java = 0;

        Scanner ler = new Scanner(System.in);
        int op;
        do{
    
            System.out.println("--------------------------------------");
            System.out.println("Menu Principal");
            System.out.println("--------------------------------------");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar notas");
            System.out.println("3 - Calcular Medias");
            System.out.println("4 - Informar Situacoes");
            System.out.println("5 - Informar dados de um aluno");
            System.out.println("6 - Alterar nota");
            System.out.println("7 - Sair");

            op = ler.nextInt();    
        
            switch(op){
                case 1:
                    int i = 0;
                    Aluno a = new Aluno();
                    System.out.print("Nome: ");
                    a.setNome(ler.nextLine());
                    if(i == 0) ler.nextLine();
                    System.out.print("Matrícula: ");
                    a.setMatricula(Integer.parseInt(ler.nextLine()));
                    alunos.add(a);
                    i++;

                break;
                case 2:
                    Float n1, n2, n3;
                    for (Aluno aluno : alunos) {
                        System.out.println("Nota 1, 2 e 3 de " + aluno.getNome() + ": ");
                        n1 = (ler.nextFloat());
                        n2 = (ler.nextFloat());
                        n3 = (ler.nextFloat());
                        aluno.setNotas(n1, n2, n3);

                    }
                break;
                case 3:
                    for (Aluno aluno : alunos){
                        aluno.calcularMedias();
                    }
                break;
                case 4:

                break;
                case 5:
                    int mat; 
                    System.out.println("informe a matricula do aluno: ");
                    mat = ler.nextInt();
                    for (Aluno aluno : alunos){
                        if(mat == aluno.getMatricula()){
                            System.out.println(aluno.toString());
                        }else{
                            System.out.println("Aluno não encontrado");
                        }
                    }

                break;
                case 6:

                break;
                case 7:

                break;
                default:
                System.out.println("Opcao nao encontrada...");

            }
        }while(op != 7);
    }
}
