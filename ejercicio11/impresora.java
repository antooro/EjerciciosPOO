package ejercicio11;

public class impresora extends salida {
	private String cartucho;
	public impresora(String cartucho ,String nombre_fabricante,String modelo,double precio,int[] puertos){
		super(nombre_fabricante,modelo,precio,puertos);
		this.cartucho = cartucho;
	}
	public String getCartucho(){
		return cartucho;
	}
}
