package section4_1;
import java.util.ArrayList;

public class StringExample {
	public static void main(String[] args) {
		String str0 = "Um texto qualquer muito grande com muitos espaços";
		String[] lista = str0.split(" ");
		
		for (String arrayTemporario : lista) {System.out.println(arrayTemporario);}
		
		String str = "Um texto qualquer\n";
		for (int i = 0; i < str.length(); i++) {System.out.print(str.charAt(i));}
		for (int i = str.length() - 1; i >= 0; i--) {System.out.print(str.charAt(i));}

		String str1 = str.substring(0, 2);
		String str2 = str.substring(3, 8);
		String str3 = str.substring(9, 16);
		System.out.println("\n" + str3 + " " + str2 + " " + str1);
		
		parseString(str);

	}

	public static void searchChar(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void parseString(String str) {
		ArrayList<String> list = new ArrayList<String>();
		while (str.length() > 0) {
			int index = str.indexOf(" ");
			if (index > -1) {
				list.add(str.substring(0, index));
				str = str.substring(index + 1);
			} else {
				break;
			}
		}
		list.add(str);
		for (String arrayTemporario : list) {
			System.out.print(arrayTemporario + " ");
		}
	}
}
