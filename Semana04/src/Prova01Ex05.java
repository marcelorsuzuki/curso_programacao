import java.util.Scanner;


public class Prova01Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero, i;
		
		System.out.println("Digite qual tabuada");
		numero = scanner.nextInt();
		
		i = 2;
		do {
			System.out.println(i + " x " + numero + " = " + i * numero);
			i += 2;
		}while (i <= 10);

		
	}
}
