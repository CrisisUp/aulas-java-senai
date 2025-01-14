package section4_2.regularExpressionExample;

import java.util.Scanner;

public class RegularExpressionExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		String resposta = "sIm";
//		if (getResposta(resposta)) {System.out.println("Esta é uma resposta válida");}
//		else {System.out.println("(" + resposta + ") Esta não é uma resposta válida.");}
//		
//		String palavra = "amar";
//		if (rhymingWord(palavra)) {System.out.println(palavra + " rima com mar.");}
//		else {System.out.println(palavra + " não rima com mar.");}
		
		System.out.print("digite seu CPF: ");
		String CPF = sc.next();
		if (getCPF(CPF)) {System.out.println("O CPF " + CPF + " está no padrão correto!");}
		else {System.out.println("O CPF " + CPF + " não está no padrão correto!");}
	}
	
	public static boolean getResposta(String resposta) {return resposta.matches("[Ss]im|[Nn]ão");}
	public static boolean rhymingWord(String palavra) {return palavra.matches("[a-z]ar");}
	public static boolean getCPF(String CPF) {
		return CPF.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
	}
}
