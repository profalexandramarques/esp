package escolamusica;

/**
 * @author Alexandra
 */
import java.sql.ResultSet;
import java.sql.SQLException;   // Para lidar com erros de SQL
import java.sql.Statement;     
import java.util.ArrayList;     //ArrayList
import java.util.List;          //List 
public class CursoDAO {
    private Conexao conexao;
    private Statement stmt;
    private boolean sucesso = false;

    public CursoDAO() {
       conexao = new Conexao();
        try {
            stmt = (Statement) conexao.getConexao().createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    //Inserir um curso
    public boolean inserir(Curso curso) {      
        try {         
            String sql = "INSERT INTO cursos (nome, valor, carga_horaria, ativo)"
                    + " VALUES ('" + curso.getNome()+"',"
                    + "'"+curso.getValor()+"',"
                    + "'"+curso.getCarga_horaria()+"',"
                    + "'" + curso.getAtivo()+ "' )";       
            stmt.execute(sql);
            System.out.println(sql);
            sucesso = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //conexao.fecharConexao();
        }
        return sucesso;
    }
    
    //Alterar os dados de um curso 
    public boolean alterar(Curso curso) {
        try {
            String sql = "UPDATE cursos SET "
                    + " nome = '" + curso.getNome()
                    + "', valor = '" + curso.getValor()
                    + "', carga_horaria = '" + curso.getCarga_horaria()
                    + "', ativo = '" + curso.getAtivo()
                    + "' WHERE id_curso = '" + curso.getId_curso()+ "'";
            stmt.execute(sql);
            sucesso = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }
        return sucesso;
    }
    
   //Excluir um Curso
    public boolean excluir(Curso curso) {
        try {
            String sql = "DELETE FROM cursos"
                    +    " WHERE id_curso = '" + curso.getId_curso()+ "'";
            stmt.execute(sql);
            sucesso = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }
        return sucesso;
    } 
    
    //Consultar um curso
    public Curso consultarCurso(int id){
        Curso curso = new Curso();
        curso.setId_curso(id);
        try {
            String sql = "SELECT * FROM cursos"
                    +    " WHERE id_curso = '" + curso.getId_curso()+ "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                curso.setNome(rs.getString("nome"));
                curso.setValor(rs.getDouble("valor"));
                curso.setCarga_horaria(rs.getInt("carga_horaria"));
                curso.setAtivo(rs.getString("ativo"));
                System.out.println(curso.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
       }
        return curso;
    }
    //Retornar a lista de cursos por ordem alfabética
    public List<Curso> listar() {
        List<Curso> listaCursos = new ArrayList<Curso>();
        try {
            String sql = "SELECT id_curso, nome, valor, "+
                    " carga_horaria, ativo"
                    + " FROM cursos "
                    + " ORDER BY nome ";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Curso curso = new Curso();
                curso.setId_curso(rs.getInt("id_curso"));
                curso.setNome(rs.getString("nome"));
                curso.setValor(rs.getDouble("valor"));
                curso.setCarga_horaria(rs.getInt("carga_horaria"));
                curso.setAtivo(rs.getString("ativo"));
                listaCursos.add(curso);
                System.out.println(curso.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }
        return listaCursos;
    }
    
    //Consultar o último código de curso cadastrado
    public int ultimoCodigo(){
        int codigo = 0;
        try {
            String sql = "SELECT max(id_curso) as codigo "+
                         "FROM cursos ";

            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                codigo = rs.getInt("codigo");
                System.out.println(codigo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
       }
        return codigo;
    }

}
