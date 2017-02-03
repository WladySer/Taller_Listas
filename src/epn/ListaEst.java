package epn;

public class ListaEst {
	public Nodo inicio;
	public int size;

	public boolean estaVacia(){
		return inicio==null;
	}
	
public void insertar(String a,String b){
	if (estaVacia()) 
		inicio = new Nodo(a,b);
	else
		if(seRepite(b)){
			System.out.println("Dato repetido");
		}else
			inicio = new Nodo(a,b,inicio); 
}

public boolean seRepite(String a){
	Nodo aux=inicio;
	while(aux!=null){
		if(aux.getStr2().compareToIgnoreCase(a)==0){
			return true;
		}
		aux=aux.getSiguiente();
	}
	return false;
}

public void imprimir(){
	Nodo aux=inicio;
	while(aux!=null){
		System.out.println(aux.getStr1() + " " +aux.getStr2());
		aux=aux.getSiguiente();
		}
	}
}