package pricipal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// declaração de variaveis
	float nota1, nota2, media, notar, mediar; 
	String sn1, sn2, snr;
	// Entrada de dados
//	nota1 = 5; 
//	nota2 = 4; 
//	Scanner read = new Scanner(System.in);
	
//	System.out.println("Digite o valor da Primeira nota: ");
//	nota1 = read.nextFloat();
//	System.out.println("Digite o valor da Segunda nota: ");
//	nota2 = read.nextFloat();
	//processamento
 
	
	   		sn1 = JOptionPane.showInputDialog("Digite o valor da Primeira nota: ");
	   		nota1 = Float.parseFloat(sn1);
			sn2 = JOptionPane.showInputDialog("Digite o valor da Segunda nota: ");
			nota2 = Float.parseFloat(sn2); 
			
			media = (nota1 + nota2)/2;

	//saida de dados		
	if(media >= 7) {
		System.out.println("Aprovado com media" +media);
	}else if(media <7){
		System.out.println("Aluno em recuperação" +media);
//		System.out.println("Digite o valor da nota de Recuperação: ");
//		notar = read.nextFloat();
		snr = JOptionPane.showInputDialog("Digite o valor da Segunda nota: ");
		notar = Float.parseFloat(snr);
		mediar = (media + notar)/2;
		if(mediar > 0 && mediar >= 5 ) {//conjunção
			System.out.println("Aprovado em recuperação media" +mediar);
		}
	}
	
	
	}

}
