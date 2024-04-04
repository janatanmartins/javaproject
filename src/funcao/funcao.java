package funcao;

import javax.swing.JOptionPane;

public class funcao {
	public void media(Float nota1, Float nota2) {
		// declaração de variaveis
		float media, notar, mediar; 
		String snr;

				
				media = (nota1 + nota2)/2;

		//saida de dados		
		if(media >= 7) {
			System.out.println("Aprovado com media" +media);
		}else if(media <7){
			System.out.println("Aluno em recuperação" +media);

			snr = JOptionPane.showInputDialog("Digite o valor da nota de Recuperação: ");
			notar = Float.parseFloat(snr);
			mediar = (media + notar)/2;
			if(mediar > 0 && mediar >= 5 ) {//conjunção
				System.out.println("Aprovado em recuperação media" +mediar);
				
			}else {
				
				JOptionPane.showMessageDialog(null,"Reprovado em media" +mediar);
			}
		}
		
		
		}
	}


