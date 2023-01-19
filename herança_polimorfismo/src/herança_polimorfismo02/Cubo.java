package herança_polimorfismo02;

public class Cubo extends Figura3D implements DimensaoVolumetrica, DimensaoSuperficial {

	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double CalcularVolume() {
		return lado * lado * lado;
	}

	@Override
	public double CalcularArea() {

		return 6 * (lado * lado);
	}

	@Override
	public String toString() {
		String s = "Volume do cubo: " + CalcularVolume();
		;
		return s += "\n Area do cubo: " + CalcularArea();
	}

}
