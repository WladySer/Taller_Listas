package epn;

public class Nodo {
	private String str1;
	private String str2;
	private Nodo siguiente;

public Nodo(){
	str1=str2=null;
	siguiente=null;
}

public Nodo(String st1,String st2, Nodo sig){
	str1=st1;
	str2=st2;
	siguiente=sig;
}

public Nodo(String st1,String st2){
	str1=st1;
	str2=st2;
	siguiente=null;
}

public String getStr1() {
	return str1;
}
public void setStr1(String str1) {
	this.str1 = str1;
}
public String getStr2() {
	return str2;
}
public void setStr2(String str2) {
	this.str2 = str2;
}
public Nodo getSiguiente() {
	return siguiente;
}
public void setSiguiente(Nodo siguiente) {
	this.siguiente = siguiente;
}
}