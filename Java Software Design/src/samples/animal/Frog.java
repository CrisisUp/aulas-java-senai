package samples.animal;

public class Frog extends Amphibian {

	@Override
	public void walk() {System.out.println("Sapo andando.");}

	@Override
	public void swin() {System.out.println("Vaca nadando.");}

	@Override
	public void born() {System.out.println("Vaca nascendo.");}

	@Override
	public void eat() {System.out.println("Sapo comendo.");}

	@Override
	public void grows() {System.out.println("Sapo crescendo.");}

	@Override
	public void reproduces() {System.out.println("Sapo reproduzindo.");}

	@Override
	public void die() {System.out.println("Vaca morrendo.");}
}
