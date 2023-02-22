package s0106n1ejercicio2;

public class S0106N1Ejercicio2 {

	public static void main(String[] args) {

		GenericMethods<String> primero = new GenericMethods<String>();

		primero.setAtributo("Juan");

		System.out.println(primero.getAtributo());
		

		GenericMethods<Integer> segundo = new GenericMethods<Integer>();

		segundo.setAtributo(2);

		System.out.println(segundo.getAtributo());
		

		Persona persona = new Persona("Mariano", "Anibal", 32);

		GenericMethods<Persona> personaGen = new GenericMethods<Persona>();

		personaGen.setAtributo(persona);

		System.out.println(personaGen.getAtributo());
		

		GenericMethods<Integer> tercero = new GenericMethods<Integer>();

		tercero.setAtributo(15);

		System.out.println(tercero.getAtributo());
		
		
		GenericMethods<String> cuarto = new GenericMethods<String>();

		cuarto.setAtributo("Laura");

		System.out.println(cuarto.getAtributo());

	}

}
