package ejercicio10;

public class CuentaJoven extends CuentaAhorro {
	private final float interes;
	public CuentaJoven(float interes, Cliente titular, float saldo){
		super(interes ,titular,saldo);
		assert(titular.getEdad()<25);
		assert (interes > 0);
		this.interes = interes;
		
	}
}
