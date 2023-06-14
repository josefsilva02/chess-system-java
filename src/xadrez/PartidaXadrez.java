package xadrez;

import jogoTabuleiro.Posicao;
import jogoTabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;

	public PartidaXadrez() {
		
		tabuleiro = new Tabuleiro(8, 8);
		configInicial();
	}
	
	public PecaXadrez[][] getPecas(){
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez) tabuleiro.peca(i , j);
				
				
			}
			
		}
		
		return mat;
	}
	
	private void configInicial() {
		tabuleiro.colocarPeca(new Torre(tabuleiro, Color.white), new Posicao(2,1));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Color.black), new Posicao(7, 3));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Color.white), new Posicao(0, 5));
		
	}

}
