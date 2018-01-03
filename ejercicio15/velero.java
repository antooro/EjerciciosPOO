package ejercicio15;

public class velero extends Barco {
	private int mastiles;
	
	public velero(int mastiles,String matricula, double eslora, int fabrica_year){
		super( matricula,  eslora,  fabrica_year);
		setMastiles(mastiles);
		
	}
	public void setMastiles(int mastiles){
		if (mastiles <= 0){
			throw new IllegalArgumentException("No es posible");
		}
		this.mastiles = mastiles;
	}
	public int getMastiles(){
		return mastiles;
	}
	@Override
	public double getModulo(){
		return super.getModulo()+getMastiles();
	}
}
