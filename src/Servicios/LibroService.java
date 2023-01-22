/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author German
 */
public class LibroService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void llenadoLibro(Libro l1){
        
        System.out.println("Ingrese ISBN: ");
        l1.setIsbn(leer.nextInt());
        
        System.out.println("Ingrese titulo del libro: ");
        l1.setTitulo(leer.next());
        
        System.out.println("Ingrese autor del libro: ");
        l1.setAutor(leer.next());
        
        System.out.println("Ingrese numero de paginas: ");
        l1.setNumPaginas(leer.nextInt());
        
     
    }
    
    
    
    public void mostrarInfo(Libro l1){
        
        System.out.println(l1.toString());
    }
    
    
}
