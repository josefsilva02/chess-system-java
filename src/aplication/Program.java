package aplication;

import jogoTabuleiro.Posicao;
import jogoTabuleiro.Tabuleiro;
import xadrez.PartidaXadrez;

public class Program {

	public static void main(String[] args) {
		PartidaXadrez p1 = new PartidaXadrez();
		Ui.printBoard(p1.getPecas());

	}

}
