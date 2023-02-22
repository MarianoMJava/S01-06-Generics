package s0106n1ejercicio1;

public class S0106N1Ejercicio1 {

	public static void main(String[] args) {

		NoGenericMethod primero = new NoGenericMethod("Laura", 2, "Esteban");

		NoGenericMethod segundo = new NoGenericMethod(2, "Laura", "Esteban");
		
		System.out.println(primero);
		
		System.out.println(segundo);

	}
}
