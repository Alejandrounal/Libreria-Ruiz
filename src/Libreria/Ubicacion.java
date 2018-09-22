/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

/**
 * Defifnicion de la clase Ubicacion, en la cual se almacenan los datos en donde se ubica un libro
 * @author Alejandro
 */
public class Ubicacion {
    private int estante, fila;
    private String espacios;
    /**
     * Constructor que no recibe parametros
     */
    public Ubicacion() {
    }
    /**
     * Construstor de una Ubicaion 
     * @param estante Define el numero del estante
     * @param fila Define el numero de la fila
     * @param espacios Define el intervalo en el cual se encontra ubicado el libro dentro de la fila en un estante
     */
    public Ubicacion(int estante, int fila, String espacios) {
        this.estante = estante;
        this.fila = fila;
        this.espacios = espacios;
    }
    /**
     * Metodo que devuelve el estante en donde esta un libro
     * @return numero del estante
     */
    public int getEstante() {
        return estante;
    }
     /**
      * Metodo que devuelve la fila en donde se encuentra un libro
      * @return Numero de la fila 
      */
    public int getFila() {
        return fila;
    }
    /**
     * Metodo que devuelve el intervalo en el cual se encuentra el libro dentro de una fila de un estante
     * @return Intervalo
     */
    public String getEspacios() {
        return espacios;
    }
}
