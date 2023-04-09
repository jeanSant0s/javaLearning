package hospital;

public abstract class Medico extends Funcionario {
	String CRM;
	Endereco endereco;

	abstract void operar();
	
	void fazerAlgoConcreto() {
		System.out.println("Método concreto em uma classe abstrata!");
	}
}
