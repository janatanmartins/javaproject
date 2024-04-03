package pricipal;

public class main {

	public static void main(String[] args) {
		// declaração de variaveis
	float nota1, nota2, media, notar, mediar; 
	
	// Entrada de dados
	nota1 = 5; 
	nota2 = 4; 
	
	//processamento
	media = (nota1 + nota2)/2;
	

	//saida de dados		
	if(media >= 7) {
		System.out.println("Aprovado com media" +media);
	}else if(media <7 && media >= 5){// conjunção
		System.out.println("Aluno em recuperação" +media);
		
	}else {
		notar = 8;
		mediar = (media + notar)/2;
		if(mediar >=5 ) {
			System.out.println("Aprovado em recuperação media" +mediar);
		}else {
		System.out.println("Reprovado com media" +mediar);
	}
	
	}
	}

}
