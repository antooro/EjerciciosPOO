package ejercicio11;

public class componente{
	private String nombre_fabricante;
	private String modelo;
	private double precio;
	private int[] puertos;
	
	public componente(String nombre_fabricante,String modelo,double precio,int[] puertos){
		if (precio<=0){
			throw new IllegalArgumentException("Error, el precio no puede ser menor que cero");
		}
		this.nombre_fabricante = nombre_fabricante;
		this.modelo = modelo;
		this.precio = precio;
		this.puertos = puertos;
	}
	
	public String getnombre(){
		return nombre_fabricante;
	}
	public String getmodelo(){
		return modelo;
	}
	public int[] getPuertos(){
		return puertos;
	}
	public void setPrecio(double precio){
		this.precio = precio;
	}
	public double getPrecio(){
		return precio;
	}
}
