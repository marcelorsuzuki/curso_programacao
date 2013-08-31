package Aula;
import java.util.Scanner;


public class NumeroPrimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		boolean primo;
		
		System.out.println("Digite um valor");
		numero = scanner.nextInt();
		
		primo = ePrimo(numero);

		if (primo) {
			System.out.println("O número é primo");
		}
		else {
			System.out.println("O número não é primo");
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
