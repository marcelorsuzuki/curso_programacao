package ExercicioResolvido;
import java.util.Scanner;


/**
 * Recebe dois arrays, um com as medias e outro com os nomes, e mostra quem foi aprovado ou não.  
 * 
 * 
 * @author marcelo
 *
 */
public class Exercicio05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int MAX = 5;
		Scanner scanner = new Scanner(System.in);
		float medias[] = new float[MAX];
		String nomes[] = new String[MAX];
		String resultado;
		int i;
		
		for (i = 0; i < MAX; i++) {
			System.out.println("Digite o nome do aluno " + i);
			nomes[i] = scanner.next();
			
			System.out.println("Digite a média do aluno " + nomes[i]);
			medias[i] = scanner.nextFloat();
			
		}

		for (i = 0; i < MAX; i++) {
			resultado = status(medias[i]);
			System.out.println("Status do aluno " + nomes[i] + ": " + resultado);
		}
		
	}
	
	

	/**
	 * Verifica status do aluno. Se sua média foi menor do que 6, não foi aprovado.
	 * 
	 * @param media - Média do aluno
	 * 
	 * @return "Aprovado" se o aluno tem media a partir de 6 <br/>
	 *          "Não aprovado" se o aluno tem media menor do que 6
	 */
	public static String status (float media) {
		
		if (media >= 6) {
			return "Aprovado";
		}
		else {
			return "Não aprovado";
		}
			
		
	}

}
