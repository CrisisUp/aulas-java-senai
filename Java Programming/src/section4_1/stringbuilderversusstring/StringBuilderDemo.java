package section4_1.stringbuilderversusstring;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sbr = new StringBuilder("Aprendendo Java com a Oracle");
		
		System.out.println(sbr);
		System.out.println(sbr.reverse());
		System.out.println(sbr);
		
		sbr.reverse();
		System.out.println(sbr);
		
		sbr.append(" é legal.");
		System.out.println(sbr);
		
		sbr.delete(11, 16);
		System.out.println(sbr);
		
		sbr.insert(11, "Java Programming ");
		System.out.println(sbr);

		System.out.println(sbr.indexOf(" "));
		System.out.println(sbr.indexOf(" ", 11)); // qual o próximo espaço depois da localoização 10 -> 15

		StringBuilder str = new StringBuilder("10");
		int str1 = Integer.parseInt(str.toString());
		System.out.println(str1 + 3);
	}
}
