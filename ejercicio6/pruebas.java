package ejercicio6;

public class pruebas {
	public static void main (String [] args){
		
		Reloj r = new Reloj(23,58,59);
		System.out.println(r.toString());
		r.avanzarsec();

		System.out.println(r.toString());
		r.ponerEnHora(4, 3, 32);

		System.out.println(r.toString());
	
	}
	
}
