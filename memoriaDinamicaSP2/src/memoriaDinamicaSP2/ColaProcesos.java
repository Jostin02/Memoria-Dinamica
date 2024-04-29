package memoriaDinamicaSP2;

/**
 * @author Jenny<morales
 */
public class ColaProcesos {
	private NodoCola primero;
	private NodoCola fin;
	private int tamanioCola;
	
	//Constructor
	public void ColaProcessos() {
		primero = null;
		fin = null;
		tamanioCola = 0;
	}
	
	
	public boolean esVacia() {
		if (primero == null) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Método para agregar a la cola un nuevo nodo
	 */
	public void push(Proceso proceso) {
		NodoCola nuevo;
		if (esVacia()) {
			nuevo = new NodoCola(proceso, null);
			primero = nuevo;
			fin = nuevo;
		} else {
			nuevo = new NodoCola(proceso, null);
			fin.setSiguiente(nuevo);// Agregar el nuevo nodo al final de la lista
			fin = nuevo;// Actualizar la referencia del nodo
		}
		tamanioCola++;
	}
}
