import java.util.Scanner;

public class n1_1 {

	public static void main(String[] args) {
		int [] num = new int[7];
		String [] nome = new String[10];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe 7 números\n");
		for (int i = 0; i < num.length; i++) {
			System.out.print("\n" + (i+1) + "º Número: ");
			num[i] = input.nextInt();
		}
		
		for (int i = 0; i< num.length; i++) {
			if (num[i]%2==0) {
				System.out.println("O número " + num[i] + " é par e está na posição " + (i+1));
			}
		}
		
		input.nextLine();
		
		System.out.println("\n\nInforme 10 nomes");
		for (int i = 0; i < nome.length; i++) {
			System.out.print("\n" + (i+1) + "º nome: " );
			nome[i] = input.nextLine();
			
		}
		
		for (int i = nome.length; i > 0; i--) {
			System.out.print(nome[i-1] + ", ");
		}
						
	}

}
