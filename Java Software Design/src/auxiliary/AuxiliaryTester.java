package auxiliary;

import java.lang.reflect.Method;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import main.AbstractClass;
import main.Annotation1;
import main.Annotation2;
import main.ConcretClass;
import main.ConcreteClass1;
import main.ConcreteClass2;
import main.Tools;
import main.Enumeration;
import main.GenericClass1;
import main.GenericClass2;
import main.ImutableClass;
import main.Register;

public class AuxiliaryTester {
	public static void main(String[] args) {
		System.out.println("Inicio do roteiro 1.");
		
		ConcreteClass1 cc1 = new ConcreteClass1();
		ConcreteClass2 cc2 = new ConcreteClass2();
		
		cc1.setPassword(5555);
		cc2.setPassword(6666);
		
		System.out.println(cc1.getPassword());
		System.out.println(cc2.getPassword());
		
		System.out.println("Fim do roteiro 1.");
		System.out.println("--------------------");
		System.out.println("Inicio do roteiro 2.");
		
		//O polimorfismo usa como base o tipo da variável 
		AbstractClass ac1 = new ConcretClass();   // 9999
		ConcretClass cc3 = new ConcretClass();    // 3333
		System.out.println(ac1.password);
		System.out.println(cc3.password);
		
		ac1.sayHello(); // E aí, mano?! Foi feita a invocação do método virtual automaticamente
		cc3.sayHello(); // E aí, mano?!
		
		//ac1.originalSayHello(); Isso não funciona
		cc3.originalSayHello();
		
		ac1.sayHi();
		cc3.sayHi();
		
		System.out.println("Fim do roteiro 2.");
		System.out.println("--------------------");
		System.out.println("Inicio do roteiro 4.");
		
		System.out.println(ac1.INTERFACE_VAR);
		System.out.println(cc3.INTERFACE_VAR);
		
		AuxiliaryClass aux = new AuxiliaryClass();
		//aux.interfaceVar = false;
		System.out.println(aux.INTERFACE_VAR);
		aux.interfaceMethod1();
		//aux.interfaceMethod1();
		
		System.out.println("Fim do roteiro 4.");
		System.out.println("--------------------");
		System.out.println("Inicio do roteiro 6.");
		
		
		Tools t01 = new Tools();
		Tools t02 = new Tools();
		
		t01.option = 'b';
		t02.option = 'c'; // option -> variável de classe
		
		System.out.println(t01.option);
		System.out.println(t02.option);
		

		Tools.option = 'd';
		System.out.println(Tools.option);
		
		Tools.printOption();
		
		Tools.display("Um texto qualquer");
		Tools.display(25.32);
		Tools.display(25.32f);
		
		double value = Tools.sum(10, 15.976);
		
		Tools.sum(10, 15.976);
		
		System.out.println((Tools.sum(10, 15.976)) + 100);
		
		System.out.println("Fim do roteiro 6.");
		System.out.println("--------------------");
		System.out.println("Inicio do roteiro 7.");
		
		ConcreteClass2 cc4 = new ConcreteClass2(7777); 
		ConcreteClass2 cc5 = new ConcreteClass2(7779); 
		
		System.out.println("Fim do roteiro 7.");
		System.out.println("--------------------");
		System.out.println("Inicio do roteiro 8.");
		
		Enumeration test = Enumeration.ENUM_OBJECT_1; // não usar NEW aqui
		System.out.println(test);
		System.out.println(Enumeration.ENUM_OBJECT_2);
		
		// Enumeration.ENUM_OBJCT_1.VALUE_1 = 100; 
		// System.out.println(test.VALUE_1); funcionaria se VALUE_1 fosse public.
		
		System.out.println(Enumeration.ENUM_OBJECT_1.getVALUE_1());
		System.out.println(Enumeration.ENUM_OBJECT_1.getVALUE_2());
		System.out.println(Enumeration.ENUM_OBJECT_2.getVALUE_1());
		System.out.println(Enumeration.ENUM_OBJECT_2.getVALUE_2());
		
		System.out.println("Fim do roteiro 8.");
		System.out.println("--------------------");
		System.out.println("Inicio do roteiro 9.");
		
		List<String> habitat = new ArrayList<>();
		//habitat.add("Florestas Tropicais");
		//habitat.add("Florestas Decíduas");
		//habitat.add("Bosques de Arbustos");
		//habitat.add("Terra Firme");
		//habitat.add("Savanas");
		habitat.addAll(Arrays.asList("Florestas Tropicais", "Florestas Decíduas", "Bosques de Arbustos","Terra Firme", "Savanas"));
		
		ImutableClass ic1 = new ImutableClass("Mustela putorius furo", "Furão", 4, 2.5, habitat);
		System.out.println(ic1);
		
		habitat.add("Oceanos"); // A classe está protegida. Não aceita 
		System.out.println(ic1);
		
		habitat.clear();
		habitat.add("Oceanos");
		
		ImutableClass ic2 = new ImutableClass("Galeocerdo cuvier", "Tubarão Tigre", 20, 250.0, habitat);
		System.out.println(ic2);
		
		System.out.println("Fim do roteiro 9.");
		System.out.println("--------------------");
		System.out.println("Inicio do roteiro 10.");
		
		List<String> habitat2 = new ArrayList<>();
		habitat2.addAll(Arrays.asList("Florestas Tropicais", "Florestas Decíduas", "Bosques de Arbustos","Terra Firme", "Savanas"));
		
		Register rg1 = new Register("Mustela putorius furo", "Furão", 4, 2.5, habitat2);
		System.out.println(rg1);
		
		habitat2.add("Oceanos");
		System.out.println(rg1);
		
		System.out.println("Fim do roteiro 10.");
		System.out.println("--------------------");
		System.out.println("Inicio do roteiro 11.");
		
		//GenericClass1 gc1 = new GenericClass1();
		GenericClass1<String> gc1 = new GenericClass1<>();
		System.out.println(gc1.getPassword());
		
		//gc1.setPassword(6666);
		gc1.setPassword("senha"); // defini gc1 como String acima
		System.out.println(gc1.getPassword());
		
		//int password = (int) gc1.getPassword(); // casting (conversão forçada) (*1)
		//Object password = gc1.getPassword(); // Object (*2)
		//System.out.println(password);
		System.out.println(gc1.getPassword());
		
		GenericClass1<Integer> gc2 = new GenericClass1<>();
		gc2.setPassword(123456); // defini gc2 como Integer (wrapper de int) acima
		System.out.println(gc2.getPassword());
		
		GenericClass2<Integer, String> gc3 = new GenericClass2<>();
		gc3.setPassword(7777);
		gc3.setDescription("Um texto qualquer");
		
		System.out.println(gc3.getPassword());		
		System.out.println(gc3.getDescription());
		
		System.out.println("Fim do roteiro 11.");
		System.out.println("--------------------");
		System.out.println("Inicio do roteiro 12.");
		
		Character char1 = 'A';
		Tools.display(char1);
		
		Method[] methods = Tools.class.getDeclaredMethods();
		for(Method temp : methods) {
			if(temp.isAnnotationPresent(Annotation1.class)) {
				Annotation1 a1 = temp.getAnnotation(Annotation1.class);
				System.out.println("Método anotado: " + temp.getName());
				System.out.println("Conteúdo da anotação: " + a1.value());
			}
			if(temp.isAnnotationPresent(Annotation2.class)) {
				System.out.println("Olá, sou a anotation2 e passei por aqui.");
			}
		}
		
		
		
		
		
		
		
}}
