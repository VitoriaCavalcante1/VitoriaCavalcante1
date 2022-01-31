package CodBarata;

public class PopulacaoBarata {
	
	int populacao;
	

	public PopulacaoBarata(int populacaoInicial) {
		this.populacao=populacaoInicial;
	}
	
	public void dobrarPopulacao() {
		populacao=populacao*2;
	}
	
	public void sraprayVeneno() {
		populacao= (int)(populacao*0.9);
	}
	
	public int obterBaratas() {
		return populacao;
	}
}
