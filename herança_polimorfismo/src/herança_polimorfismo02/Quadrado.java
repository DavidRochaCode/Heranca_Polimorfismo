package herança_polimorfismo02;

public class Quadrado extends Figura2D implements DimensaoSuperficial {

	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double CalcularArea() {
		return this.lado * this.lado;

	}

	@Override
	public String toString() {
		return "Área do quadrado: " + CalcularArea();
	}

}
