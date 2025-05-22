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
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar notas");
            System.out.println("3 - Calcular Medias");
            System.out.println("4 - Informar Situacoes");
            System.out.println("5 - Informar dados de um aluno");
            System.out.println("6 - Alterar nota");
            System.out.println("7 - Sair");

            op = ler.nextInt();    
            ler.nextLine();
        
            switch(op){
                case 1:
                    int i = 0;
                    Aluno a = new Aluno();
                    System.out.print("Nome: ");
                    a.setNome(ler.nextLine());
                    System.out.print("Matrícula: ");
                    a.setMatricula(Integer.parseInt(ler.nextLine()));
                    alunos.add(a);
                    i++;

                break;
                case 2:
                    float n1, n2, n3;
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
                        if(aluno.getMedia() < 3){
                            aluno.setSituacao("Reprovado");
                        }else if(aluno.getMedia() >= 7){
                            aluno.setSituacao("Aprovado");
                        }else{
                            aluno.setSituacao("Em recuperação");
                        }
                    }
                break;
                case 4:
                    int matr; 
                    System.out.println("informe a matricula do aluno: ");
                    matr = ler.nextInt();
                    for (Aluno aluno : alunos){
                        if(matr == aluno.getMatricula()){
                            System.out.println(aluno.getSituacao());
                        }else{
                            System.out.println("Aluno não encontrado");
                        }
                    }
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
                    int ma, ind; 
                    System.out.println("informe a matricula do aluno: ");
                    ma = ler.nextInt();
                    for (Aluno aluno : alunos){
                        if(ma == aluno.getMatricula()){
                            System.out.println("qual nota deseja alterar?(1, 2 ou 3) ");
                            ind = ler.nextInt();
                            switch (ind) {
                                case 1:
                                    System.out.println("informe a nova nota: ");
                                    aluno.setNota1(ler.nextFloat());    
                                    aluno.calcularMedias();
                                    if(aluno.getMedia() < 3){
                                        aluno.setSituacao("Reprovado");
                                    }else if(aluno.getMedia() >= 7){
                                        aluno.setSituacao("Aprovado");
                                    }else{
                                        aluno.setSituacao("Em recuperação");
                                    }

                                break;
                                case 2:
                                    System.out.println("informe a nova nota: ");
                                    aluno.setNota2(ler.nextFloat());    
                                    aluno.calcularMedias();
                                    if(aluno.getMedia() < 3){
                                        aluno.setSituacao("Reprovado");
                                    }else if(aluno.getMedia() >= 7){
                                        aluno.setSituacao("Aprovado");
                                    }else{
                                        aluno.setSituacao("Em recuperação");
                                    }

                                break;
                                case 3:
                                    System.out.println("informe a nova nota: ");
                                    aluno.setNota3(ler.nextFloat());    
                                    aluno.calcularMedias();
                                    if(aluno.getMedia() < 3){
                                        aluno.setSituacao("Reprovado");
                                    }else if(aluno.getMedia() >= 7){
                                        aluno.setSituacao("Aprovado");
                                    }else{
                                        aluno.setSituacao("Em recuperação");
                                    }

                                break;
                                default:
                                    System.out.println("Opcao nao encontrada...");
                                break;
                            }
                        }else{
                            System.out.println("Aluno não encontrado");
                        }
                    }
                break;
                case 7:
                    System.out.println("Saindo...");
                break;
                default:
                System.out.println("Opcao nao encontrada...");

            }
        }while(op != 7);
    }
}