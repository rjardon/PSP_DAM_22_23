package ejercicio4;

public class LlamadasProvinciales extends Llamada{

	private double coste;
	private int hora;
	
	public LlamadasProvinciales() {
		
	}

	public LlamadasProvinciales(int hora, double coste) {
		this.hora = hora;
		this.coste = coste;
	}

	public int getHora() {
		return this.hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public double getCoste() {
		return this.coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	@Override
	public double calcularCosteTotal() {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
}
