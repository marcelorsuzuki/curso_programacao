import java.util.Scanner;


public class Prova01Ex03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero, anterior, posterior;
		
		System.out.println("Digite um numero");
		numero = scanner.nextInt();

		anterior = numero - 1;
		posterior = numero + 1;
		
		System.out.println("O valor anterior é " + anterior);
		System.out.println("O valor posterior é " + posterior);

	}
}
