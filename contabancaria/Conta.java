package contabancaria;
/**
 *
 * @author Alexandra
 */
import java.util.ArrayList;

public class Conta {
    //Atributos
    private int agencia;
    private int numero;
    private String CPF;
    private double saldo;    
    private double limite;
    //1 - Poupança, 
    //2 - Conta Corrente
    //3 - Conta Salário    
    private int tipoConta;    
    private ArrayList<String> movimentacoes = 
            new ArrayList<String>();
 
    //Construtor
    public Conta(int agencia, int numero){
      this.agencia = agencia;
      this.numero = numero;
      this.saldo  = 0;
      this.limite = 0;
      movimentacoes.add("Conta aberta!");
    }
    //GET /SET

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return this.agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return this.numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }

    /**
     * @return the tipoConta
     */
    public int getTipoConta() {
        return tipoConta;
    }

    /**
     * @param tipoConta the tipoConta to set
     */
    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    //Depositar
    public double depositar(double valor){
        movimentacoes.add("Depósito de "+valor);
        return this.saldo = this.saldo + valor; 
       
    }
    //Saque da conta
    public double sacar(double valor){
      if ((this.saldo - valor) >=0){
        this.saldo = this.saldo - valor;  
        movimentacoes.add("Saque de "+valor);
      }
      else{
           System.out.println("Saldo insuficiente!");
      }
      return saldo;
    }
    
    //Extrato
    public void gerarExtrato(){
        System.out.println("=== Extrato ===");
        for (int i=0;i<movimentacoes.size();i++){
           System.out.println(movimentacoes.get(i)); 
        }
        System.out.println("Saldo Atual: "+this.saldo);
    }
    
}
