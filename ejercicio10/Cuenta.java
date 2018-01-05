package ejercicio10;

public class Cuenta {
	
	private Cliente titular;
	private float saldo;
	
	public Cuenta(Cliente titular, float saldo){
		assert(titular!= null);
		this.titular = titular;
		setSaldo(saldo);
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setSaldo(float saldo){
		this.saldo = saldo;
	}
	public float getSaldo() {
		return saldo;
	}

	/**
	 * 
	 */
	public void reintegro(float cantidad){
		assert (cantidad>0 && getSaldo()-cantidad>=0);
		saldo -= cantidad;
	}
	
	public void ingreso(float cantidad){
		assert (cantidad >0);
		saldo += cantidad;
	}
}
