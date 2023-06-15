package jogoTabuleiro;

public class Tabuleiro {
	
	private int linhas ;
	private int colunas;
	private Peca[][] pecas;
	
	
	public Tabuleiro(int linhas, int colunas) {
		
		if (linhas < 1 || colunas < 1) {
			throw new TabuleiroExc("Erro criando tabuleiro , neccessario que tenha 1 linha e 1 coluna!");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}


	public int getLinhas() {
		return linhas;
	}


	public int getColunas() {
		return colunas;
	}

	
	public Peca peca(int linha , int coluna) {
		if(!positionExist(linha, coluna)) {
			throw new TabuleiroExc("Posicao nao existe");
		}
		return this.pecas[linha][coluna];
		
		
	}
	
	
	public Peca peca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroExc("Posicao nao existe");
		}
		
		return pecas[posicao.getLinha()][posicao.getColuna()];
		
	}
	
	public void colocarPeca(Peca peca , Posicao posicao) {
		
		
		if(haUmaPeca(posicao)) {
			throw new TabuleiroExc("Existe uma peca nessa posicao" + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean positionExist(int linha , int coluna ) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExiste(Posicao posicao) {
		return positionExist(posicao.getLinha() , posicao.getColuna());
	}
	
	
	public boolean  haUmaPeca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroExc("Posicao nao existe");
		}
		return peca(posicao) != null;
		
		
	}
}
