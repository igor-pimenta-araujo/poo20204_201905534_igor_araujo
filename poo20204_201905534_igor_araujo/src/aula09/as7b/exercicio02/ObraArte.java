package aula09.as7b.exercicio02;

public class ObraArte {
	private String titulo;
	private double preco;
	private int diaCriacao;
	private int mesCriacao;
	private int anoCriacao;
	private String situacao;
	private String tipo;
	private String material;
	private Artista artista;
	
	public ObraArte(String titulo, double preco, int diaCriacao, int mesCriacao, int anoCriacao, String situacao,
			String tipo, String material, Artista artista) {
		super();
		this.titulo = titulo;
		this.preco = preco;
		this.diaCriacao = diaCriacao;
		this.mesCriacao = mesCriacao;
		this.anoCriacao = anoCriacao;
		this.situacao = situacao;
		this.tipo = tipo;
		this.material = material;
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getDiaCriacao() {
		return diaCriacao;
	}

	public void setDiaCriacao(int diaCriacao) {
		this.diaCriacao = diaCriacao;
	}

	public int getMesCriacao() {
		return mesCriacao;
	}

	public void setMesCriacao(int mesCriacao) {
		this.mesCriacao = mesCriacao;
	}

	public int getAnoCriacao() {
		return anoCriacao;
	}

	public void setAnoCriacao(int anoCriacao) {
		this.anoCriacao = anoCriacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	@Override
	public String toString() {
		return "ObraArte\nTitulo: " + titulo + "\nPreco: R$" + preco + "\nData da Criação: " + diaCriacao + "/"
				+ mesCriacao + "/" + anoCriacao + "\nSituacao: " + situacao + "\nTipo: " + tipo
				+ "\nMaterial: " + material + "\n" + artista;
	}
	
	
	
}
