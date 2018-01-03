package ejercicio15;

public class yate extends deportivo {
	private int camarotes;
	
	public yate(double potencia,int camarotes,String matricula, double eslora, int fabrica_year){
		super(potencia, matricula,  eslora,  fabrica_year);
		setCamarotes(camarotes);
	}
	
	public void setCamarotes(int camarotes){
		if (camarotes <= 0){
			throw new IllegalArgumentException("Menor que 0");
		}
		this.camarotes = camarotes;
	}
	
	public int getCamarotes(){
		return camarotes;
	}
	
	@Override
	public double getModulo(){
		return super.getModulo()+getCamarotes();
	}
}
