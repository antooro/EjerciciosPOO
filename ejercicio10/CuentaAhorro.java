package ejercicio10;

public class CuentaAhorro extends Cuenta{
	private final float interes;
	public CuentaAhorro(float interes, Cliente titular, float saldo){
		super(titular);
		assert (interes > 0);
		this.interes = interes;
		assert (getSaldo()>=0);
		setSaldo(saldo);
	}

	public void pagainteres(){
		assert (getSaldo() > 1000 );
		setSaldo(getSaldo() + interes);
	}
}
