package sandbox;

public class Pessoa {
	String nome;
	static int quantidadeDeOlhos;

	String falar() {
		return "Olá!";
	}
	
	static void andar() {
		System.out.println("Caminhando...");
	}
}
