package ejercicio11;

import java.util.ArrayList;

public class Ordenador {
	private ArrayList<componente> ordenador;
	public Ordenador(unidadcentral a,entrada b,salida c){
		if ( c==null || a == null || b == null){
			throw new IllegalArgumentException("Error, no se cumplen los requisitos minimos para los componentes");
		}
		ordenador = new ArrayList<componente>();
		ordenador.add(a);
		ordenador.add(b);
		ordenador.add(c);
	}
	
		
	public boolean eliminaEntrada(){

		int co = 0;
		for (componente c : ordenador){
			if (c instanceof entrada){
				co++;
			}
		}
		if (co >1){return true;}
		else{ return false;}
	}
	public boolean eliminaSalida(){
		int co = 0;
		for (componente c : ordenador){
			if (c instanceof salida){
				co++;
			}
		}
		if (co >1){return true;}
		else{ return false;}
	}
	
	
	public void agregaComponente(componente c){
		if (c == null){
			throw new IllegalArgumentException("Error");
		}
		ordenador.add(c);
	}
	
	public void eliminaComponente(componente c){
		if (c == null){
			throw new IllegalArgumentException("Error");
		}
		if (!(ordenador.contains(c))){
			throw new IllegalArgumentException("Error");
		}
		if (c instanceof salida && eliminaSalida()){
			ordenador.remove(c);
		}
		else if (c instanceof entrada && eliminaEntrada()){
			ordenador.remove(c);
		}
	}
	public double precioTotal(){
		double prix = 0;
		for(componente c: ordenador){
			prix += c.getPrecio();
		}
		return prix;
	}
	
}
