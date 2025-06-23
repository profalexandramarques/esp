package arraylista;
import java.util.ArrayList;

/**
 *
 * @author Alexandra
 */
public class ArrayLista {

    /**
     * @param args Trabalhando com ArrayList
     */
    public static void main(String[] args) {
        // Reino Kod
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("Abacaxi");
        frutas.add("Banana");
        frutas.add("Caqui");
        frutas.add("Maçã");
        frutas.add("Limão");
        System.out.println(frutas);
        System.out.println("Tamanho "+frutas.size());
        System.out.println("Lista de Frutas");
        for(int i=0;i<frutas.size();i++){
          System.out.println(frutas.get(i));  
        }  
        //Altera o valor pelo index
        frutas.set(4,"Laranja");
        System.out.println(frutas);
        //Exclui todas as frutas
        frutas.clear();
    }
    
}
