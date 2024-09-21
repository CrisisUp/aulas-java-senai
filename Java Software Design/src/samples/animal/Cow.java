package samples.animal;

public class Cow extends Mammal implements Terrestrial {

	@Override
	public void born() {System.out.println("Vaca nascendo.");}

	@Override
	public void eat() {System.out.println("Vaca comendo.");}

	@Override
	public void grows() {System.out.println("Vaca crescendo.");}

	@Override
	public void reproduces() {System.out.println("Vaca reproduzindo.");}

	@Override
	public void die() {System.out.println("Vaca morrendo.");}

	@Override
	public void walk() {System.out.println("Vaca andando.");}
}
