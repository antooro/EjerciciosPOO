package ejercicio14;

public class prestamo implements acceso {
	private int doc;
	private int fecha;
	private String dni;
	
	public prestamo(int doc,int fecha,String dni){
		this.doc = doc;
		this.fecha = fecha;
		this.dni = dni;	
	}
	
	@Override
	public void reservar(documentos d){
		
	}
	@Override
	public void recoger(documentos d){
		
	}
	@Override
	public void devolver(documentos d){
	
	}
	
}
