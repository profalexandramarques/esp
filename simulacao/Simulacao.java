
package simulacao;

/**
 *
 * @author User
 */
import javax.swing.*;
public class Simulacao {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        //Simulação do robo veiculo
        String placa = JOptionPane.
                showInputDialog("Digite a placa: ");
        Veiculo corsa = new Veiculo(placa);
        //Pedir para o usuario ano, modelo, marca
        int ano = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o ano: "));
        corsa.setAno(ano);
        
        String marca = JOptionPane.
                showInputDialog("Digite a marca: ");
        corsa.setMarca(marca);
        String modelo = JOptionPane.
                showInputDialog("Digite a modelo: ");
        corsa.setModelo(modelo);
              
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
        
        
    }
    
}
