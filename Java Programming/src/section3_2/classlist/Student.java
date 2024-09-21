package section3_2.classlist;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
	public static void main(String[] args) {
		ArrayList<String> studentNames = new ArrayList<>();
		addStudent(studentNames);
		displayStudents(studentNames);
		
		System.out.println();
		Collections.sort(studentNames);
		displayStudents(studentNames);
		
	}
	
	private static void addStudent(ArrayList<String> studentName) {
		studentName.add("Carlos");
		studentName.add("Henrique");
		studentName.add("Marco");
		studentName.add("Maria");
		studentName.add("Carlos");
		studentName.add("Allan");
	}
	
	private static void displayStudents(ArrayList<String> studentName) {
		for (String arrTemporario : studentName) {System.out.println("Nome do estudante: " + arrTemporario);}
	}
}
