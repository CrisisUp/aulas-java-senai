package section3_3;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {
	public static void main(String[] args) {
		// Criando estudantes
		Student stu1 = new Student("Carlos Eduardo", "Machado de Oliveira", 100);
		Student stu2 = new Student("Mark", "Myworks", 95);
		Student stu3 = new Student("Beth", "Tween", 78);
		Student stu4 = new Student("Andrew", "Apic", 45);
		
		
		// Criando a lista de estudantes
		ArrayList<Student> lista = new ArrayList<>();
		lista.add(stu1);
		lista.add(stu2);
		lista.add(stu3);
		lista.add(stu4);
		
		//for (Student arrayTemporario : lista) {System.out.println(arrayTemporario);}
		
		System.out.println("====================================================================");
		displayLista(lista);
		
		// Classificando a lista de estudantes
		Collections.sort(lista);
		displayLista(lista);
		/*String str1 = "Carlos";
		String str2 = "Eduardo";
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str1));
		System.out.println(str1.compareTo(str1));
		System.out.println(str2.compareTo(str2));*/
		
		//System.out.println(stu1);
	}
	
	public static void displayLista(ArrayList<Student> lista) {
		for (Student arrayTemporario : lista) {
			System.out.println(arrayTemporario);
		}
	}
}
