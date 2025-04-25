package model.entities;

import model.exceptions.DomainException;

public class Account {

	private Integer numero;
	private String titular;
	private Double saldo = 0.0;
	private Double limiteDeSaque;
	
	
	
	public Account(Integer numero, String titular, Double limiteDeSaque) {
		this.numero = numero;
		this.titular = titular;
		this.limiteDeSaque = limiteDeSaque;
	}

	public Account(Integer numero, String titular, Double limiteDeSaque,  Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.limiteDeSaque = limiteDeSaque;
		this.saldo = saldo;
	}

	public void deposito(Double quantidade) throws DomainException {
		
		if (quantidade <= 0) {
			throw new DomainException("Valor negativo ou igual a 0!");
		}
		
		this.saldo += quantidade;
	}
	
	public void saque (Double quantidade) throws DomainException {
		if (quantidade <= 0) {
			throw new DomainException("Valor negativo ou igual a 0!");
		}
		
		if (quantidade > saldo) {
			throw new DomainException("Saldo insuficiente!");
		}
		
		if (quantidade > limiteDeSaque) {
			throw new DomainException("Valor supera limite de saque!");
		}
		
		this.saldo -= quantidade;
	}
	
	
	public Integer getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(Double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}
	
}
