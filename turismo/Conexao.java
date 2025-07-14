package turismo;

/**
 *
 * @author Alexandra
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Conexao() {
    }
    
    
    public Connection conectar() {
        Connection connection = null;
        try {
            // Carrega o driver JDBC do SQLite
            Class.forName("org.sqlite.JDBC");

            // Define a URL do banco de dados (o arquivo 'meu_banco.db' será criado se não existir)
            String url = "jdbc:sqlite:C:\\Users\\User\\Documents\\bdescola.db";

            // Estabelece a conexão
            connection = DriverManager.getConnection(url);

            System.out.println("Conexão com o SQLite estabelecida com sucesso!");

            // Aqui você pode adicionar código para interagir com o banco de dados
        } catch (ClassNotFoundException e) {
            System.err.println("Driver SQLite JDBC nao encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao SQLite: " + e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Conexão fechada.");
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }

        return connection;
    }

}
