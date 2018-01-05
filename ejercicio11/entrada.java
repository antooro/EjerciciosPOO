package ejercicio11;

public abstract class entrada extends componente {
	private String conector;
	public entrada(String conector,String nombre_fabricante,String modelo,double precio,int[] puertos){
		super(nombre_fabricante, modelo, precio,puertos);
		this.conector = conector;
	}
	public String getconector(){
		return conector;
	}
}
