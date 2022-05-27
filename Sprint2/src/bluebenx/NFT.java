package bluebenx;

public class NFT {
	private String nome;
	private String criador;
	private String categoria;
	private Double valor;
	private String dataCriacao;

	NFT(String nome, String criador, String categoria, Double valor, String dataCriacao) {
		this.nome = nome;
		this.criador = criador;
		this.categoria = categoria;
		this.valor = valor;
		this.dataCriacao = dataCriacao;
	}

	public void show() {
		System.out.println("\n| NFT INSTANCIADO");
		System.out.println("Nome do NFT: " + this.nome);
		System.out.println("Criador do NFT: " + this.criador);
		System.out.println("Categoria do NFT: " + this.categoria);
		System.out.println("Valor do NFT: " + this.valor);
		System.out.println("Data de Criação do NFT: " + this.dataCriacao);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCriador() {
		return criador;
	}

	public void setCriador(String criador) {
		this.criador = criador;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

}
