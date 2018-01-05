package ejercicio12;

public class EmpleadoPorHoras extends Empleado {
	private final double precioHora;
	private int numHoras;
	
	public EmpleadoPorHoras( int edad, String nif, String nombre, int numHoras, int precioHora){
		super( nombre,edad,nif);
		setNumHoras(numHoras);
		assert (precioHora>0);
		this.precioHora = precioHora;
	}
	/**
	 * @assert.pre El numero de horas debe ser mayor que cero
	 * @param numHoras
	 */
	public void setNumHoras(int numHoras){
		assert (numHoras > 0);
		this.numHoras = numHoras;
	}
	
	public double getSueldo(){
		return precioHora*numHoras;
	}

}
