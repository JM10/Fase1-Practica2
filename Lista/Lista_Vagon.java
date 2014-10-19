package Lista;

public class Lista_Vagon {
	Nodo_Vagon primero;
	Nodo_Vagon ultimo;
	//private Nodo_Vagon vagon;

	public Lista_Vagon() {
		primero=null;
		ultimo=null;
	}

	public void CrearLista(int vagon){
		Nodo_Vagon nuevovagon=new Nodo_Vagon(vagon,primero);
		primero=nuevovagon=null;
		System.out.println("Lista Creada");
		
	}

	public void AgregarInicio(int vagon){
		Nodo_Vagon nuevovagon=new Nodo_Vagon(vagon,primero);
		primero=nuevovagon;
		if (ultimo==null) {
			ultimo=primero;
		}
	}

	public void AgregarFinal(int vagon){
		Nodo_Vagon nuevovagon;
		nuevovagon = new Nodo_Vagon(vagon, null);
		if (primero==null) {
			ultimo=nuevovagon;
			primero=ultimo;
		}else{
			ultimo.setProximo(nuevovagon);
			ultimo=nuevovagon;
		}
	}

	public void EliminarInicio(){


		if (primero==null) {
			System.out.println("Lista Vacia");
		}else{
			primero=primero.proximo;
		}


	}

	public void EliminarFinal(){
		Nodo_Vagon anterior=null,temporal=primero;

		if (primero==null) {
			System.out.println("La Lista Esta Vacia");
		}else if(primero==ultimo){
			primero=ultimo=null;
		}else{
			while(temporal.proximo!=ultimo){
				temporal=temporal.proximo;
			}
			ultimo=temporal;
			ultimo.proximo=null;

		}

	}
	
	 public int ExtraerInicio(){
		    int vagon=primero.getVagon();
		    primero=primero.proximo;
		        if (primero==null) {
		            ultimo=null;
		        }
		    return vagon;
		    }
		 
		    public void Tamaño(){
		    Nodo_Vagon temp=primero;
		    int contador=0;
		        while (temp!=null) {
		            temp=temp.proximo;
		            contador++;
		        }
		        System.out.println("El numero de elementos de la lista son: "+contador);
		    }
		    public void Imprimir(){
		    Nodo_Vagon temp=primero;
		    while(temp!=null){
		        System.out.println(temp.getVagon());
		    temp=temp.proximo;
		    }
		        
		    }
}