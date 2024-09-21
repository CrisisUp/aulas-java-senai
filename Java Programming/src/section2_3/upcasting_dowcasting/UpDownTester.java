package section2_3.upcasting_dowcasting;

import section2_3.Bicicleta;
import section2_3.MountainBike;

public class UpDownTester {
	public static void main(String[] args) {
		// upcasting -> *implicito, mas podemos explicitar como aqui
		Bicicleta mb = (Bicicleta) new MountainBike("MB001", "Aço Carbono", "Raios de metal", 20, 18, 25.0, "Soft");
		System.out.println(mb);
		// downcasting -> *explicito sempre
		System.out.println(((MountainBike) mb).getTipoDeAmortecedor());
	}
}
