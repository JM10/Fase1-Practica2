/*Autor: José Mauricio Us De Leon
 * Carnet: 201212661
 * 
 * */

package Lista;

public class Lista {
	public static void main(String[] args) {

		
		// en las siguientes Lineas se crean,se agregan datos tanto al inicio como al final de la lista
		//tambien se imprime la lista, se imprime el tamanio de la lista
		//se eliminan tanto del inicio como del final de la lista.
		Lista_Vagon lista=new Lista_Vagon();
		lista.CrearLista(0);//LLamado a metodo crear lista
		System.out.println("==========|==========|==========|==========");
		lista.AgregarInicio(50);//Llamado a metodo agregar al inicio lista
		lista.AgregarInicio(60);//Llamado a metodo agregar al inicio lista
		lista.AgregarInicio(70);//Llamado a metodo agregar al inicio lista
		lista.AgregarFinal(80);//Llamado a metodo agregar al final lista
		lista.AgregarFinal(90);//Llamado a metodo agregar al final lista
		lista.AgregarFinal(100);//Llamado a metodo agregar al final lista
		lista.AgregarInicio(110);//Llamado a metodo agregar  al inicio lista
		lista.AgregarFinal(120);//Llamado a metodo agregar final  lista
		lista.AgregarInicio(130);//Llamado a metodo agregar al inicio lista
		lista.AgregarFinal(140);//Llamado a metodo agregar al final lista
		lista.Imprimir();//Llamado a metodo imprimir
		System.out.println("==========|==========|==========|==========");
		lista.Tamaño();// Llamado al metodo tamanio de la lista
		System.out.println("==========|==========|==========|==========");
		lista.EliminarInicio();//Llamado al metodo Eliminar al inicio de la lista
		lista.ExtraerInicio();//Llamado al metodo Eliminar al inicio de la lista
		lista.EliminarFinal();//Llamado al metodo Eliminar al inicio de la lista
		lista.Imprimir();//Llamado al metodo imprimir
		System.out.println("==========|==========|==========|==========");
		lista.Tamaño();//Llamado al metodo tamanio de la lista
	}
}
