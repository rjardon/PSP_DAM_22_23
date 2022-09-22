package ejercicio4;

public class Franja {

	private int inicio;
	private int horaFinal;
	private double coste;
	public Franja() {
	}
	public Franja(int inicio, int horaFinal, double coste) {
		this.inicio = inicio;
		this.horaFinal = horaFinal;
		this.coste = coste;
	}
	public int getInicio() {
		return this.inicio;
	}
	public void setInicio(int inicio) {
		this.inicio = inicio;
	}
	public int getHoraFinal() {
		return this.horaFinal;
	}
	public void setHoraFinal(int horaFinal) {
		this.horaFinal = horaFinal;
	}
	public double getCoste() {
		return this.coste;
	}
	public void setCoste(double coste) {
		this.coste = coste;
	}
	
	
	
}
