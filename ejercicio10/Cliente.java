package ejercicio10;

public class Cliente {
	private String nombre;
	private int edad;
	
	public Cliente(String nombre, int edad){
		assert (nombre != null);
		this.nombre = nombre;
		assert (edad > 0);
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	
	
}
