package ExercicioResolvido;
import java.util.Scanner;


/**
 * Recebe um array com 5 anos, e mostra qual é bissexto e qual não é.  
 * 
 * 
 * @author marcelo
 *
 */
public class Exercicio04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int MAX = 5;
		Scanner scanner = new Scanner(System.in);
		int anos[] = new int[MAX];
		boolean result;
		int i;
		
		for (i = 0; i < MAX; i++) {
			System.out.println("Digite o ano da posição " + i);
			anos[i] = scanner.nextInt();
		}

		for (i = 0; i < MAX; i++) {
			result = bissexto(anos[i]);
			
			if (result) {
				System.out.println("O ano " + anos[i] + " é bissexto");
			}
			else {
				System.out.println("O ano " + anos[i] + " não é bissexto");
			}
		}
		
	}
	
	

	/**
	 * Verifica se o ano é bissexto.
	 * Para o ano ser bissexto ele deve ser divisível por 4.
	 * Porém se ele for divisível por 4 e por 100, mas não por 400, ele não é bissexto.
	 * Porém se ele for divisível por 4 e por 100 e por 400, ele não é bissexto.
	 * 
	 * @param ano - Ano a ser testado
	 * 
	 * @return true  - O ano é bissexto <br/>
	 *          false - O ano não é bissexto 
	 */
	public static boolean bissexto (int ano) {

		//É divisível por 4
		if ((ano % 4) == 0) {
			
			//É divisível por 100 E não é divisível por 400
			if (((ano % 100) == 0) && !((ano % 400) == 0)) {
				return false;
			}
			else {
				return true;
			}
				
		}
		else {
			return false;
		}
		
	}

}
