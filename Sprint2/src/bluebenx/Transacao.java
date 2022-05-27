package bluebenx;

public class Transacao {
	private String data;
	private double valor;
	private String descricao;
	private String tipo;

	Transacao(String data, double valor, String descricao, String tipo) {
		this.data = data;
		this.valor = valor;
		this.descricao = descricao;
		this.tipo = tipo;
	}

	public void show() {
		System.out.println("\n| TRANSAÇÃO INSTANCIADA");
		System.out.println("Data da transa��o: " + this.data);
		System.out.println("Valor da transa��o: " + this.valor);
		System.out.println(("Descri��o da transa��o: " + this.descricao));
		System.out.println("Tipo da transa��o: " + this.tipo);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
