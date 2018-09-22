/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import java.util.ArrayList;

/** Declaracion de la clase libro
 * Clase que contiende los datos del libro
 * @author Alejandro
 */
public class Libro {
    
    private String nombre, autor, editorial;
    private String isbn;
    private float precioVentaNuevo;
    private float precioventaUsado;
    private float precioCompraNuevo;
    private float precioCompraUsado;
    private int cantidadNuevo, cantidadUsado;
    private Ubicacion ubicacion = new Ubicacion();
   
    /**
     * Constructor para la creacion de un libro
     * @param nombre Este parametro define el nombre o titulo del libro
     * @param autor Este parametro define el nombre del autor del libro
     * @param isbn Este parametro define el isbn del libro
     * @param editorial Este parametro define el nombre de la editorial del libro
     * @param precioVentaNuevo Este parametro define el precio por el cual se vendera el libro nuevo
     * @param precioventaUsado Este parametro define el precio por el cual se vendera el libro usado
     * @param precioCompraNuevo Este parametro define el precio por el cual se compra el libro nuevo
     * @param precioCompraUsado Este parametro define el precio por el cual se compra el libro usado
     * @param ubicacion Este parametro define la ubicacion del libro
     * @see #ubicacion
     */
    public Libro(String nombre, String autor, String isbn, String editorial, float precioVentaNuevo, float precioventaUsado, float precioCompraNuevo, float precioCompraUsado, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
        this.precioVentaNuevo = precioVentaNuevo;
        this.precioventaUsado = precioventaUsado;
        this.precioCompraNuevo = precioCompraNuevo;
        this.precioCompraUsado = precioCompraUsado;
        this.cantidadNuevo = cantidadNuevo;
        this.cantidadUsado = cantidadUsado;
        this.ubicacion = ubicacion;
    }
  
    /**
     * Constructor de libro que no recibe parametros
     */ 
    public Libro() {
    }
    /**
     * Devuelve el nombre del libro
     * @return Retorna el nombre del libro 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Devuelve el isbn del libro
     * @return Retorna el isbn
     */
    public String getIsbn() {
        return isbn;
    }
    /**
     * Devuelve el precio de venta del libro cuando este es nuevo
     * @return el precio de venta nuevo
     */
    public float getPrecioVentaNuevo() {
        return precioVentaNuevo;
    }
    /**
     * Devuelve el precio de venta del libro cuando este es usado
     * @return el precio de venta nuevo
     */ 
    public float getPrecioventaUsado() {
        return precioventaUsado;
    }
    /**
     * Devuelve el precio de compra del libro cuando este es nuevo
     * @return Precio de compra del libro nuevo
     */
    public float getPrecioCompraNuevo() {
        return precioCompraNuevo;
    }
    /**
     * Devuelve el precio de compra del libro cuando este es nuevo
     * @return Precio de compra del libro nuevo
     */
    public float getPrecioCompraUsado() {
        return precioCompraUsado;
    }
    /**
     * Devuelve la cantidad de libros nuevos que hay 
     * @return cantidad de libros nuevos
     */
    public int getCantidadNuevo() {
        return cantidadNuevo;
    }
    /**
     * Devuelve la cantidad de libros usados que hay 
     * @return cantidad de libros usados
     */
    public int getCantidadUsado() {
        return cantidadUsado;
    }
    /**
     * Devuelve la ubicación del libro 
     * @return Retorna un objeto de la clase Ubicacion
     */
    public Ubicacion getUbicacion() {
        return ubicacion;
    }
    /**
     * Metodo que retorna en forma de String las caracteristicas del libro
     * @return Caracteristicas del libro
     */
    public String darCaracteristicas(){
        return "Nombre = " + nombre + "\n Autor = "+autor+"\n Editorial = "+ editorial +"\n Isbn = "+isbn + "\n Precio de venta nuevo = "+ precioVentaNuevo + "\n Precio de venta usado = " + precioventaUsado + "\n Precio de compra nuevo = " + precioCompraNuevo + "\n Precio de compra usado = " + precioCompraUsado + "\n Cantidad Nuevo = " + cantidadNuevo + "\n Cantidad Usado = " + cantidadUsado + "\n Ubicacion = " + "Estante:  "  +ubicacion.getEstante() + "     Fila:  "+ubicacion.getFila()+"     Intervalo de espacios:      "+ubicacion.getEspacios();
    }
    
    /**
     * Metodo que modifica la cantidad de libros nuevos existentes
     * @param cantidadNuevo Parametro que define la nueva cantidad de libros que habra
     */ 
    public void setCantidadNuevo(int cantidadNuevo) {
        this.cantidadNuevo = cantidadNuevo;
    }
    /**
     * Metodo que modifica la cantidad de libros usados existente
     * @param cantidadUsado Este parametro define la nueva cantidad de libors que habra
     */
    public void setCantidadUsado(int cantidadUsado) {
        this.cantidadUsado = cantidadUsado;
    }
    /**
     * Este metodo modifica el precio de venta del libro nuevo
     * @param precioVentaNuevo Nuevo precio de venta
     */
    public void setPrecioVentaNuevo(float precioVentaNuevo) {
        this.precioVentaNuevo = precioVentaNuevo;
    }
    /**
     * Este metodo modifica el precio de venta del libro usado
     * @param precioventaUsado Nuevo precio de venta
     */ 
    public void setPrecioventaUsado(float precioventaUsado) {
        this.precioventaUsado = precioventaUsado;
    }
    /**
     * Metodo que modifica el precio de compra del libro nuevo
     * @param precioCompraNuevo Nuevo precio de compra
     */ 
    public void setPrecioCompraNuevo(float precioCompraNuevo) {
        this.precioCompraNuevo = precioCompraNuevo;
    }
    /**
     * Metodo que modifica el precio de compra del libro usado
     * @param precioCompraUsado Nuevo valor
     */
    public void setPrecioCompraUsado(float precioCompraUsado) {
        this.precioCompraUsado = precioCompraUsado;
    }
   
    
}
