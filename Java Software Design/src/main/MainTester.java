package main;

public class MainTester {
	public static void main(String[] args) {
		System.out.println("Inicio do roteiro 1.");
		
		ConcreteClass1 cc1 = new ConcreteClass1();
		ConcreteClass2 cc2 = new ConcreteClass2();
		
		cc1.setPassword(5555);
		cc2.setPassword(6666);
		
		System.out.println(cc1.getPassword());
		System.out.println(cc2.getPassword());
		
		System.out.println("Fim do roteiro 1.");
		System.out.println("--------------------");
		System.out.println("Inicio do roteiro 2.");
		
		// Não é possível instanciar classe abstrata
		//AbstractClass ac1 = new AbstractClass();
		AbstractClass ac1 = new ConcretClass();
		System.out.println(ac1.password);
		
		System.out.println("Fim do roteiro 2.");
		System.out.println("--------------------");
		
		System.out.println("Inicio do roteiro 4.");
		System.out.println(ac1.INTERFACE_VAR);
		
		ac1.interfaceMethod1();
		ac1.interfaceMethod2();
	}
}
