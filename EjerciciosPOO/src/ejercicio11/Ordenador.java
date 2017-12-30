package ejercicio11;

import java.util.ArrayList;

public class Ordenador {
	private ArrayList<componente> ordenador;
	public Ordenador(componente a,componente b,componente c){
		if (!componentescorrectos()){
			throw new IllegalArgumentException("Error, no se cumplen los requisitos minimos para los componentes");
		}
		ordenador.add(a);
		ordenador.add(b);
		ordenador.add(c);
	}
	
	public boolean componentescorrectos(){
		if(minimoentrada() && minimosalida() && unidadcentral()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean minimoentrada(){
		for (componente c : ordenador){
			if (c instanceof entrada){
				return true;
			}
		}
		return false;
	}
	public boolean minimosalida(){
		for (componente c : ordenador){
			if (c instanceof salida){
				return true;
			}
		}
		return false;
	}
	public boolean unidadcentral(){
		for (componente c : ordenador){
			if (c instanceof unidadcentral){
				return true;
			}
		}
		return false;
	}
}
