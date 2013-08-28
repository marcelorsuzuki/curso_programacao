import java.util.Scanner;


public class CalculaIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String op, fezAniversario;
		int idade, diaNasc, anoNasc, dia, ano;
		String mesNasc, mes;
		boolean dataNascOk, dataAtualOk;
		
		do {

			System.out.println("Digite o dia de nascimento:");
			diaNasc = scanner.nextInt();
			
			System.out.println("Digite o mes de nascimento:");
			mesNasc = scanner.next();
			
			System.out.println("Digite o ano de nascimento:");
			anoNasc = scanner.nextInt();

			System.out.println("Digite o dia atual:");
			dia = scanner.nextInt();
			
			System.out.println("Digite o mes atual:");
			mes = scanner.next();

			System.out.println("Digite o ano atual:");
			ano = scanner.nextInt();
			
			System.out.println("Já fez aniversário (S/N)?");
			fezAniversario = scanner.next().toUpperCase();
			
			dataNascOk = dataValida(diaNasc, mesNasc);
			dataAtualOk = dataValida(dia, mes);
			
			//Se não for válida a data de nascimento
			if (!dataNascOk) {
				System.out.println("Data de nascimento inválida");
				return;
			}

			
			//Se não for válida a data de nascimento
			if (!dataAtualOk) {
				System.out.println("Data atual inválida");
				return;
			}
			
			
			idade = calculaIdade(anoNasc, ano, fezAniversario);
			System.out.println("A sua idade é " + idade);
			
			
			System.out.println("Deseja sair? (S/N)");
			op = scanner.next();
			
		//Enquanto a opção digitada não for "n" ou "N", fica no loop
		}while (op.equals("n") || op.equals("N"));
		

	}
	
	
	/**
	 * Método que calcula a idade de uma pessoa
	 * 
	 * @param aN - Ano do nascimento
	 * @param a  - Ano atual
	 * @param fez - "S" ou "N", indicando se a pessoa já fez aniversário ou não
	 * 
	 * @return Retorna a idade da pessoa
	 */
	public static int calculaIdade(int aN, int a, String fez) {
		
		int idade;
		
		idade = a - aN; 
		
		if (fez.equals("N")) {
			idade--;
		}
		
		return idade;
		
	}
	
	
	/**
	 * Verifica se uma data é valida
	 * 
	 * @param d - Dia do mês
	 * @param m - Mês (somente as 3 primeiras letras)
	 * @return true  - Data válida
	 * 		   false - Data inválida
	 */
	public static boolean dataValida(int d, String m) {
		
		//Converte o mes para maiúsculo
		String uMes = m.toUpperCase();
		
		if (uMes.equals("FEV") && (d > 28)) {
			return false;
		}
		else {
			if ((uMes.equals("ABR") || uMes.equals("JUN") || uMes.equals("SET") || uMes.equals("NOV")) && (d > 30)) {
				return false;
			}
			else {
				if ((uMes.equals("JAN") || uMes.equals("MAR") || uMes.equals("MAI") || uMes.equals("JUL") || 
					 uMes.equals("MAR") || uMes.equals("MAI") || uMes.equals("JUL")) && (d > 31)) {
					return false;
				}
				else {
					return true;
				}
			}
			
		}
		
	}

}
