package ejercicio14;

public class cd extends documentos{
	private String formato_cd;
	private String tipo_licencia;
	
	public cd(String titulo,String autor,String editorial,int year){
		super(titulo, autor,editorial, year);
		this.formato_cd = formato_cd;
		this.tipo_licencia = tipo_licencia;
	}
}
