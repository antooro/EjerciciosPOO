package ejercicio12;

public class Empleado {
	private String nombre;
	private int edad;
	private String nif;
	private double sueldo;
	
	
	public Empleado(String nombre,int edad,String nif){
		setNombre(nombre);
		setEdad(edad);
		setNif(nif);
	}
	
	public void setNombre(String nombre){
		assert (nombre.length()>0);
		assert (nombre != null);
		this.nombre = nombre;
	}
	
	public void setEdad(int edad){
		assert (edad > 0);
		this.edad = edad;
	}
	
	public void setNif(String nif){
		assert (nif.length() == 8);
		this.nif = nif;
		
	}

	public String getNombre() {
		String a = nombre;
		return a;
	}

	public int getEdad() {
		return edad;
	}

	public String getNif() {
		String a = nif;
		return a;
	}
	
	@Override
	public String toString(){
		return "Nombre de empleado " +nombre+" ,edad "+edad+" ,su dni es"+nif;
	}
	
	public double getSueldo(){
		return sueldo;
	}
}
