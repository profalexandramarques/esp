package escolamusica;

/**
 *
 * @author Alexandra
 */
import java.sql.Connection; //Conexao
import java.sql.DriverManager; //Driver
import java.sql.SQLException; //Exceção SQL
import java.sql.Statement;

public class AlunoDAO {
   private Conexao conexao;
   private Statement stmt;
   private boolean sucesso = false;

    public AlunoDAO() {
       conexao = new Conexao();
       try {
           stmt = (Statement) conexao.getConexao().createStatement();
       } catch (SQLException e) {
           e.printStackTrace();
       } 
    }
   
    //CRUD
    //Criar a tabela de alunos
    public void criar(){
      //
    }
    
    //Inserir os dados na tabela
    public boolean inserir(Aluno aluno){
     try {         
          String sql = "INSERT INTO alunos "
                    + " (nome, cpf, genero, fone, email, ativo)"
                    + " VALUES ('" + aluno.getNome()+"',"
                    + "'"+aluno.getCpf()+"',"
                    + "'"+aluno.getGenero()+"',"
                    + "'"+aluno.getFone()+"',"
                    + "'"+aluno.getEmail()+"',"
                    + "'" + aluno.getAtivo()+ "' )";       
           stmt.execute(sql);
           sucesso = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           // conexao.fecharConexao();
        }    
        return sucesso;
    }
    
    //Alterar os dados na tabela
    public boolean alterar(Aluno aluno){
        
        return sucesso;
    }
    
    //Excluir dados de um aluno na tabela
    public boolean excluir(int id){
        
        return sucesso;
    }
    
    //Consultar um aluno pelo id
    public Aluno consultarAluno(int id){
        Aluno aluno = new Aluno();
        
        return aluno;
    }
   
}
