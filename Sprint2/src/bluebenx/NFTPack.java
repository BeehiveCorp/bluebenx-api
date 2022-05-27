package bluebenx;

public class NFTPack extends Galeria {
	private double preco;

	NFTPack(String descricao, String titulo, String nfts, double preco) {
		super(descricao, titulo, nfts);
		this.preco = preco;
	}

	public void show() {
		System.out.println("\n| PACK INSTANCIADO");
		System.out.println("Descri��o: " + this.descricao);
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Nfts:" + this.nfts);
		System.out.println("Preço:" + this.preco);
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
