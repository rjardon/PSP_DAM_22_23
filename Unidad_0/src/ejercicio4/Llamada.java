package ejercicio4;

public abstract class Llamada {
	
	private String numOrigen;
	private String numDestino;
	protected double duracion;
	
	public Llamada() {
	}
	
	public Llamada(String numOrigen, String numDestino, double duracion) {
		this.numOrigen = numOrigen;
		this.numDestino = numDestino;
		this.duracion = duracion;
	}
	
	public String getNumOrigen() {
		return this.numOrigen;
	}

	public void setNumOrigen(String numOrigen) {
		this.numOrigen = numOrigen;
	}

	public String getNumDestino() {
		return this.numDestino;
	}

	public void setNumDestino(String numDestino) {
		this.numDestino = numDestino;
	}

	public double getDuracion() {
		return this.duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	public abstract double calcularCosteTotal();
	
	@Override
	public String toString() {
		return "Llamada [numOrigen=" + this.numOrigen + ", numDestino=" + this.numDestino + ", duracion=" + this.duracion + "]";
	}
}
