package xadrez.pecas;

import jogoTabuleiro.Tabuleiro;
import xadrez.Color;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez {

	public Torre(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
		
	}
	
	@Override
	public String toString() {
		return "t";	
	}

}
