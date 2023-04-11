package hospital;

public class TransmissaoDadosMinisterio implements IDemonstrativoOperacional {

	@Override
	public double disponibilizarFaturamentoMensal() {
		return 1000000.0;
	}

	@Override
	public Procedimento[] informarProcedimentosExecutados() {
		Procedimento[] procedimentos = new Procedimento[] { new Parto() };

		return procedimentos;

	}

}
