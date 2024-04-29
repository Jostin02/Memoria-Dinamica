package memoriaDinamicaSP2;

public class NodoCola {
	private Proceso proceso;
	private NodoCola siguiente;
	
		
	public NodoCola(Proceso proceso, NodoCola siguiente) {
		super();
		this.proceso = proceso;
		this.siguiente = siguiente;
	}
	
	public NodoCola() {
	}

	public Proceso getProceso() {
		return proceso;
	}

	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}

	public NodoCola getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoCola siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
}
