package escolamusica;

/**
 *@author Alexandra
 */
import java.sql.Connection; //Conexao
import java.sql.DriverManager; //Driver
import java.sql.SQLException; //Exceção SQL

public class Conexao {
   private Connection conexao = null;
   private String url = 
           "jdbc:sqlite:C:/Users/User/Documents/bdescola.db";

    //Contrutor
    public Conexao() {
        //Conexão com o banco de dados
       try {
            conexao = DriverManager.getConnection(url);
            System.out.println("Conexão realizada com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + 
                    e.getMessage());
            e.printStackTrace();
        } 
    }

    /**
     * @return the conexao
     */
    public Connection getConexao() {
        return this.conexao;
    }

    /**
     * @param conexao the conexao to set
     */
    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }
   
   
   
}
