package entities;

public class PessoaJuridica extends Pessoa{

	private Integer numeroDeFuncionarios;
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getNome()).append(": $").append(String.format("%.2f", calculoImposto()));
		return sb.toString();
	}
	
	@Override
	public Double calculoImposto() {
		if (numeroDeFuncionarios > 10) {
			return super.getRendaAnual() * 0.14;
		} else {
			return super.getRendaAnual() * 0.16;
		}
	}
	
}
