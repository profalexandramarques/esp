package petshop;

/**
 *
 * @author Alexandra
 */
//Classe Animal - Dados do bichinho
public class Animal {
    private String nome;
    private int idade;
    private String tipoAnimal;
    private String genero;
    private String tutor;
    private boolean vacinado;
    private String planoSaude;

    public Animal(String nome) {
        this.nome = nome;
    }


    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the tipoAnimal
     */
    public String getTipoAnimal() {
        return tipoAnimal;
    }

    /**
     * @param tipoAnimal the tipoAnimal to set
     */
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the tutor
     */
    public String getTutor() {
        return tutor;
    }

    /**
     * @param tutor the tutor to set
     */
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    /**
     * @return the vacinado
     */
    public boolean isVacinado() {
        return vacinado;
    }

    /**
     * @param vacinado the vacinado to set
     */
    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    /**
     * @return the planoSaude
     */
    public String getPlanoSaude() {
        return this.planoSaude;
    }

    /**
     * @param planoSaude the planoSaude to set
     */
    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + this.nome + 
                ", idade=" + this.idade + 
                ", tipoAnimal=" + this.tipoAnimal + 
                ", genero=" + this.genero + 
                ", tutor=" + this.tutor + 
                ", vacinado=" + this.vacinado + 
                ", planoSaude=" + this.planoSaude + '}';
    }
    
    
    
}
