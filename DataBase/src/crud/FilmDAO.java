package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmDAO {
	public Connection conection;
	private final MySqlConnection db;
	
	
	public FilmDAO (MySqlConnection db) {this.db = db;}
	
	public boolean create(FilmModel filme) throws SQLException {
		Connection connection = db.conection;
		
		if (connection == null) {return false;}
		
		String cmdSQL = "INSERT INTO filmes(codigo, titulo, genero, produtora, dataCompra) VALUES (?, ?, ?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(cmdSQL);
		ps.setString(1, filme.getCodido());
		ps.setString(2, filme.getTitulo());
		ps.setString(3, filme.getGenero());
		ps.setString(4, filme.getProdutora());
		ps.setDate(5, filme.getDataCompra());
		
		int modifyLines = ps.executeUpdate();
		ps.close();
		// connection.close(); Não podemos fechar aqui. Porem deve ser feixado em outro momento.
		System.out.println("Filme criado com sucesso!");
		
		return modifyLines > 0;
	}

	public List<FilmModel> read() throws SQLException {
		List<FilmModel> filmes = new ArrayList<>();
		Connection connection = db.conection;
		
		if (connection == null) {return filmes;}
		
		String cmdSQL = "SELECT * FROM filmes";
		PreparedStatement ps = connection.prepareStatement(cmdSQL);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			FilmModel filme = new FilmModel(rs.getString("codigo"), 
											rs.getString("titulo"),
											rs.getString("genero"),
											rs.getString("produtora"),
											rs.getDate("dataCompra"));
			filmes.add(filme);	
		}
		rs.close();
		ps.close();
		//connection.close(); Lembrete
		return filmes;
	}

	public void update() {}
	
	public boolean delete(String codigo) throws SQLException {
		Connection connection = db.conection;
		
		if (connection == null) {
			return false;
		}
		String cmdSQL = "DELETE FROM filmes WHERE codigo";
		PreparedStatement ps = connection.prepareStatement(cmdSQL);
		ps.setString(1, codigo);
		
		int modifyLines = ps.executeUpdate();
		ps.close();
		//connection.close(); Lembrete
		return modifyLines > 0;
	}
}
