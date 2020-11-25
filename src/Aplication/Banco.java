package Aplication;

import javax.swing.JOptionPane;

public class Banco {

	private String nome;
	private float saldo;
	private int senha;
	
	
	public Banco() {
		nome="wesley";
		saldo=100;
		senha=123;
		 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	



	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Banco [nome=" + nome + ", saldo=" + saldo + "]";
	}
	
	public boolean Sacar(float valor) {
		if(valor<this.saldo) {
			saldo-=valor;
		
			return true;
		}else {
			System.out.println("Saldo Insuficiente");
			return false;
		}
	}
	public float depositar(float valor) {
		this.saldo+=valor;
		return valor;
	
	}
	
	public void confereSenha() {
		for(int contador=0; contador<3 ; contador++) {
			int senhausu=Integer.parseInt(JOptionPane.showInputDialog("Informe a senha"));
			if(senhausu==this.senha) {
				System.out.println("Senha Correta ");
				contador=3;
			}else {
				System.out.println("Senha Incorreta");
			}
		}
	}
	
	
	}




















