import java.util.Scanner;


public class Prova01Ex02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x, y, inicio, fim;
		
		System.out.println("Digite um valor inicial");
		inicio = scanner.nextInt();

		System.out.println("Digite um valor final");
		fim = scanner.nextInt();
		
		System.out.println("X - Y");
		for (x = inicio; x <= fim; x++) {
			y = 2 * x + 3;
			System.out.println(x + " - " + y);
		}
	}
}
