package main;

public enum Enumeration {
	// Objects
	ENUM_OBJECT_1, 
	ENUM_OBJECT_2 (123), // Instanciar esses objetos dentro da propria classe
	ENUM_OBJECT_3 (456, "Texto-3");
	
	// Properties
	public final int VALUE_1;
	public final String VALUE_2;
	
	// Constructors (private por PADRÃO)
	Enumeration() {
		VALUE_1 = 000;
		VALUE_2 = "Texto-1-PADRÃO";
	}
	
	Enumeration(int VALUE_1) {
		this.VALUE_1 = VALUE_1;
		this.VALUE_2 = "Texto-2";
	}
	
	Enumeration(int VALUE_1, String VALUE_2) {
		this.VALUE_1 = VALUE_1;
		this.VALUE_2 = VALUE_2;
	}
	
	// Behaviors
	public int getVALUE_1() {return VALUE_1;}
	public String getVALUE_2() {return VALUE_2;}
	
	/*for(int i = 0; i < Enumeration.values().length; i++) {
		System.out.println(Enumeration.values()[i]);
	}*/
}
