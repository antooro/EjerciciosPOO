package ejercicio10;

public class CuentaCredito extends Cuenta{
	private final float comision;
	private final float minimo;
	
	public CuentaCredito(float comision, float minimo, Cliente titular, float saldo){
		super(titular,saldo);
		assert (comision >0);
		this.comision = comision;
		assert (minimo<0);
		this.minimo = minimo;
	}
	
	@Override
	public void reintegro(float cantidad){
		assert (cantidad>0 && getSaldo()-cantidad>=minimo);
		setSaldo(getSaldo()-cantidad);
	}
	
	public void cobracomision(){
		assert (comision>0 && getSaldo()-comision>=minimo);
		setSaldo(getSaldo()-comision);
	}
	
}
