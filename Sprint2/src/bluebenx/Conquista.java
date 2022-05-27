package bluebenx;

public class Conquista {
	private String nome;
	private String descricao;
	private String icone;
	private int vezesConquistada;

	Conquista(String nome, String descricao, String icone, int vezesConquistada) {
		this.nome = nome;
		this.descricao = descricao;
		this.icone = icone;
		this.vezesConquistada = vezesConquistada;
	}

	public void show() {
		System.out.println("\n| CONQUISTA INSTANCIADA");
		System.out.println("Nome da Conquista:" + this.nome);
		System.out.println("Descri��o da Conquista: " + this.descricao);
		System.out.println("�cone da conquista: " + this.icone);
		System.out.println("Quantas conquistas foram alcan�adas: " + this.vezesConquistada);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIcone() {
		return icone;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

	public int getVezesConquistada() {
		return vezesConquistada;
	}

	public void setVezesConquistada(int vezesConquistada) {
		this.vezesConquistada = vezesConquistada;
	}

}
