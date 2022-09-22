package ejercicio4;

public class LlamadasLocales extends Llamada{

	private double coste = 0.15;
	
	public double calcularCoste() {
	
		return coste*duracion;
	}

	@Override
	public double calcularCosteTotal() {
		return 0;
	}
	
}
