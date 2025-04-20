package entities;

public class PessoaFisica extends Pessoa{

	Double gastosComSaude;

	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getNome()).append(": $").append(String.format("%.2f", calculoImposto()));
		return sb.toString();
	}

	@Override
	public Double calculoImposto() {
		if (super.getRendaAnual() < 20000) {
			return (super.getRendaAnual() * 0.15) - (gastosComSaude * 0.5);
		} else {
			return (super.getRendaAnual() * 0.25) - (gastosComSaude * 0.5);
		}
	}
}
