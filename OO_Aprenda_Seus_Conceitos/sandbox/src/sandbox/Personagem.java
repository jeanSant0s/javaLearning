package sandbox;

public class Personagem {
	String nome;
	String cor;
	int quantidadeDeCogumelos;
	double altura;
	String tipoFisico;
	boolean possuiBigode;

	String getNome() {
		return this.nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantidadeDeCogumelos() {
		return quantidadeDeCogumelos;
	}

	public void setQuantidadeDeCogumelos(int quantidadeDeCogumelos) {
		this.quantidadeDeCogumelos = quantidadeDeCogumelos;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getTipoFisico() {
		return tipoFisico;
	}

	public void setTipoFisico(String tipoFisico) {
		this.tipoFisico = tipoFisico;
	}

	public boolean isPossuiBigode() {

		return possuiBigode;
	}

	public void setPossuiBigode(boolean possuiBigode) {

		this.possuiBigode = possuiBigode;
	}

	void pular() {
		// implementação aqui
	}

	void pegarCogumelo(Cogumelo cogumelo) {
		// implementação aqui
	}

	BolaFogo atirarFogo() {
		// implementação aqui
	}

}
