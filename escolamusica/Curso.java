package escolamusica;

/**
 *@author Alexandra
 */
public class Curso {
    //Atributos
    private int id_curso;
    private String nome;
    private double valor;
    private int carga_horaria;
    private String ativo;

    //Construtor
    public Curso() {
        this.ativo = "A";
    }
    //GET e SET

    /**
     * @return the id_curso
     */
    public int getId_curso() {
        return id_curso;
    }

    /**
     * @param id_curso the id_curso to set
     */
    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
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
     * @return the valor
     */
    public double getValor() {
        return this.valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the carga_horaria
     */
    public int getCarga_horaria() {
        return this.carga_horaria;
    }

    /**
     * @param carga_horaria the carga_horaria to set
     */
    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    /**
     * @return the ativo
     */
    public String getAtivo() {
        return this.ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
    
    //To String

    @Override
    public String toString() {
        return "Curso{" + "id_curso=" + this.id_curso + 
                ", nome=" + this.nome + 
                ", valor=" + this.valor + 
                ", carga_horaria=" + this.carga_horaria + 
                ", ativo=" + this.ativo + '}';
    }
        
    
}
