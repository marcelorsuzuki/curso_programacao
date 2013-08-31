package Aula;
import java.util.Scanner;


public class ArrayNumeroPar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int MAX = 5;
		Scanner scanner = new Scanner(System.in);
		int numero[] = new int[MAX];
		boolean primo;
		int i;
		
		for (i = 0; i < MAX; i++) {
			System.out.println("Digite o valor da posição " + i);
			numero[i] = scanner.nextInt();
		}
		
		
		for (i = 0; i < MAX; i++) {
			
			//Testa se cada elemento do array é par.
			primo = ePar(numero[i]);
	
			if (primo) {
				System.out.println("O número " + numero[i] + " é par");
			}
			else {
				System.out.println("O número " + numero[i] + " não é par");
			}
		}

	}
	
	
	/**
	 * Testa se o valor recebido por parâmetro é par ou não
	 * 
	 * @param valor - Número a ser testado
	 * 
	 * @return true  - O número testado é par <br />
	 * 			false - O número testado não é par
	 */
	public static boolean ePar(int valor) {
		
		//Verifica se o valor é divisível por 2
		if ((valor % 2) == 0) {
			return true;
		}
		else {
			return false;	
		}
		
	}

}
