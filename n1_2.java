import java.util.Scanner;

public class n1_2 {

	public static void main(String[] args) {
		String palavra, frase;
		Scanner input = new Scanner(System.in);
		int qtdEncontrada = 0;
		
		System.out.println("Informe uma frase: ");
		frase = input.nextLine();
		System.out.println("Informe uma palavra para buscar na frase: ");
		palavra = input.nextLine();
		
		for (int i = 0 ; i < frase.length(); i++) {
		if ((frase.toLowerCase().indexOf(palavra.toLowerCase(), i))!=-1) {
			i = frase.toLowerCase().indexOf(palavra.toLowerCase(), i);
			qtdEncontrada++;
			
		}
		}
				
		System.out.println("A palavra " + palavra + " aparece " + qtdEncontrada + " vezes na frase");
	
	}

}
