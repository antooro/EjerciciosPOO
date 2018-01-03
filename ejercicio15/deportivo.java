package ejercicio15;

public class deportivo extends Barco{
	private double potencia;
	
	public deportivo(double potencia,String matricula, double eslora, int fabrica_year){
		super( matricula,  eslora,  fabrica_year);
		
		if (potencia<=0){
			throw new IllegalArgumentException("La potencia tiene que ser mayor que 0");
		}
		this.potencia = potencia;
		
	}
	
	public double getPotencia(){
		return potencia;
	}
	@Override
	public double getModulo(){
		return super.getModulo()+getPotencia();
	}
	
}
