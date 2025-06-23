package contabancaria;
/**
 *
 * @author Alexandra
 */
import javax.swing.*;
import java.util.ArrayList; 
import java.util.List;    

public class ContaBancaria {
    //Lista de Contas Global
    public static List<Conta> listaConta = new ArrayList<>();
    
    //Abrir Conta
    public static Conta abrirConta(){
        int agencia = Integer.parseInt(JOptionPane.
                showInputDialog("Digite o número da agencia"));
        int numero = Integer.parseInt(JOptionPane.
                showInputDialog("Digite o número da conta"));
        Conta conta = new Conta(agencia, numero);
        return conta;
    }
    
    //Listar todas as contas
    public static void listarContas(){
        for (int i = 0;i<listaConta.size();i++){
            System.out.println(listaConta.get(i).getNumero());
        }
    }
    
    //Método para pesquisar na Lista de Contas
    public static int pesquisarLista(int numero){
       int i = 0;
       boolean achou = false;
       while(!achou && i<listaConta.size()){           
           System.out.println(i);
           achou = (numero==listaConta.get(i).getNumero());
           i++;    
       }
       if(!achou) {
           i = -1;
       }
       return i;
    }
    
    public static void depositar(int numero){
       int i = pesquisarLista(numero);
       if(i>-1){
           Conta conta = listaConta.get(i);
           double valor = Double.parseDouble(
                 JOptionPane.showInputDialog("Digite o valor: "));
           conta.depositar(valor);
           JOptionPane.showMessageDialog(null,
                   "Saldo: "+conta.getSaldo());
       }else{
           JOptionPane.showMessageDialog(null, 
                   "Conta inexistente!");
       }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Conta Bancária
        //1 - Abrir Conta
        //2 - Depositar
        //3 - Sacar 
        //4 - Saldo
        //9 - Sair
        
        String menu = "1 - Abrir Conta"+
                      "\n2 - Depositar"+
                      "\n3 - Sacar"+
                      "\n4 - Ver Saldo"+
                      "\n5 - Gerar Extrato "+
                      "\n6 - Listar todas as contas"+
                      "\n9 - Sair";
        String op = "0";       

        while(!op.equals("9")){
            op = JOptionPane.showInputDialog(null,menu);
            switch (op) {
                case "1":
                    listaConta.add(abrirConta());
                    break;
                case "2":
                    int numero = Integer.parseInt(
                            JOptionPane.showInputDialog(null,"Digite o número da conta"));
                    depositar(numero);
                    break;
                case "3":
                    //sacar
                    break;
                case "4":
                    //verSaldo;
                    break;
                case "5":
                    //gerarExtrato;
                    break;
                case "6":
                    listarContas();
                    break;
                case "9":
                    JOptionPane.showMessageDialog(null, "Volte Sempre!");
                    break;
                    
            }
        }
        
    }
    
}
