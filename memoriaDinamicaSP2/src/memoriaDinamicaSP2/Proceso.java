package memoriaDinamicaSP2;

public class Proceso {
	private String nombreProceso;
	private int tamamio;
	private int tiemLlegada;
	private int duracion;
	
	//Constructores 
	public Proceso(String nombreProceso, int tamamio, int tiemLlegada, int duracion) {
		this.nombreProceso = nombreProceso;
		this.tamamio = tamamio;
		this.tiemLlegada = tiemLlegada;
		this.duracion = duracion;
	}
	
	public Proceso() {
	}

	public String getNombreProceso() {
		return nombreProceso;
	}

	public void setNombreProceso(String nombreProceso) {
		this.nombreProceso = nombreProceso;
	}

	public int getTamamio() {
		return tamamio;
	}

	public void setTamamio(int tamamio) {
		this.tamamio = tamamio;
	}

	public int getTiemLlegada() {
		return tiemLlegada;
	}

	public void setTiemLlegada(int tiemLlegada) {
		this.tiemLlegada = tiemLlegada;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Nombre Proceso: " + nombreProceso + ",Tamaño: " + tamamio + ", Tiempo llegada:" + tiemLlegada
				+ ", Duracion:" + duracion ;
	}
	
	
}
