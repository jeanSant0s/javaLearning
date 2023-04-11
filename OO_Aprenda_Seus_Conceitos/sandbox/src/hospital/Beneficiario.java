package hospital;

import java.util.Date;

public class Beneficiario {
	private String nome;
	private Date dataNascimento;
	private String tipoBeneficiario;
	private Beneficiario dependente;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTipoBeneficiario() {
		return tipoBeneficiario;
	}

	public void setTipoBeneficiario(String tipoBeneficiario) {
		this.tipoBeneficiario = tipoBeneficiario;
	}

	public Beneficiario getDependente() {
		return dependente;
	}

	public void setDependente(Beneficiario dependente) {
		this.dependente = dependente;
	}

	private void idade() {

	}

}
