
package examen_biblioteca;
import java.util.*;
/**
 *
 * @author ESFOT
 */
public class Examen_Biblioteca {

    private String titulo;
    private String autor;
    private int anio;
    private boolean favorito;
    private String respuesta;
    
    Scanner entrada= new Scanner(System.in);
    
    public Examen_Biblioteca(String titulo,String autor ,int anio){
        this.titulo=titulo;
        this.autor=autor;
        this.anio=anio;
    }
    
    public String get_titulo(){
        return titulo;
    }
    public void set_titulo(String titulo){
        this.titulo=titulo;
    }
    public String get_autor(){
        return autor;
    }
    public void set_autor(String autor){
        this.autor=autor;
    }
    public int get_anio(){
        return anio;
    }
    public void set_anio(int anio){
        this.anio=anio;
    }
    
    public String get_favorito(){
        return respuesta;
    }
    public void set_favorito(String respuesta){
            this.respuesta=respuesta;
        if(respuesta=="si"){
            respuesta="si lo es";
        }else{
            respuesta="no, no lo es";
        }
    }
    
    
}
