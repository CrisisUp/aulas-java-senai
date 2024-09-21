package samples.animal;

public class Whale extends Mammal implements Aquatic {
	@Override
	public void born() {System.out.println("Baleia nascendo.");}

	@Override
	public void eat() {System.out.println("Baleia comendo.");}

	@Override
	public void grows() {System.out.println("Baleia crescendo.");}

	@Override
	public void reproduces() {System.out.println("Baleia reproduzindo.");}

	@Override
	public void die() {System.out.println("Baleia morrendo.");}

	@Override
	public void swin() {System.out.println("Baleia nadando.");}
}
