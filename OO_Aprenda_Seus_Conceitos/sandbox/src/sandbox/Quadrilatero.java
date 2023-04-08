package sandbox;

public class Quadrilatero {

	// Quadrado
	double calcularArea(double lado) {
		return lado * lado;
	}

	// Retângulo
	double calcularArea(double baseMaior, double baseMenor) {
		return baseMaior * baseMenor;
	}

	// Trapézio
	double calcularArea(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor) * altura)/2;
	}
	
	// Losango
	double calcularArea(float diagonalMaior, float diagonalMenor) {
		return diagonalMaior * diagonalMenor;
	}

}
