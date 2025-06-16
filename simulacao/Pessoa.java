package simulacao;

/**
 *
 * @author Alexandra
 */
public class Pessoa {
    private String CPF;
    private String nome;
    private String CNH;
    private String email;
    private String fone;

    //Construtor
    public Pessoa(String CNH){
        this.CNH = CNH;  
     }
    /**
     * @return the CPF
     */
    public String getCPF() {
        return this.CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
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
     * @return the CNH
     */
    public String getCNH() {
        return this.CNH;
    }

    /**
     * @param CNH the CNH to set
     */
    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
    
    
    
    
}
