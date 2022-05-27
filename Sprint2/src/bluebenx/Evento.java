package bluebenx;

public class Evento {

	// Attributes
	private String nome;
	private String descricao;
	private String host;
	private int limiteParticipantes;
	private int participantes;
	private double premiacao;
	private String dataInicio;
	private String dataFim;

	// Constructors

	Evento(String nome, String descricao, String host, int limiteParticipantes, int participantes, double premiacao,
			String dataInicio, String dataFim) {
		this.nome = nome;
		this.descricao = descricao;
		this.host = host;
		this.limiteParticipantes = limiteParticipantes;
		this.participantes = participantes;
		this.premiacao = premiacao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;

	}

	// Methods
	public void show() {
		System.out.println("\n| EVENTO INSTANCIADO");
		System.out.println("Nome: " + this.nome);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Host: " + this.host);
		System.out.println("Limite de Participantes: " + this.limiteParticipantes);
		System.out.println("Participantes: " + this.participantes);
		System.out.println("Premiação:" + this.premiacao);
		System.out.println("Data de início do evento: " + this.dataInicio);
		System.out.println("Data do fim do evento: " + this.dataFim);
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

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getLimiteParticipantes() {
		return limiteParticipantes;
	}

	public void setLimiteParticipantes(int limiteParticipantes) {
		this.limiteParticipantes = limiteParticipantes;
	}

	public int getParticipantes() {
		return participantes;
	}

	public void setParticipantes(int participantes) {
		this.participantes = participantes;
	}

	public double getPremiacao() {
		return premiacao;
	}

	public void setPremiacao(double premiacao) {
		this.premiacao = premiacao;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

}
