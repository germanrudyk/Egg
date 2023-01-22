/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Servicios.LibroService;
import java.util.Scanner;

/**
 *
 * @author German
 */
public class Menu {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final LibroService ls;

    public Menu() {

        this.ls = new LibroService();

    }

    public void menu() {

        int opc;

        do {
            System.out.println("BIENVENIDO");
            System.out.println("Eliga una opcion");
            System.out.println("1 - Agregar libro");
            System.out.println("2 - Editar libro");
            System.out.println("3 - Eliminar libro");
            System.out.println("4 - Salir");

            opc = leer.nextInt();
        } while (opc != 4);

        System.out.println("Adios");

    }

}
