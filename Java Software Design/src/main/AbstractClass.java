package main;

public abstract class AbstractClass implements Interface1 {
	// Properties
	public int password;
	
	// Constructors
	public AbstractClass() {password = 9999;}
	public AbstractClass(int password) {this.password = password;}
	
	// Behaviors
	public void sayHello() {System.out.println("Olá!");}
	
	// método abstrato não pode ser implementado aqui
	//public abstract void sayHi() {}
	
	public abstract void sayHi();
}
