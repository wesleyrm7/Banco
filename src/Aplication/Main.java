package Aplication;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Banco b=new Banco();
		
		 int stop;
		
		 b.confereSenha();
		 
		
		do {
			stop=Integer.parseInt(JOptionPane.showInputDialog("Banco "+
					"\n 1- Sacar"+
					"\n 2- Depositar"+
					"\n 3- Consulta Saldo"
					));
			switch(stop) {
			case 1:
				 float valor=Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Saque"));
				b.Sacar(valor);
				break;
			case 2:
				float Depo=Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do DEPOSITO"));
				b.depositar(Depo);break;
			case 3:
				System.out.println(b.toString());
				
			}
		}while(stop!=4);
		System.out.println("Programa Finalizado");

	}

}
