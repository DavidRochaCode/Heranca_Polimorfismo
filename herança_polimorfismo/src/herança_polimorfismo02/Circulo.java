package herança_polimorfismo02;

public class Circulo extends Figura2D implements DimensaoSuperficial {
	
	private double raio;

	@Override
	public void setCor(String cor) {
		super.setCor(cor);
	}
	
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	@Override
	public double CalcularArea() {

		return Math.PI * (this.raio * this.raio);
	}

	@Override
	public String toString() {
		return "Área do circulo: " + CalcularArea();
	}

}
