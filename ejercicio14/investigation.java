package ejercicio14;

public class investigation extends documentos {
	private int volumen;
	private int numero;
	private int mes;
	private int codigo;
	
	public investigation(String titulo,String autor,String editorial,int year,int volumen,int numero,int mes,int codigo){
		super(titulo, autor, editorial, year);
		this.volumen = volumen;
		this.numero = numero;
		this.mes = mes;
		this.codigo = codigo;
	}
}
