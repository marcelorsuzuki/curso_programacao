package ExercicioResolvido;
import java.util.Scanner;


/**
 * Calcula a média entre duas notas através de um método, se o aluno foi aprovado ou não, 
 * caso a média for maior do que 6.
 * 
 * @author marcelo
 *
 */
public class Exercicio02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float nota1, nota2;
		String resultado;
		
		System.out.println("Digite a primera nota");
		nota1 = scanner.nextFloat();
		
		System.out.println("Digite a segunda nota");
		nota2 = scanner.nextFloat();

		resultado = verificaAprovacao(nota1, nota2);
		
		System.out.println("Status do aluno: " + resultado);

		
	}
	
	

	/**
	 * Calcula a média entre 2 notas, e retorna a mensagem se o aluno foi aprovado ou não.
	 * 
	 * @param n1 - Valor da nota1
	 * @param n2 - Valor da nota2
	 * 
	 * @return "Aprovado" se o aluno tem media a partir de 6 <br/>
	 *          "Não aprovado" se o aluno tem media menor do que 6
	 */
	public static String verificaAprovacao (float n1, float n2) {
		
		float r;
		
		r = (n1 + n2) / 2;
		
		if (r >= 6) {
			return "Aprovado";
		}
		else {
			return "Não aprovado";
		}
			
		
	}

}
