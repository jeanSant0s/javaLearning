package javaOito;

public class ThreadSandbox {
	public static void main(String[] args) {
		int numero = 5;
		new Thread(() -> System.out.println(numero)).start();
		// numero = 10;
	}
}
