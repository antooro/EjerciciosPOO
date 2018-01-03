package ejercicio15;

public class Barco {
	private String matricula;
	private double eslora;
	private int fabrica_year;
	
	public Barco(String matricula, double eslora, int fabrica_year){
		setMatricula(matricula);
		setEslora(eslora);
		this.fabrica_year = fabrica_year;
	}
	public void setMatricula(String matriucla){
		if (matricula == null){
			throw new IllegalArgumentException("Nulo mal");
		}
		if (matricula.isEmpty()){
			throw new IllegalArgumentException("vacio mal");
		}
		this.matricula = matricula;
	}
	
	public void setEslora(double eslora){
		if (eslora <=0){
			throw new IllegalArgumentException("no pot ser, tot mal");
		}
		
		this.eslora = eslora;
	}
	
	public double getModulo(){
		return (10*eslora);
	}
}
