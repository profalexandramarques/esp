package arrays;

/**
 *
 * @author Alexandra
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] carros = {"Fusca", "Corsa", "Mobi", "Fiat 500","Gol"};
        //System.out.println(carros[0]);        
        System.out.println("Carros");
        for(int i=0;i<carros.length;i++){
          System.out.println(carros[i]);  
        }
        System.out.println("Numeros");
        int[] numeros = {1, 2, 3, 4, 5, 7, 9, 11};
        for(int i=0;i<numeros.length;i++){
          System.out.println(numeros[i]);  
        }
    }
    
}
