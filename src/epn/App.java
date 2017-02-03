package epn;


public class App {

	public static void main(String[] args) {
		ListaEst listaest = new ListaEst();
		
		System.out.println("\nEstudiantes inscritos en la asignatura");
		 listaest.insertar ( "Sergio Villacres" ,"1712365488");
		 listaest.insertar("Andres Huertas","1763255484");
		 listaest.insertar("Luis Segura","1712365445");
		 listaest.insertar("Sergio Villacres","1712365488");
		 
		 
		 listaest.imprimir();
		 System.out.println("\n");

		 System.out.println("\nlista con Alimentos no completados");
		 ListaCom listacom = new ListaCom();
		 listacom.insertar("3", "limon");
		 listacom.insertar("peras");
		 listacom.insertar("5","tomate");
		 listacom.insertar("3", "limon");
		 listacom.insertar("uvas");
		 listacom.insertar("7","manzana");
		 listacom.insertar("huevos");
		 
		 listacom.imprimir();
	}

}