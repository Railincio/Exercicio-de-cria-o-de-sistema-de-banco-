package br.com.cruzvita.atividade_mvn;

import utilitarios.utils;

public class Conta {
	
	
	private static int contadorDecontas = 1;
	
	private int numeroConta;
	private Cliente cliente;
	private Double saldo = 0.0;
	
	
	public Conta(int numeroConta, Cliente cliente, Double saldo) {
		super();
		this.numeroConta = contadorDecontas;
		this.cliente = cliente;
		contadorDecontas += 1;
		
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		return "\nNúmero da conta: " + this.getNumeroConta() +
				"\nNome: " + this.cliente.getNome() +
				"\nCPF: " + this.cliente.getCPF() +
				"\nEmail:" + this.cliente.getEmail()+
				"\nSaldo:" + utils.doubleToString(this.getSaldo())+
				"\n";
	}
	public void depositar(Double valor) {
		if(valor>0) {
			setSaldo(getSaldo() + valor);
			System.out.println("Seu depósito foi realizado com sucesso!");
			}else {
				System.out.println("Não foi possivel realizar o depósito");
			}
	}
	public void sacar (Double valor) {
		if(valor > 0 && this.getSaldo()>=valor) {
			setSaldo(getSaldo() - valor);
			System.out.println("Seu saque foi realizado com sucesso!");
		}else {
			System.out.println("Não foi possivel realizar o saque!");
		}
	}
	public void transferir (Conta contaParaDeposito, Double valor) {
		if(valor >0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo()- valor);
			
			contaParaDeposito.saldo = contaParaDeposito.getSaldo()+ valor;
			System.out.println("Transferencia realizada com sucesso!");
		}else {
			System.out.println("Não foi possivel realizar a Transferencia! ");
			
		}
	}
}
