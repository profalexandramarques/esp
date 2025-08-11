package escolamusica;

/**
 * @author Alexandra Marques
 */

import java.sql.ResultSet;
import java.sql.SQLException;   // Para lidar com erros de SQL
import java.sql.Statement;     
import java.util.ArrayList;     //ArrayList
import java.util.List;          //List 

public class AlunoDAO {
    
    private Conexao conexao;
    private Statement stmt;
    private boolean sucesso = false;
    
    public AlunoDAO() {
        conexao = new Conexao();
        try {
            stmt = (Statement) conexao.getConexao().createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
     //Inserir um aluno 
    public boolean inserir(Aluno aluno) {      
        try {         
            String sql = "INSERT INTO alunos (nome, cpf, genero, fone, email, ativo)"
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
            //conexao.fecharConexao();
        }
        return sucesso;
    }

    //Alterar os dados de um aluno 
    public boolean alterar(Aluno aluno) {
        try {
            String sql = "UPDATE alunos SET "
                    + " nome = '" + aluno.getNome()
                    + "', cpf = '" + aluno.getCpf()
                    + "', genero = '" + aluno.getGenero()
                    + "', fone = '" + aluno.getFone()
                    + "', email = '" + aluno.getEmail()
                    + "', ativo = '" + aluno.getAtivo()
                    + "' WHERE id_aluno = '" + aluno.getId_aluno()+ "'";
            stmt.execute(sql);
            sucesso = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }
        return sucesso;
    }
    
    //Excluir um aluno
    public boolean excluir(Aluno aluno) {
        try {
            String sql = "DELETE FROM alunos "
                    +    " WHERE id_aluno= '" + aluno.getId_aluno()+ "'";
            stmt.execute(sql);
            sucesso = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }
        return sucesso;
    }
    
    //Consultar o último código de aluno cadastrado
    public int ultimoCodigo(){
        int codigo = 0;
        try {
            String sql = "SELECT max(id_aluno) as codigo "+
                         "FROM alunos ";

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
    
    //Consultar um aluno
    public Aluno consultarAluno(int id){
        Aluno aluno = new Aluno();
        aluno.setId_aluno(id);
        try {
            String sql = "SELECT * FROM alunos"
                    +    " WHERE id_aluno= '" + aluno.getId_aluno()+ "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                aluno.setNome(rs.getString("nome"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setGenero(rs.getString("genero"));
                aluno.setFone(rs.getString("fone"));
                aluno.setEmail(rs.getString("email"));
                aluno.setAtivo(rs.getString("ativo"));
                System.out.println(aluno.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
       }
        return aluno;
    }
    
    //Retornar a lista de alunos por ordem alfabética
    public List<Aluno> listar() {
        List<Aluno> listaAlunos = new ArrayList<Aluno>();
        try {
            String sql = "SELECT id_aluno, nome, fone, email, genero, ativo"
                    + " FROM alunos "
                    + " ORDER BY nome ";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId_aluno(rs.getInt("id_aluno"));
                aluno.setNome(rs.getString("nome"));
                aluno.setFone(rs.getString("fone"));
                aluno.setGenero(rs.getString("genero"));
                aluno.setEmail(rs.getString("email"));
                aluno.setAtivo(rs.getString("ativo"));
                listaAlunos.add(aluno);
                System.out.println(aluno.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }
        return listaAlunos;
    }
}
