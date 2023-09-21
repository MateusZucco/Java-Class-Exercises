import java.util.Date;

public class TestaJogador {

    public static void main(String[] args){
        Jogador jogador1 = new Jogador(1, "um", "umm", new Date(), 1, "meia", 0, false);
        System.out.println(jogador1.toString());
        jogador1.aplicaCartao(1);
        System.out.println(jogador1.toString());
        jogador1.cumpreSuspencao();
        System.out.println(jogador1.toString());

        Jogador jogador2 = new Jogador(2, "dois", "doiss", new Date(), 2, "meia", 0, false);
        System.out.println(jogador2.toString());
        jogador2.aplicaCartao(2);
        System.out.println(jogador2.toString());
        jogador2.cumpreSuspencao();
        System.out.println(jogador2.toString());

        Jogador jogador3 = new Jogador(3, "tres", "tress", new Date(), 3, "meia", 0, false);
        System.out.println(jogador3.toString());
        jogador3.aplicaCartao(3);
        System.out.println(jogador3.toString());
        jogador3.cumpreSuspencao();
        System.out.println(jogador3.toString());

    }
}
