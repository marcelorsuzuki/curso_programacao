import java.util.Scanner;


public class Prova01Ex04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String mes;
		int dia;

		System.out.println("Digite o dia:");
		dia = scanner.nextInt();
		
		System.out.println("Digite o mes:");
		mes = scanner.next();

		
		if (mes.equals("fev") && (dia > 28)) {
			System.out.println("Data inválida");
		}
		else {
			if ((mes.equals("abr") || mes.equals("jun") || mes.equals("set") || mes.equals("nov")) && (dia > 30)) {
				System.out.println("Data inválida");
			}
			else {
				if ((mes.equals("jan") || mes.equals("mar") || mes.equals("mai") || mes.equals("jul") || 
					 mes.equals("ago") || mes.equals("out") || mes.equals("dez")) && (dia > 31)) {
					System.out.println("Data inválida");
				}
				else {
					System.out.println("Data válida");
				}
			}
			
		}

	}
}
