package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class arrays {
    public static void main(String[] args) {
//Crea una lista de colores utilizando la clase ArrayList que contenga los colores: “rojo”, “verde”, “azul”.
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");

        //Imprime cuántos elementos hay en la lista.
        System.out.println("La lista tiene " + colores.size() + " colores.");

        //Añade al final de la lista el color “blanco”
        colores.add("blanco");

        //Imprime cuántos elementos hay en la lista.
        System.out.println("La lista tiene " + colores.size() + " colores.");

        //Imprime cuál es el elemento de la primera y tercera posición de la lista.
        System.out.println("El primer elemento de la lista es: " + colores.get(0));
        System.out.println("El tercer elemento de la lista es: " + colores.get(2));

        //Recorre la lista haciendo uso del for tradicional for(int i=0; …) e imprime todos sus elementos.
        System.out.println("Recorrido de la lista con el for tradicional:");
        for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }

        //Recorre la lista haciendo uso de java for-each loop for(data_type variable: arraylist_name)
        // e imprime todos los elementos.
        System.out.println("Recorrido de la lista con el for-each loop:");
        for (String color : colores) {
            System.out.println(color);
        }

        //Escribe el código que compruebe si el color blanco está en la lista e imprime si está o no está por pantalla.
        if (colores.contains(colores.get(3))) {
            System.out.println("El color blanco está en la lista.");
        } else {
            System.out.println("El color blanco no está en la lista.");
        }

        //Elimina el color blanco de la lista.
        colores.remove("blanco");

        //Imprime la lista y comprueba que el color blanco no está.
        System.out.println("La lista después de eliminar el color blanco:");
        for (String color : colores) {
            System.out.println(color);
        }

        //Elimina el color situado en la posición 2 de la lista.
        colores.remove(2);

        //Imprime la lista y comprueba que el color azul no está.
        System.out.println("La lista después de eliminar el color en la posición 2:");
        for (String color : colores) {
          if ( !color.equals("azul")) System.out.println(color);
          else System.out.println("El color esta azul");
        }

        //Añade el color azul después del color rojo
        colores.add(1, "azul");
        System.out.println("Se ha añadido el color azul");
        //Sustituye el color azul por el color amarillo, haciendo uso del método set
        colores.set(2, "amarillo");
        //Ordena el contenido de la lista alfabéticamente de menor a mayor haciendo uso de Collections.sor
    }
}


