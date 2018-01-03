package ejercicio15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 * Clase que implementa alquiler de barcos en un puerto
 * @author antooro
 *
 */
public class Alquiler {
	private String nombre;
	private String dni;
	private LocalDate fechaInicial;
	private LocalDate fechaFinal;

	private int posamarre;
	private Barco barco;
	
	/**
	 * Inicializa el alquiler con los argumentos introducidos
	 * @param nombre
	 * @param dni
	 * @param fechainit
	 * @param fechafin
	 * @param posamarre
	 * @param barco
	 */
	public Alquiler(String nombre,String dni, String fechainit,String fechafin,int posamarre,Barco barco){
		this.nombre = nombre;
		this.dni = dni;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
		this.posamarre = posamarre;
		this.barco = barco;
	}
	
	public long getDiasAlquiler(){
		return fechaInicial.until(fechaFinal, ChronoUnit.DAYS);
	}
	
	public double getPrecioAlquiler(){
		return 12*barco.getModulo()*getDiasAlquiler();
	}
}
