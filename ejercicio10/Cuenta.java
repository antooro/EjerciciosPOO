package ejercicio10;

public class Cuenta {
	
	private Cliente titular;
	private float saldo;
	
	public Cuenta(Cliente titular){
		assert(titular!= null);
		this.titular = titular;
		this.saldo = 0;
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
		assert(saldo - cantidad > 0) :"No puedes sacar mas dinero del que tienes";
		saldo -= cantidad;
	}
	
	public void ingreso(float cantidad){
		assert (cantidad >0);
		saldo += cantidad;
	}
}
