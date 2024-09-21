package main;

import java.util.ArrayList;
import java.util.List;

public final class ImutableClass {
	// Generic Properties 
	private final String SCIENTIFIC_NAME, POPULAR_NAME; // --> final obrigatório em todos os campos
	private final int AGE; // --> final obrigatório em todos os campos
	private final double MASS; // --> final obrigatório em todos os campos
	private final List<String> HABITAT;
		
	// Constructors
	// public ImutableClass() {} --> construtor padrão deve ser removido
	
	// O construtor deve ser capaz de inicializar todos os campos
	public ImutableClass(String SCIENTIFIC_NAME, String POPULAR_NAME, int AGE, double MASS, List<String> HABITAT) {
		this.SCIENTIFIC_NAME = SCIENTIFIC_NAME;
		this.POPULAR_NAME = POPULAR_NAME;
		this.AGE = AGE;
		this.MASS = MASS;
		//this.HABITAT = HABITAT;
		this.HABITAT = new ArrayList<>(HABITAT);
	}
		
	// Generic Behaviors
	//public abstract void born(); --> excluir todos métodos abstracts 
	//public abstract void eat(); --> excluir todos métodos abstracts 
	//public abstract void grows(); --> excluir todos métodos abstracts 
	//public abstract void reproduces(); --> excluir todos métodos abstracts 
	//public abstract void die(); --> excluir todos métodos abstracts 
		
	public String getSCIENTIFIC_NAME() {return SCIENTIFIC_NAME;}
	// todos os métodos set devem ser removidos (métodos mutadores)
	//public void setSCIENTIFIC_NAME(String SCIENTIFIC_NAME) {this.SCIENTIFIC_NAME = SCIENTIFIC_NAME;}
		
	public String getPOPULAR_NAME() {return POPULAR_NAME;}
	// todos os métodos set devem ser removidos
	//public void setPOPULAR_NAME(String POPULAR_NAME) {this.POPULAR_NAME = POPULAR_NAME;}
		
	public int getAGE() {return AGE;}
	// todos os métodos set devem ser removidos
	//public void setAGE(int AGE) {this.AGE = AGE;}
		
	public double getMASS() {return MASS;}
	// todos os métodos set devem ser removidos
	//public void setMASS(double MASS) {this.MASS = MASS;}
	
	//public List<String> getHABITAT() {return HABITAT;}
	public List<String> getHABITAT() {return new ArrayList<>(HABITAT);}

	@Override
	public String toString() {
		return "\nNome Científico = " + SCIENTIFIC_NAME + "\nNome Popular = " + POPULAR_NAME + "\nIdade = " + AGE + "\nPeso = "
				+ MASS + "\nHabitat = " + HABITAT;
	}	
}
