package javaOito;

public class TesteValidador {

	public static void main(String[] args) {
		Validador<String> validadorCEP = valor -> {
			return valor.matches("[0-9]{5}-[0-9]{3}");
		};

		System.out.println(validadorCEP.valida("04101-460"));
	}

}
