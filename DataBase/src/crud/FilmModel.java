package crud;

import java.sql.Date;

public class FilmModel {
	// Properties
	private String codido;
	private String titulo;
	private String genero;
	private String produtora;
	private Date dataCompra;
	
	// Constructors
	public FilmModel() {}

	public FilmModel(String codido, String titulo, String genero, String produtora, Date dataCompra) {
		//super();
		this.codido = codido;
		this.titulo = titulo;
		this.genero = genero;
		this.produtora = produtora;
		this.dataCompra = dataCompra;
	}
	
	// Behaviers
	public String getCodido() {
		return codido;
	}

	public void setCodido(String codido) {
		this.codido = codido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	@Override
	public String toString() {
		return "FilmModel [codido=" + codido + ", titulo=" + titulo + ", genero=" + genero + ", produtora=" + produtora
				+ ", dataCompra=" + dataCompra + "]";
	}
}
