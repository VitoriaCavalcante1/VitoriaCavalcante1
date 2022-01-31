package CodBarata;

import java.util.Scanner;

public class TesteBaratas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);  //Reclama sobre o scanner.
		/*PopulacaoBarata popBarata = new PopulacaoBarata(10);
		
		popBarata.dobrarPopulacao();
		popBarata.sraprayVeneno();
		
		System.out.println("Baratas:"+popBarata.obterBaratas());
		*/
		
		
		
		System.out.println("qual o tamanho da populacao :");
		int tam =entrada.nextInt();
		
		PopulacaoBarata popBarata = new PopulacaoBarata(tam);
		popBarata.dobrarPopulacao();
		
		
		popBarata.sraprayVeneno();
		System.out.println("qual o tamanho:"+popBarata.obterBaratas());
		
		popBarata.sraprayVeneno();
		System.out.println("qual o tamanho:"+popBarata.obterBaratas());
		
		popBarata.sraprayVeneno();
		System.out.println("qual o tamanho:"+popBarata.obterBaratas());
		
		
		

	}

}
