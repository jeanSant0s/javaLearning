package javaOito;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		Usuario jean = new Usuario("Jean", 100);
		Usuario carlos = new Usuario("Carlos", 200);
		Usuario santos = new Usuario("Santos", 300);

		List<Usuario> usuarios = new <Usuario>ArrayList();

		usuarios.add(jean);
		usuarios.add(carlos);
		usuarios.add(santos);

		System.out.println("Usando o for normal:");
		for (Usuario u : usuarios) {
			System.out.println(u.getNome());
		}

		System.out.println("\nUsando forEach e a classe Consumer:");
		Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);

		System.out.println("\nUsando forEach e a classe Consumer anônima:");
		Consumer<Usuario> mostradorAnonimo = new Consumer<Usuario>() {

			@Override
			public void accept(Usuario t) {
				System.out.println(t.getNome());
			}
		};
		usuarios.forEach(mostradorAnonimo);

		System.out.println("\nUsando forEach e um lambda:");
		Consumer<Usuario> mostradorLambda = u -> System.out.println(u.getNome());
		usuarios.forEach(mostradorLambda);

		System.out.println("\nUsando forEach e um lambda em uma única linha:");
		usuarios.forEach(u -> System.out.println(u.getNome()));

		System.out.println("\nPromovendo todos os usuários em uma única linha:");
		usuarios.forEach(u -> u.tornaModerador());

		System.out.println("\nExemplo de default method: andThen");
		Consumer<Usuario> mostraMensagem = u -> System.out.println("Antes de imprimir os nomes:");
		Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());
		usuarios.forEach(mostraMensagem.andThen(imprimeNome));

		System.out.println("\nExemplo de uso do removeIf:");
		usuarios.removeIf(u -> u.getPontos() < 150);
		usuarios.forEach(u -> System.out.println(u.getNome()));

		Comparator<Usuario> comparatorAnonimo = new Comparator<Usuario>() {

			@Override
			public int compare(Usuario u1, Usuario u2) {
				return u1.getNome().compareTo(u2.getNome());
			}

		};

		Comparator<Usuario> comparatorLambda = (u1, u2) -> u1.getNome().compareTo(u2.getNome());

	}
}
