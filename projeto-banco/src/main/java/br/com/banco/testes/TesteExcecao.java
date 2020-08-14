package br.com.banco.testes;

public class TesteExcecao {
	
	public static void main(String[] args) {
		
		try {
			
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception!");
			
			vetor[4] = 55;
			
			System.out.println("Isso não será mostrado no console");
		
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Erro Erro Erro Erro ");
		}
		
	}

}
