package pricipal;

import java.util.Scanner;

import javax.swing.JOptionPane;

import funcao.funcao;

public class main {

	public static void main(String[] args) {
		// declaração de variaveis
	float nota1, nota2;
	String sn1, sn2;
	funcao funcao = new funcao();



	
	   		sn1 = JOptionPane.showInputDialog("Digite o valor da Primeira nota: ");
	   		nota1 = Float.parseFloat(sn1);
			sn2 = JOptionPane.showInputDialog("Digite o valor da Segunda nota: ");
			nota2 = Float.parseFloat(sn2); 
			
			funcao.media(nota1, nota2);
		}
	}
	
	
	


