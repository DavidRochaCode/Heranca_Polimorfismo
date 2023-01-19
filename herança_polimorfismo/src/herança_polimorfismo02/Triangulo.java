package herança_polimorfismo02;

public class Triangulo extends Figura2D implements DimensaoSuperficial {

	private double base;
	private double alura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAlura() {
		return alura;
	}

	public void setAlura(double alura) {
		this.alura = alura;
	}

	@Override
	public double CalcularArea() {
		return (this.base * this.alura) / 2;

	}

	@Override
	public String toString() {
		return "Área do triangulo: " + CalcularArea();
	}

}
