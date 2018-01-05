package ejercicio12;

public class EmpleadoFijo extends Empleado {
	private int yearAlta;
	private int yearActual;
	private double complemento;
	
	public EmpleadoFijo( int yearAlta ,int edad, String nif,String nombre){
		super(nombre,edad,nif);
		assert (yearAlta>0);
		this.yearAlta = yearAlta;
	}
	
	public double getSueldo(){
		return super.getSueldo() +complemento*(yearActual-yearAlta);
	}
}
