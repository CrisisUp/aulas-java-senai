package samples.animal;

public abstract class Animal {
	// Generic Properties 
	private String scientificName, popularName;
	private int age;
	private double mass;
	
	// Constructors
	public Animal() {} // construtor padrão 
	
	public Animal(String scientificName, String popularName) {
		this.scientificName = scientificName;
		this.popularName = popularName;
	}

	public Animal(String scientificName, String popularName, int age, double mass) {
		this(scientificName,popularName); // usando o construtor de cima 
		this.age = age;
		this.mass = mass;
	}
	
	// Generic Behaviors
	public abstract void born(); 
	public abstract void eat(); 
	public abstract void grows(); 
	public abstract void reproduces(); 
	public abstract void die(); 
	
	public String getScientificName() {return scientificName;}
	public void setScientificName(String scientificName) {this.scientificName = scientificName;}
	
	public String getPopularName() {return popularName;}
	public void setPopularName(String popularName) {this.popularName = popularName;}
	
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
	public double getMass() {return mass;}
	public void setMass(double mass) {this.mass = mass;}

	@Override
	public String toString() {
		return "\nNome Científico = " + scientificName + "\nNome Popular = " + popularName + "\nIdade = " + age + "\nPeso = "
				+ mass;
	}
}
