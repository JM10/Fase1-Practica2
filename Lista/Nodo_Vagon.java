package Lista;

public class Nodo_Vagon {
	private int vagon;
	Nodo_Vagon proximo;

	public Nodo_Vagon(int v, Nodo_Vagon P) {
		vagon=v;
		proximo=P;
	}



	public int getVagon() {
		return vagon;
	}

	public void setVagon(int vagon) {
		this.vagon = vagon;
	}

	public Nodo_Vagon getProximo() {
		return proximo;
	}

	public void setProximo(Nodo_Vagon proximo) {
		this.proximo = proximo;
	}


}
