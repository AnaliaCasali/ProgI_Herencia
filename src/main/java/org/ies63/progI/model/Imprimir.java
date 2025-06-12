package org.ies63.progI.model;

public interface Imprimir{
      // metodo abstracto   para mostrar datos
      // abstracto xq no tiene cuerpo
    public static final String
          MENSAJE_BIENVENIDA = "Bienvenido al sistema de gestion de productos";

     public void MostrarDatos();

     default void MostrarBienvenida() {
       System.out.println(MENSAJE_BIENVENIDA);
     }

}
