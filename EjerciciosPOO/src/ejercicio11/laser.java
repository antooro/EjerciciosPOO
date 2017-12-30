package ejercicio11;

public class laser extends impresora{
	private int numpags;
	public laser(int numpags,String cartucho,String nombre_fabricante,String modelo,double precio,int[] puertos){
		super(cartucho,nombre_fabricante, modelo, precio, puertos);
		this.numpags = numpags;
		}
	public int getNumPags(){
		return numpags;
	}
}
