package ejercicio14;

public class revistas extends documentos {
	private int volumen;
	private int numero;
	private int mes;
	
	public revistas(String titulo,String autor,String editorial,int year,int volumen,int numero,int mes){
		super(titulo, autor, editorial, year);
		this.volumen = volumen;
		this.numero = numero;
		this.mes = mes;
	}
}
