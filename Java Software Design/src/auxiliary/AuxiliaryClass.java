package auxiliary;

import main.Interface1;
import main.Interface2;

public class AuxiliaryClass implements Interface1, Interface2 {
//	@Override
//	public void interfaceMethod1() {
//		System.out.println("Outra coisa.");
//	}

	@Override
	public void interfaceMethod2() {System.out.println("Método 2 da interface 1.");}
}
