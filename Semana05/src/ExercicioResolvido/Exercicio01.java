package ExercicioResolvido;
import java.util.Scanner;


/**
 * Calcula a média entre duas notas através de um método, e mostra o resultado.
 * 
 * @author marcelo
 *
 */
public class Exercicio01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float nota1, nota2, resultado;
		
		System.out.println("Digite a primera nota");
		nota1 = scanner.nextFloat();
		
		System.out.println("Digite a segunda nota");
		nota2 = scanner.nextFloat();

		resultado = media(nota1, nota2);
		
		System.out.println("A média das notas é " + resultado);

		
	}
	
	

	/**
	 * Calcula a média entre 2 notas
	 * 
	 * @param n1 - Valor da nota1
	 * @param n2 - Valor da nota2
	 * 
	 * @return Cálculo da média
	 */
	public static float media (float n1, float n2) {
		
		float r;
		
		r = (n1 + n2) / 2;
		
		return r;
		
	}

}
