import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Boolean flag = false;
        String[] line;
        Boolean vef;

        ArrayList<Jogador> player = new ArrayList();
        Scanner ler = new Scanner(System.in);
        MyFileHandle.read("JogoDeDados\\utils\\jogadores.csv");

        System.out.print("Quantos jogadores vão participar? ");
        int qtd = ler.nextInt();
        ler.nextLine(); // limpa buffer

        if (qtd < 1 || qtd > 11) {
            System.out.println("Número de jogadores inválido. Encerrando o jogo.");
            return;
        }

        // Coletar nome e aposta de cada jogador
        for (int i = 0; i < qtd; i++) {
            Jogador play = new Jogador();
            System.out.print("Nome do jogador " + (i + 1) + ": ");
            play.setNome(ler.nextLine());
            do{
                System.out.println("ID: ");
                play.setId(ler.nextInt());
                for (int j = 0; j < MyFileHandle.lines.size(); j++) {
                    line = MyFileHandle.lines.get(i).split(";");
                    if(play.getId() == Integer.parseInt(line[0])){
                        flag = true;
                    }
                }

            }while(flag == true);
            do{
                System.out.print("Aposta (entre 2 e 12): ");
                play.setValorAposta(ler.nextInt());
                ler.nextLine();
            } while (play.getValorAposta() < 2 || play.getValorAposta() > 12);

            player.add(play);
        }

        // Criar e configurar o jogo
        Jogo jogo = new Jogo();
        /*jogo.inserirJogadores(jogadores);
        jogo.inserirApostas(apostas);*/

        // Jogar os dados
        jogo.jogarDados();
        jogo.mostrarResultado();
        for(Jogador players : player){
            for (int i = 0; i < MyFileHandle.lines.size(); i++) {   
                line = MyFileHandle.lines.get(i).split(";");
                vef = jogo.mostrarVencedor(players.getNome(), players.getValorAposta(), line[2], players.getId());
                if(vef == true){
                    players.setWinner(players.getWinner() + 1);
                }
            }
        }
        for(Jogador players : player){
            MyFileHandle.write("JogoDeDados\\utils\\jogadores.csv", players.toString(), true);
        }
        
    }
}