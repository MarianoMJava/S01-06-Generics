package s0106n1ejercicio2;

public class GenericMethods<T> {
	
	private T atributo;
		
	public GenericMethods() {
		atributo = null;
	}
	
	public void setAtributo(T nuevoValor) {
		atributo=nuevoValor;
	}
	
	public T getAtributo() {
		return atributo;
	}
	



}
