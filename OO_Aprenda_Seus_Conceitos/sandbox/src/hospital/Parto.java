package hospital;

public class Parto extends Procedimento{
	Medico[] medicos = new Medico[] { new ResidenteAnestesista(), new Obstetra(), new Pediatra() };
	Sala sala;

	void realizarParto() {
		for (int i = 0; i < medicos.length; i++) {
			Medico medico = this.medicos[i];
			medico.operar();
		}
	}

}
