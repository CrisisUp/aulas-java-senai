package section2_4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTester1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0, num2 = 0, result = 0;
		String answer = "SIM";

		do {
			try {
				System.out.print("Informe o numerador: ");
				num1 = sc.nextDouble();
				System.out.print("Informe o denominador: ");
				num2 = sc.nextDouble();
				if (num2 == 0.0) {
					throw new Exception("Divisão por Zero!");
				}
			} catch (InputMismatchException | NumberFormatException e) {
				System.out.println("Você precisa digitar um valor numérico: ");
				sc.nextLine(); // consome a linha toda
				continue;
			} catch (Exception e) {
				System.out.println(e);
				System.out.println(e.getLocalizedMessage());
				System.out.println("Digite um valor válido!");
				sc.nextLine();
				continue;
			}

			result = num1 / num2;

			System.out.println("O resultado desta divisão é: " + result);
			System.out.println("Você deseja realizar uma nova divisão? (SIM / NÃO)");
			answer = sc.next();
			while (!answer.equalsIgnoreCase("SIM") && !answer.equalsIgnoreCase("NÃO")) {
				System.out.println("Você precisa digitar SIM ou NÃO!");
				answer = sc.next();
			}
		} while (answer.equalsIgnoreCase("SIM"));

		System.out.println("Programa concluido!");
		sc.close();
	}
}
