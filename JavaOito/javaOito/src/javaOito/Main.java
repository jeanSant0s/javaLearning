package javaOito;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		Usuario user1 = new Usuario("Jean", 150);
		Usuario user2 = new Usuario("Carlos", 120);
		Usuario user3 = new Usuario("Santos", 190);

		List<Usuario> usuarios = new ArrayList<Usuario>();

		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);

		System.out.println("for comum:");
		for (Usuario u : usuarios) {
			System.out.println(u.getNome());
		}

		System.out.println("\nforEach com classe comum:");
		Mostrador mostradorComum = new Mostrador();
		usuarios.forEach(mostradorComum);

		System.out.println("\nforEach com classe anônima:");
		usuarios.forEach(new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
		});

		System.out.println("\nforEach com mostrador lambda:");
		Consumer<Usuario> mostradorLambda = (Usuario u) -> {
			System.out.println(u.getNome());
		};
		usuarios.forEach(mostradorLambda);

		System.out.println("\nforEach com lambda simplificado:");
		usuarios.forEach(u -> System.out.println(u.getNome()));

		System.out.println("\nFazendo todos os usuários virarem moderadores com forEach e lambda simplificado...");
		usuarios.forEach(u -> u.tornaModerador());

		System.out.println("\nUsando um forEach com .andThen:");
		Consumer<Usuario> mostraPontos = t -> System.out.println(t.getPontos());
		usuarios.forEach(mostradorLambda.andThen(mostraPontos));

		System.out.println("\nUsando o removeIf e o Predicate:");
		Predicate<Usuario> predicado = v -> v.getPontos() <= 120;
		usuarios.removeIf(predicado);
		usuarios.forEach(mostraPontos);
	}
}
