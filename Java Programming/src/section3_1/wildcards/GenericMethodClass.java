package section3_1.wildcards;
import java.util.ArrayList;

public class GenericMethodClass {
	public <T> void printArray(T[] array) {
		for (T arrTemporario : array) {System.out.print(arrTemporario + " ");}
		System.out.println();
	}
	
	public <T> void printArrayList(ArrayList<T> arrayList) {
		for (T arrListTemporario : arrayList) {System.out.print(arrListTemporario + " ");}
		System.out.println();
	}
	
	public void displayArrayList(ArrayList<?> arrayList) {
		for (Object arrListTemporario : arrayList) {System.out.print(arrListTemporario + " ");}
		System.out.println();
	}
	
	// Exemplo de limite superior
	public double sumOfArrayList(ArrayList<? extends Number> arrayList) {
		double sum = 0.0;
		for (Number arrListTemporario : arrayList) {sum += arrListTemporario.doubleValue();}
		return sum;
	}
	
	// Exemplo de limite inferior
	public void addNumbers(ArrayList<? super Integer> arrayList) {
		for (int i = 0; i < 10; i++ ) {arrayList.add(i);}
	}
}
