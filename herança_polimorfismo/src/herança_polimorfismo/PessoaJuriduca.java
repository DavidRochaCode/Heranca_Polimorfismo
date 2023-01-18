package herança_polimorfismo;

public class PessoaJuriduca extends Contribuintes {

	private String cnpj;

	public PessoaJuriduca(String nome, double rendaBruta) {
		super(nome, rendaBruta);

	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
	}

	public String toString() {
		String s = "Imposto de renda: ";
		s += "\n Pessoa física: " + calcularImposto();
		return s;
	}
}
