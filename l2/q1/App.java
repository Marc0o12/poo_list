import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int resp, i;
        String nomeBusca;
        boolean achou = false;

        ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();
        System.out.println("Operação, inserindo contatos ");
        do{
            Pessoa p = new Pessoa();
            System.out.println("Nome: ");
            p.setNome(ler.nextLine());
            System.out.println("Telefone: ");
            p.setTelefone(ler.nextLine());
            agenda.add(p);
            System.out.println("Deseja inserir outro contato?(1 - Sim, 2 - Nao) ");
            resp = ler.nextInt();
            ler.nextLine();
        }while(resp == 1);
        System.out.println("Operação 2: buscar contato pelo nome");
        System.out.println("Diga o nome para busca");
        nomeBusca = ler.nextLine();
        for( i = 0; i < agenda.size(); i++){
            if(agenda.get(i).getNome().equals(nomeBusca)){
                System.out.println("Contato localizado");
                System.out.println("Telefone: " + agenda.get(i).getTelefone());
                achou = true;
                System.out.println("Operação 3: Alterando");
                System.out.println("Digite o novo telefone: ");
                agenda.get(i).setTelefone(ler.nextLine());
                System.out.println("Operação 4: Excluindo");
                System.out.println("Deseja excluir o contato?(1 - SIm, 2 -Nao)");
                if(ler.nextInt() == 1){
                    agenda.remove(agenda.get(i));
                }
            }
        }
        if(!achou){
            System.out.println("Contato nao localizado");
        }
        System.out.println("Operação 5: Exibindo todos os contatos");
        for(i = 0; i < agenda.size(); i++){
            System.out.println("Contato: "+ i);
            System.out.println("Nome: "+agenda.get(i).getNome());
            System.out.println("Telefone: "+agenda.get(i).getTelefone());
            System.out.println("----------------------------------------");
        }

        System.out.println("Fim do programa");
    }
}