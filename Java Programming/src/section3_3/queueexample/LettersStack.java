package section3_3.queueexample;

import java.util.LinkedList;

public class LettersStack {
	public static void main(String[] args) {
		LinkedList<Character> lettersk = new LinkedList<>();

		lettersk.push('A');
		lettersk.push('B');
		lettersk.push('C');
		lettersk.push('D');
		lettersk.push('E');

		System.out.println("LinkedList: " + lettersk);
		System.out.println("Tamanho da fila: " + lettersk.size());

		lettersk.remove(); // método FILO (first in last out)
		System.out.println("LinkedList: " + lettersk);
		System.out.println("Tamanho da fila: " + lettersk.size());

		lettersk.remove(); // método FILO (first in last out)
		System.out.println("LinkedList: " + lettersk);
		System.out.println("Tamanho da fila: " + lettersk.size());
		
		lettersk.pop(); // método FIFO (first in first out)
		System.out.println("LinkedList: " + lettersk);
		System.out.println("Tamanho da fila: " + lettersk.size());
	}
}
