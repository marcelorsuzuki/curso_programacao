package Aula;
import java.util.Scanner;


public class ArrayNumeroPrimo {

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
			//Testa se cada elemento do array é primo.
			primo = ePrimo(numero[i]);
	
			if (primo) {
				System.out.println("O número " + numero[i] + " é primo");
			}
			else {
				System.out.println("O número " + numero[i] + " não é primo");
			}
		}

	}
	
	
	/**
	 * Testa se o valor recebido por parâmetro é primo ou não
	 * 
	 * @param valor - Número a ser testado
	 * 
	 * @return true  - O número testado é primo <br />
	 * 			false - O número testado não é primo
	 */
	public static boolean ePrimo(int valor) {
		
		boolean teste;
		int i;
		
		//Se for 0 ou 1, não é primo, por isso retorna false
		if ((valor == 0) || (valor == 1)) {
			return false;
		}

		teste = true;
		for (i = 2; i < valor; i++) {
			
			//Verifica se o valor é divisível por i, e o "teste" vai ser falso.
			if ((valor % i) == 0) {
				teste = false;
			}
		}
		
		return teste;
		
	}

}
