package main;

public class ConcretClass extends AbstractClass {
	// Properties
	public int password = 3333;
	
	// Constructors
	public ConcretClass() {}
	public ConcretClass(int password) {this.password = password;}

	// Behaviors
	@Override // -> ajuda a evitar erros de grafia.
	public void sayHello() {System.out.println("E aí, mano?!");}
	
	public void originalSayHello() {super.sayHello();}

	// método obrigatório, como se tivesse cumprindo um contrato.
	@Override
	public void sayHi() {System.out.println("Oi!");}

	// Implementação Obrigatória aqui
	@Override
	public void interfaceMethod2() {System.out.println("Método 2 da interface 1.");}
}
