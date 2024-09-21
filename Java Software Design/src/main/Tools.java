package main;

public class Tools {
	// Properties
	public static char option = 'A'; // variável de classe
	public char alternative = 'a'; // variável de instancia
	
	// Behaviors
	@Annotation2
	public static void printOption() {System.out.println(option);}
	@Annotation2
	public void printOp() {System.out.println(option);}
	
	public static void printAlternative() {
		// System.out.println(alternative); método estático só aceita variável estática
		
		char altern = 'z';
		System.out.println(altern);
		printOption();
		// printOp(); método estático só aceita método estático
	}
	
	//public static void display(String str) {System.out.println(str);}
	//public static void display(double num) {System.out.println(num + "double");}
	//public static void display(float num) {System.out.println(num + "float");}
	
	
	@Annotation1("Método genérico utilizado!")
	//public static <T> void display(T info) {System.out.println(info.getClass().getSimpleName());}
	public static <T> void display(T info) {System.out.println(info);}
	
	public static double sum(double num1, double num2) {
		double result = num1 + num2;
		System.out.println(result);
		return result;
	}
}
