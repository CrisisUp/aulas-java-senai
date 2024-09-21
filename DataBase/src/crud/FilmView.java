package crud;

import java.sql.Date;
import java.util.Scanner;

public class FilmView {
	public static void main(String[] args) {
		MySqlConnection db = new MySqlConnection();
		try {
			if (!db.getConnection()) {
				System.out.println("Erro ao conectar com o banco de dados");
				return;
			}
		} catch (ClassNotFoundException e) {e.printStackTrace();}
		
		FilmDAO filmeDAO = new FilmDAO(db);
		FilmController filmController = new FilmController(filmeDAO);
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("\nMenu:");
			System.out.println("0 - Sair do programa");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Atualizar");
			System.out.println("4 - Deletar");
			
			System.out.print("Digite sua opcão: ");
			int option = scanner.nextInt();
			scanner.nextLine();
			
			switch (option) {
			case 0 -> {
				System.out.println("Programa finalizado!");
				scanner.close();
				db.closeConnection();
				System.exit(0);
			}
			
			case 1 -> {
				System.out.println("Digite o código do filme: ");
				String codigo = scanner.nextLine();
				
				System.out.println("Digite o titulo do filme: ");
				String titulo = scanner.nextLine();
				
				System.out.println("Digite o genero do filme: ");
				String genero = scanner.nextLine();
				
				System.out.println("Digite a produtora do filme: ");
				String produtora = scanner.nextLine();
				
				System.out.println("Digite a data da compra do filme: ");
				Date dataCompra = Date.valueOf(scanner.nextLine());
				
				FilmModel filme = new FilmModel(codigo, titulo, genero, produtora, dataCompra);
				filmController.createFilm(filme);
			}
			
			case 2 -> {filmController.readFilm();}
			
			case 3 -> {}
			
			case 4 -> {
				System.out.print("Digite o código do filme que deseja deletar: ");
				String codigo = scanner.nextLine();
				
				filmController.deteteFilm(codigo);
			}
			
			default -> System.out.println("Opção inválida!");
			}
		}
	}
}
