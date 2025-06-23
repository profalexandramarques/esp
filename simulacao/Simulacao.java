
package simulacao;

/**
 *
 * @author Alexandra
 */
import javax.swing.*;
import java.util.ArrayList; // Importa a classe ArrayList
import java.util.List;    // Importa a interface List


public class Simulacao {
    /**
     * @param args the command line arguments
     */
    
    //Listar os dados dos veículos
    public static void listarVeiculos(List<Veiculo> listaveiculos){
        System.out.println("Lista de Veículos");
        for (Veiculo veiculo:listaveiculos){
         System.out.println(veiculo.toString());  
       }
    }
    
    public static void main(String[] args) {        
        //Simulação do robo veiculo
        List<Veiculo> listaVeiculos = new ArrayList<>();
        String placa = JOptionPane.
                showInputDialog("Digite a placa: ");
        Veiculo corsa = new Veiculo(placa);
        //Adicionar no arraylist
        listaVeiculos.add(corsa);
        Veiculo fusca = new Veiculo("FUS1960");
        listaVeiculos.add(fusca);        
        //Pedir para o usuario ano, modelo, marca
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
        corsa.setAno(ano);
        
        String marca = JOptionPane.showInputDialog("Digite a marca: ");
        corsa.setMarca(marca);
        String modelo = JOptionPane.showInputDialog("Digite a modelo: ");
        corsa.setModelo(modelo);
        
        String nome = JOptionPane.showInputDialog("Digite o nome do motorista");
        String CPF = JOptionPane.showInputDialog("Digite o seu CPF");
        //corsa.setCpf(CPF);
                
        String CNH = JOptionPane.showInputDialog("Digite sua CNH");

        String fone = JOptionPane.
                        showInputDialog("Digite o seu Telefone");
            
        String email = JOptionPane.
                        showInputDialog("Digite o seu E-mail");
                
        Pessoa motorista = new Pessoa(CNH);
        motorista.setCPF(CPF);
        motorista.setNome(nome);
        motorista.setEmail(email);
        motorista.setFone(fone);
              
        //Chamar os métodos
        corsa.ligar();
        int marcha = 1;
        for(int i=10;i<150;i+=10){
           corsa.acelerar();
           if(corsa.getVelocidade()%40 == 0){
             marcha = marcha + 1;
             corsa.mudarMarcha(marcha);             
           }    
        }   
        for(int i=120;i>=0;i-=10){
          corsa.frear();
        }  
        corsa.setMarcha(1);
        corsa.desligar();
        //Mostrar os dados dos veículos
        listarVeiculos(listaVeiculos);
    }
    
}
