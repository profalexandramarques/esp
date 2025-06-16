
package boletim;

/**
 *
 * @author Alexandra
 */
public class Aluno {
    private int matricula;
    private String nome;
    private float nota1;
    private float nota2;
    private float media;
    private String conceito;
    
    public Aluno(){
        this.nota1 = 0;
        this.nota2 = 0;
        this.media = 0;        
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return this.matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
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
     * @return the nota1
     */
    public float getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public float getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    /**
     * @return the media
     */
    public float getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(float media) {
        this.media = media;
    }

    /**
     * @return the conceito
     */
    public String getConceito() {
        return conceito;
    }

    /**
     * @param conceito the conceito to set
     */
    public void setConceito(String conceito) {
        this.conceito = conceito;
    }
    
    //Calculo da Média
    public float calcularMedia(){
        this.media = (this.nota1 + this.nota2)/2;
        if(this.media>=7){
            this.conceito = "Aprovado";
        }else{
            this.conceito = "Reprovado";
        }
        return this.media;
    }
    
}
