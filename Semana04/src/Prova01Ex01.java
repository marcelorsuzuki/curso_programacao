import java.util.Scanner;


public class Prova01Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite um valor");
		valor = scanner.nextInt();
		
		if (valor >= 30) {
			System.out.println("Valor maior do que o esperado");
		}
		else {
			System.out.println("Valor dentro do esperado");
		}
		
	}
}
