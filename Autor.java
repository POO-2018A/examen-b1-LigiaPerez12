
package examen_biblioteca;
import java.util.*;
/**
 *
 * @author ESFOT
 */
public class Autor extends Examen_Biblioteca {
    
    private String pais;

    public Autor(String titulo, String autor, int anio) {
        super(titulo, autor, anio);
    }
   
    public String get_pais(){
        return pais;
    }
    public void set_pais(String pais){
        this.pais=pais;
    }
    
    
}
