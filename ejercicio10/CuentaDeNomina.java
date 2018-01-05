package ejercicio10;

public class CuentaDeNomina extends Cuenta{
	private final float interes;
	private float nomina;
	private final float comision;
	
	public CuentaDeNomina(float comision, float nomina, float interes, Cliente titular, float saldo){
		super(titular);
		assert (comision >0);
		this.comision = comision;
		assert (interes >0);
		this.interes = interes;
		assert(nomina> 0);
		this.nomina = nomina;
		assert (getSaldo()>=-nomina);
		setSaldo(saldo);
		
	}
	
	@Override
	public void reintegro(float cantidad){
		assert (cantidad>0 && getSaldo()-cantidad>=-nomina);
		setSaldo(getSaldo()-cantidad);
	}
	
	public void cobracomision(){
		assert (comision>0 && getSaldo()-comision>=-nomina);
		setSaldo(getSaldo()-comision);
	}
	
	public void pagainteres(){
		assert (getSaldo() >0);
		setSaldo(getSaldo() + interes);
	}
}
