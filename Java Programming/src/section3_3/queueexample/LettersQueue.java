package section3_3.queueexample;

import java.util.LinkedList;

public class LettersQueue {
	public static void main(String[] args) {
		LinkedList<Character> lettersq = new LinkedList<>();
		
		lettersq.add('A');
		lettersq.add('B');
		lettersq.add('C');
		lettersq.add('D');
		
		System.out.println("LinkedList: " + lettersq);
		System.out.println("Tamanho da fila: " + lettersq.size());
		
		lettersq.remove(); // método FIFO (first in first out)
		System.out.println("LinkedList: " + lettersq);
		System.out.println("Tamanho da fila: " + lettersq.size());
		
		lettersq.remove(); // método FIFO (first in first out)
		System.out.println("LinkedList: " + lettersq);
		System.out.println("Tamanho da fila: " + lettersq.size());
	}
}
