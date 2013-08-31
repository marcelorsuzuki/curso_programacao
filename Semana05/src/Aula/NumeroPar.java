package Aula;
import java.util.Scanner;


public class NumeroPar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		boolean primo;
		
		System.out.println("Digite um valor");
		numero = scanner.nextInt();
		
		primo = ePar(numero);

		if (primo) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número não é par");
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
