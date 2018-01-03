package ejercicio6;

public class Reloj {
	private int segundos;
	private int minutos;
	private int hora;
	
	public Reloj(int hora,int minutos,int segundos){
		setSegundos(segundos);
		setMinutos(minutos);
		sethora(hora);
	}
	
	public void setSegundos(int segundos){
		if (segundos<0 || segundos>59){
			throw new IllegalArgumentException("Numero de segundos no valido");
		}
		this.segundos = segundos;
	}
	
	public void setMinutos(int minutos){
		if (minutos<0 || minutos>59){
			throw new IllegalArgumentException("Numero de minutos no valido");
		}
		this.minutos = minutos;
	}
	
	public void sethora(int hora){
		if (hora<0 || hora>23){
			throw new IllegalArgumentException("Numero de hora no valido");
		}
		this.hora = hora;
	}
	
	@Override
	public String toString(){
		String a;
		String b;
		String c;
		if (hora<10){
			 a = "0" + Integer.toString(hora);
		}
		else{
			a = Integer.toString(hora);
		}
		if (minutos<10){
			 b = "0" + Integer.toString(minutos);
		}
		else{
			b = Integer.toString(minutos);
		}
		if (segundos<10){
			 c = "0" + Integer.toString(segundos);
		}
		else{
			c = Integer.toString(segundos);
		}
		
		return a+":"+b+":"+c;
	}
	
	public void ponerEnHora(int hora,int minutos,int segundos){
		setSegundos(segundos);
		setMinutos(minutos);
		sethora(hora);
	}
	
	public void reset(){
		setSegundos(00);
		setMinutos(00);
		sethora(00);
	}
	public void avanzarsec(){
		System.out.println((segundos+1==60));
		if (segundos + 1  == 60){
			setSegundos(0);
			if (minutos + 1 == 60){
				setMinutos(0);
				if (hora + 1 == 24){
					sethora(0);
				}
				else{
					sethora(hora+1);
				}
			}
			else{
				setMinutos(minutos+1);
			}
		}
		else{
			setSegundos(segundos+1);
		}
	}
	
}
