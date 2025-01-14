package section4_3;

public class RecursionExample {
	public static void main(String[] args) {
		//System.out.println(fatorialWithFor(0));
		//System.out.println(fatorialWithRecursion(0));
		//recurseMethod(5);
		System.err.println(fibonacci(9));
		
		for (int i = 0; i < 10; i++) {System.out.print(fibonacci(i) + " ");}
	}

	public static int fatorialWithFor(int num) {
		int result = num;
		for (int i = num - 1; i > 0; i--) {result *= i;}
		return result;
	}

	public static int fatorialWithRecursion(int num) {
		if (num <= 1) {return 1;}
		return num * fatorialWithRecursion(num - 1);
	}
	
	public static void recurseMethod(int num) {
		if (num == 0) {return;}
		else {
			System.out.println("Hello " + num);
			recurseMethod(num - 1);
			System.out.println("" + num);
			return;
		}
	}
	
	public static int fibonacciWithFor(int index) {
		int[] fib = new int[index];
		fib[0] = 0;
		fib[1] = 1;
		
		for (int i = 2; i < index; i++) {fib[i] = fib[i - 1] + fib[i - 2];}
		return fib[index - 1];
	}
	
	public static int fibonacci(int index) {
		if (index <= 1) {return index;}
		return fibonacci(index -1 ) + fibonacci(index - 2);
	}
}
