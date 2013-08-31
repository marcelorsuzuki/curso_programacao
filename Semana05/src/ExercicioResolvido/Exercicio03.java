package ExercicioResolvido;
import java.util.Scanner;


/**
 * Verifica através de um método se um ano é bissexto ou não. 
 * 
 * 
 * @author marcelo
 *
 */
public class Exercicio03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ano;
		boolean result;
		
		System.out.println("Digite o ano a ser testado");
		ano = scanner.nextInt();

		result = bissexto(ano);
		
		if (result) {
			System.out.println("O ano " + ano + " é bissexto");
		}
		else {
			System.out.println("O ano " + ano + " não é bissexto");
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
