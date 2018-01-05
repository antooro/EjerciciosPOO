package ejercicio12;

public class EmpleadoTemporal extends Empleado {
	private String fechaAlta;
	private String fechaBaja;
	
	public EmpleadoTemporal(String fechaAlta, String fechaBaja, int edad, String nif, String nombre){
		super(nombre,edad,nif);
		this.fechaBaja = fechaBaja;
		this.fechaAlta = fechaAlta;
		
	}
	
	public double getSueldo(){
		return super.getSueldo();
	}
}
