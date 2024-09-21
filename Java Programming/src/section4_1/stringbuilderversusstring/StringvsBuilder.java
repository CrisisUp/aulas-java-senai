package section4_1.stringbuilderversusstring;

public class StringvsBuilder {
	public static void main(String[] args) {
		String str = "Teste de imutabilidade.";
		StringBuilder sbr = new StringBuilder("Teste de imutabilidade.");
		
		System.out.println("Endereço da StringBuilder: " + sbr.hashCode());
		System.out.println("Endereço da String: " + str.hashCode());
		
		sbr.replace(0, sbr.length(), "Hello World!");
		str = "Hello World!";
		
		System.out.println("Novo endereço da StringBuilder: " + sbr.hashCode());
		System.out.println("Novo endereço da String: " + str.hashCode());
	}
}
