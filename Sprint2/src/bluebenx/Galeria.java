package bluebenx;

public class Galeria {
	protected String descricao;
	protected String titulo;
	protected String nfts;

	Galeria(String descricao, String titulo, String nfts) {
		this.descricao = descricao;
		this.titulo = titulo;
		this.nfts = nfts;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNfts() {
		return nfts;
	}

	public void setNfts(String nfts) {
		this.nfts = nfts;
	}

}
