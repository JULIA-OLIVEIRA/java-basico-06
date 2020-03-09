package br.fai.projeto06;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}
	
	private void start() {
		
		String[] carros = {"civic", "gol", "palio", "uno"};
		
		System.out.println("Posicao 1: " carros[1]);
		
		for(String carro : carros) {
			
			System.out.println("Carro: " + carro);
		}
		
		System.out.println("-----");
		
		carro[1] = "L200";
		
		for (String carro : carro) {
			System.out.println("carr: " + carro);
			
		}
		
		carro[4] = "gol";
		System.out.println("posicao 4: " + carro[4]);
		
		int tamanhoDoNovoArrayDeCarros = carro.length + 1;
		
		String[] novoArrayDeCarros = new String(tamanhoDoNovoArray);
		
		for (int i = 0; i < carros.length; i++) {
			
			String carro = carro[1];
			novoArrayDeCarro[i] = carro;
		}
		
		novoArrayDeCarros
	}

}
