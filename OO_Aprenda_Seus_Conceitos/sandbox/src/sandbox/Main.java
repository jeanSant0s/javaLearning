package sandbox;

public class Main {
	public static void main(String[] args) {
//
//		Pessoa pessoa = new Pessoa();
//		System.out.println(pessoa.falar());
//		Pessoa.andar();
		Personagem mario = new Personagem();
		
		mario.setNome("Mario");
		mario.setCor("Vermelha");
		mario.setQuantidadeDeCogumelos(0);
		mario.setAltura(1.6);
		mario.setTipoFisico("Gordinho");
		mario.setPossuiBigode(true);
		
		mario.pular();
		mario.atirarFogo();
		
		Personagem luigi = new Personagem();

	}
}
