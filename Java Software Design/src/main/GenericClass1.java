package main;

public class GenericClass1 <T>{
	// Properties
	private T password;
	
	// Constructors
	public GenericClass1() {}
	public GenericClass1(T password) {this.password = password;}
	
	// Behaviors
	public T getPassword() {return password;}
	public void setPassword(T password) {this.password = password;}
}
