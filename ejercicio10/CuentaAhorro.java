package ejercicio10;

public class CuentaAhorro extends Cuenta{
	private final float interes;
	public CuentaAhorro(float interes, Cliente titular, float saldo){
		super(titular,saldo);
		assert (interes > 0);
		this.interes = interes;
	}

	public void pagainteres(){
		assert (getSaldo() > 1000 );
		setSaldo(getSaldo() + interes);
	}
}
