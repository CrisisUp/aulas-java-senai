package section2_4.assertion;

import java.util.Scanner;

public class AssertExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, digite um número: ");
		double num = sc.nextDouble();
		System.out.println("O número digitado é: " + num);
		sc.close();
		
		assert num < 2_147_483_647 : "Digite um valor menor que 2_147_483_647.";
		
		int y = (int) num;
		System.out.println("O número truncado para inteiro é: " + y);
	}
}

