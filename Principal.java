public class Principal {

	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		
		Jogador jogador1 = new Jogador("Thiago");
		Jogador jogador2 = new Jogador("Gustavo");
		Jogador jogador3 = new Jogador("Matheus");
		
        System.out.println("______________________________");
		jogo.adicionarJogador(jogador1);
		jogo.adicionarJogador(jogador2);
		jogo.adicionarJogador(jogador3);
        System.out.println("______________________________");
		
		jogo.definirJogador(jogador1);
		jogo.definirJogador(jogador3);
		jogo.definirJogador(jogador2);
        System.out.println("______________________________");
	}

}
