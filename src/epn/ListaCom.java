package epn;

public class ListaCom {
	public Nodo inicio;
	public int size;

	public boolean estaVacia(){
		return inicio==null;
	}
	
public void insertar(String a,String b){
	Nodo aux=null;
	if (estaVacia()) 
		inicio = new Nodo(a,b);
	else
		if(seRepite(b)){
		aux=seRepiteN(b);
			aux.setStr1(a);
		}else
			inicio = new Nodo(a,b,inicio); 
}
public void insertar(String b){
	if (estaVacia()) 
		inicio = new Nodo(null,b);
	else
		if(seRepite(b)){
			System.out.println("Dato repetido");
		}else
			inicio = new Nodo(null,b,inicio); 
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
public Nodo seRepiteN(String a){
	Nodo aux=inicio;
	while(aux!=null){
		if(aux.getStr2().compareToIgnoreCase(a)==0){
			return aux;
		}
		aux=aux.getSiguiente();
	}
	return null;
}

public void imprimir(){
	Nodo aux=inicio;
	while(aux!=null){
		if(aux.getStr1()==null)
			System.out.println(aux.getStr2());
		
		aux=aux.getSiguiente();
		}
	
	}
}