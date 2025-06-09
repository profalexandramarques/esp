
package simulacao;

/**
 *
 * @author Alexandra
 */
public class Veiculo {
   //Variáveis - Atributos
   private String placa;
   private String marca;
   private String modelo;
   private int ano;
   private float capacidade;
   private int velocidade;
   private boolean ligado;
   private int marcha;

   //Construtor da Classe
   public Veiculo(String placa){
     this.placa = placa;
     this.ligado = false;
     this.velocidade = 0;
     this.marcha = 0;
   }
   
   public void ligar(){
      this.ligado = true; 
      System.out.println("Veículo ligado!");
   }

   public void desligar(){
      this.ligado = false;  
      System.out.println("Veículo desligado!");
   }
   
   public void acelerar(){
     if(this.velocidade+10 <= 120){  
        this.velocidade = this.velocidade + 10;  
     }
     System.out.println("Velocidade "+this.velocidade);
   }
   
   public void frear(){
     if(this.velocidade-10 >= 0){  
        this.velocidade = this.velocidade - 10;  
     }
     System.out.println("Velocidade "+this.velocidade);
   }
   
   public void mudarMarcha(int marcha){
       // 1 a 5 - Marchas 
       // 6 (Ré)
       if(marcha <=6){
         this.marcha = marcha;
         System.out.println("Marcha "+this.marcha);
       }else{
         System.out.println("Marcha inválida!");
       }  
   }
 
   
    /**
     * @return the placa
     */
    public String getPlaca() {
        return this.placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return this.marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return this.modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return this.ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the capacidade
     */
    public float getCapacidade() {
        return this.capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return this.velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * @return the ligado
     */
    public boolean isLigado() {
        return this.ligado;
    }

    /**
     * @param ligado the ligado to set
     */
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    /**
     * @return the marcha
     */
    public int getMarcha() {
        return this.marcha;
    }

    /**
     * @param marcha the marcha to set
     */
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
   
           
}
