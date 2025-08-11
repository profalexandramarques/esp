package escolamusica;

/**
 * @author Alexandra
 */
public class Professor {

    private int id_aluno;
    private String nome;
    private String cpf;
    private String fone;
    private String emal;
    private String genero;
    private String ativo;

    public Professor() {
        this.ativo = "A";
    }

    /**
     * @return the id_aluno
     */
    public int getId_aluno() {
        return this.id_aluno;
    }

    /**
     * @param id_aluno the id_aluno to set
     */
    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
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
     * @return the cpf
     */
    public String getCpf() {
        return this.cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the fone
     */
    public String getFone() {
        return this.fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * @return the emal
     */
    public String getEmal() {
        return this.emal;
    }

    /**
     * @param emal the emal to set
     */
    public void setEmal(String emal) {
        this.emal = emal;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return this.genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
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

    @Override
    public String toString() {
        return "Professor{" + "id_aluno=" + this.id_aluno + 
                ", nome=" + this.nome + 
                ", cpf=" + this.cpf + 
                ", fone=" + this.fone + 
                ", emal=" + this.emal + 
                ", genero=" + this.genero + 
                ", ativo=" + this.ativo + '}';
    }

}
