package hospital;

public class ResidenteAnestesista extends Anestesista {
	@Override
	void operar() {
		System.out.println("Consulta anestesista pleno para saber como proceder...");
		super.operar();
	}
}
