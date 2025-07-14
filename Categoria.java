package turismo;

/**
 *
 * @author Alexandra 
 */
public class Categoria {

    //Atributos da classe
    private int codigo;
    private String nome;
    private char ativo;

    //Construtor
    public Categoria(String nome) {
        this.nome = nome;
    }

    //GET e SET
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ativo
     */
    public char getAtivo() {
        return this.ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(char ativo) {
        this.ativo = ativo;
    }

    //Retorna os dados
    @Override
    public String toString() {
        return "Categoria{" + "codigo=" + codigo + 
               ", nome=" + nome + 
               ", ativo=" + ativo + '}';
    }
    
    
}
