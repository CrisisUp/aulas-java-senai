package section3_3.hashmapexample;
import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, String> fruitBowl = new HashMap<String, String>();
		
		fruitBowl.put("Maçã", "Verde");
		fruitBowl.put("Cereja", "Vermelha");
		fruitBowl.put("Laranja", "Laranja");
		fruitBowl.put("Qualquer", null);
		fruitBowl.put("Uva", "Verde");
		fruitBowl.put("Banana", "Amarela");
		fruitBowl.put(null, null);
		// não repete a chave do HashMap
		fruitBowl.put(null, "Qualquer");
		// não duplica no HashMap
		fruitBowl.put("Laranja", "Laranja");
		
		//System.out.println(fruitBowl);
		
		//for(String arrTemporario : fruitBowl.keySet()) {System.out.println(arrTemporario + ": " + fruitBowl.get(arrTemporario));}
		
		for(HashMap.Entry<String, String> arrTemporario : fruitBowl.entrySet()) {System.out.println(arrTemporario.getKey() + ": " + arrTemporario.getValue());}
	
		findElement(fruitBowl, "Maçã");
		findElement(fruitBowl, "Pera");
		findElement(fruitBowl, "Laranja");
		
	}
	
	private static void findElement(HashMap<String, String> fruitBowl, String fruit) {
		if(fruitBowl.containsKey(fruit)) {System.out.println("A " + fruit + " é " + fruitBowl.get(fruit));}
		else {System.out.println("Não há " + fruit + "s na cesta.");}
	}
}
