package main;

import java.util.ArrayList;
import java.util.List;

public record Register(String SCIENTIFIC_NAME, String POPULAR_NAME, int AGE, double MASS, List<String> HABITAT) {
	// Construtor compacto
	public Register {
		HABITAT = new ArrayList<>(HABITAT); // criação de uma cópia defensiva
	}
	
	@Override
	public List<String> HABITAT() {
		return new ArrayList<>( HABITAT); // criação de uma cópia defensiva
	}
	
	@Override
	public String toString() {
		return "\nNome Científico = " + SCIENTIFIC_NAME + 
				"\nNome Popular = " + POPULAR_NAME + 
				"\nIdade = " + AGE + 
				"\nPeso = "+ MASS + 
				"\nHabitat = " + HABITAT;
	}
}

