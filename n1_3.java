import java.util.Scanner;

public class n1_3 {

	public static void main(String[] args) {
		String palavra, frase;
		Scanner input = new Scanner(System.in);
		int qtdEncontrada = 0;
		int[] posicao;
		
		System.out.println("Informe uma frase: ");
		frase = input.nextLine();
		System.out.println("Informe uma palavra para buscar na frase: ");
		palavra = input.nextLine();
		
		
		posicao = new int[(frase.length()-palavra.length())];
		for (int i = 0 ; i < frase.length(); i++) {
		if ((frase.toLowerCase().indexOf(palavra.toLowerCase(), i))!=-1) {
			i = frase.toLowerCase().indexOf(palavra.toLowerCase(), i);
			posicao[qtdEncontrada]=i;
			qtdEncontrada++;
			
		}
		
		}
		if (qtdEncontrada==0) {
			System.out.println("A palavra informada não existe na frase!");
		}
		else 
			System.out.println("A palavra " + palavra + " aparece " + qtdEncontrada + " vezes na frase e aparace na posição");
			for (int j = 0; j <qtdEncontrada; j++) {
			System.out.println(posicao[j]);
		}
		}
				
		
	
	}
