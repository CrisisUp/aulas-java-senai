package main;

public interface Interface1 {
	//public final static boolean interfaceVar = true;
	boolean INTERFACE_VAR = true;
	
	//void interfaceMethod1();
	
	default void interfaceMethod1() {System.out.println("Metodo 1 da interface 1.");};
//	
//	private void interfaceMethod1() {
//		System.out.println("Metodo 1 da interface 1.");
//	};
	
	void interfaceMethod2();
}
