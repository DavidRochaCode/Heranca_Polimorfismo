package herança_polimorfismo02;

public class Cilindro extends Figura3D implements DimensaoVolumetrica, DimensaoSuperficial {
	private double areaBase;
	private double altura;
	private double raio;

	public double getAreaBase() {
		return areaBase;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public void setAreaBase(double areaBase) {
		this.areaBase = areaBase;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double CalcularVolume() {
		return areaBase * altura;

	}

	@Override
	public double CalcularArea() {

		return 2 * Math.PI * raio * (raio + altura);
	}

	@Override
	public String toString() {
		String s = "Volume do cilindro: " + CalcularVolume();
		return s += "\n Árear do cilindro: " + CalcularArea();
	}

}
