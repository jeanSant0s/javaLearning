package sandbox;

public class ClasseExterna {
	private int x;

	private class ClasseInterna {
		void mostrarX() {
			System.out.println(ClasseExterna.this.x);
		}
	}

}
