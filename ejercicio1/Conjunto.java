package ejercicio1;

import java.util.ArrayList;

public class Conjunto<G> {
	private ArrayList<G> lista;
	
	
	public Conjunto (){
		lista = new ArrayList<G>();
	}
	public void agrega(G elemento){
		if (elemento== null){
			throw new IllegalArgumentException("Error, elemento nulo");
		}
		else if (!esta(elemento)){
			lista.add(elemento);
		}
	}
	
	public boolean esta(G elemento){
		if (elemento== null){
			throw new IllegalArgumentException("Error, elemento nulo");
		}
		else {
			return lista.contains(elemento);
		}
	}
	/**
	 * @throws Excepcion si el elemento es nulo
	 * @param elemento
	 */
	public void elimina(G elemento){
		if (elemento== null){
			throw new IllegalArgumentException("Error, elemento nulo");
		}
		else if (lista.contains(elemento)){
			lista.remove(elemento);
		}
	}
	
	public boolean esVacio(){
		if (lista.size()==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int getCardinal(){
		return lista.size();
	}
	public ArrayList<G> getElementos(){
		return this.lista;
	}
	public Conjunto<G> union(Conjunto<G> parte2){
		if (parte2 == null){
			throw new IllegalArgumentException("Error, elemento nulo");
		}
		Conjunto <G> conjuntoUnion = new Conjunto<G>();
		for (G elem1 : this.lista){
			conjuntoUnion.agrega(elem1);
		}
		for (G elem2 : parte2.getElementos()){
			conjuntoUnion.agrega(elem2);
		}
		return conjuntoUnion;
	}
	public Conjunto<G> intersec(Conjunto<G> parte2){
		if (parte2 == null){
			throw new IllegalArgumentException("Error, elemento nulo");
		}
		Conjunto <G> conjuntointersec = new Conjunto<G>();
		for (G elem1 : this.lista){
			if (parte2.esta(elem1)){
				conjuntointersec.agrega(elem1);
			}
		}
		return conjuntointersec;
	}
	public Conjunto<G> resta(Conjunto<G> parte2){
		if (parte2 == null){
			throw new IllegalArgumentException("Error, elemento nulo");
		}
		Conjunto <G> conjuntorest = new Conjunto<G>();
		for (G elem1 : this.lista){
			if (parte2.esta(elem1)){
				conjuntorest.agrega(elem1);
			}
		}
		for (G elem2 : conjuntorest.getElementos()){
			if (this.esta(elem2)){
				conjuntorest.agrega(elem2);
			}
		}
		return conjuntorest;
	}
}
