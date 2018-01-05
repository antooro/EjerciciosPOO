package ejercicio11;

public class pruebapc {

	public static void main(String[] args) {
		int [] puerto = {2,3,4};
		unidadcentral cpu = new unidadcentral("intel","i7",299.0,puerto);
		raton r = new raton("manolo","dell","288",10.0,puerto);
		pantalla p = new pantalla("dell","288",10.0,puerto);
		teclado t = new teclado("manolo","dell","288",15.4,puerto);
		Ordenador pc = new Ordenador(cpu, t, p);
		System.out.println(pc.precioTotal());
		pc.eliminaComponente(cpu);
	}

}
