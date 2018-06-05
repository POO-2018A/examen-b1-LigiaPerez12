/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_biblioteca;

/**
 *
 * @author ESFOT
 */
public class Uso_biblioteca {
    public static void main(String[] args) {
        Examen_Biblioteca biblioteca=new Examen_Biblioteca("Detectives Salvajes","Roberto Bolaño",1988);
        System.out.println("Nombre de la obra: "+biblioteca.get_titulo());
        System.out.println("nombre del autor: "+biblioteca.get_autor());
        System.out.println("año de la obra: "+biblioteca.get_anio());
        System.out.println("Este libro es de sus favoritos???");
        biblioteca.set_favorito("si");
        System.out.println(biblioteca.get_favorito());
        
        Examen_Biblioteca biblioteca1=new Examen_Biblioteca("plata quemada","Ricardo piglia",1977);
        System.out.println("Nombre de la obra: "+biblioteca1.get_titulo());
        System.out.println("nombre del autor: "+biblioteca1.get_autor());
        System.out.println("año de la obra: "+biblioteca1.get_anio());
        System.out.println("Este libro es de sus favoritos???");
        biblioteca.set_favorito("no");
        System.out.println(biblioteca1.get_favorito());
    }
}    
