package bluebenx;

public class Perfil {
	private String descricao;
	private int seguidores;
	private int seguindo;
	private String nftsFavoritas;
	private String galerias;
	private int eventosParticipados;
	private String nivel;
	private String conquistas;
	private String foto;

	Perfil(String descricao, int seguidores, int seguindo, String nftsFavoritas, String galerias,
			int eventosParticipados, String nivel, String conquistas, String foto) {

		this.descricao = descricao;
		this.seguidores = seguidores;
		this.seguindo = seguindo;
		this.nftsFavoritas = nftsFavoritas;
		this.galerias = galerias;
		this.eventosParticipados = eventosParticipados;
		this.nivel = nivel;
		this.conquistas = conquistas;
		this.foto = foto;
	}

	public void show() {
		System.out.println("\n| PERFIL INSTANCIADO");
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Seguidores: " + this.seguidores);
		System.out.println("Seguindo:" + this.seguindo);
		System.out.println("NFTs favoritas: " + this.nftsFavoritas);
		System.out.println("Galerias: " + this.galerias);
		System.out.println("Eventos Participados: " + this.eventosParticipados);
		System.out.println("Nível: " + this.nivel);
		System.out.println("Conquistas: " + this.conquistas);
		System.out.println("Foto de Perfil: " + this.foto);
	}

	public void seguirPerfil() {
	}
	
	public void deixarDeSeguirPerfil() {
	}
	
	public void criarGaleria() {
	}
	
	public void curtirGaleria() {
	}
	
	public void participarDeEvento() {
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(int seguidores) {
		this.seguidores = seguidores;
	}

	public int getSeguindo() {
		return seguindo;
	}

	public void setSeguindo(int seguindo) {
		this.seguindo = seguindo;
	}

	public String getNftsFavoritas() {
		return nftsFavoritas;
	}

	public void setNftsFavoritas(String nftsFavoritas) {
		this.nftsFavoritas = nftsFavoritas;
	}

	public String getGalerias() {
		return galerias;
	}

	public void setGalerias(String galerias) {
		this.galerias = galerias;
	}

	public int getEventosParticipados() {
		return eventosParticipados;
	}

	public void setEventosParticipados(int eventosParticipados) {
		this.eventosParticipados = eventosParticipados;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getConquistas() {
		return conquistas;
	}

	public void setConquistas(String conquistas) {
		this.conquistas = conquistas;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}
