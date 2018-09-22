/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/** Declaracion de la clase Tienda
 * Clase en en la cual se administra los objetos de la clase Libro y Ubicacion
 * @author Alejandro
 */
public class Tienda {
    private ArrayList<Libro> coleccion = new ArrayList<Libro>();
   /**
    * Constructor de la clase libro, en la cual se crea un libro por defecto
    */
    public Tienda() {
        Ubicacion ubicacion = new Ubicacion(0,0,"0");
        Libro l1 = new Libro("Necesario","Necesario","Necesario", "Necesario",0,0,0,0,ubicacion);
        coleccion.add(l1);
        l1.setCantidadNuevo(1);
        l1.setCantidadUsado(1);
    }
   /**
    * Metodo que permite la agregacion de libros a la coleccion de la libreria, y evalua si el libro ya existe o no
    * @param nombre Parametro que define el nombre del libro
    * @param autor Parametro que define el autor del libro
    * @param isbn Parametro que define el isbn del libro
    * @param editorial Parametro que define la editorial del libro
    * @param precioVentaNuevo Parametro que define el precio de venta del libro nuevo
    * @param precioventaUsado Parametro que define el precio de venta del libro usado
    * @param precioCompraNuevo Parametro que define el precio de copra del libro nuevo
    * @param precioCompraUsado Parametro que define el precio de compra del libro usado
    * @param espacios Parametro que define el intervalo en el cual se encontrara el libro
    * @param fila Parametro que define la fila en la que se encuntra el libro
    * @param estante Parametro que define el estante en el que se encuentra el libro
    * @return Si el libro se puede crear, retorna verdadero de lo contrario retorna falso
    */
    public boolean agregarLibro(String nombre, String autor, String isbn, String editorial, float precioVentaNuevo, float precioventaUsado, float precioCompraNuevo, float precioCompraUsado, String espacios, int fila, int estante){
        Ubicacion u = new Ubicacion(estante,fila,espacios); 
        for (int i = 0; i < coleccion.size(); i++) {
           if(!coleccion.get(i).getIsbn().equals(isbn)){
              
               Libro libro = new Libro(nombre, autor, isbn, editorial, precioVentaNuevo,precioventaUsado, precioCompraNuevo,precioCompraUsado, u);
               coleccion.add(libro);
               return true;
           }
         }return false;
    }
    /**
     * Metodo que permite eliminar libros de la colección al ingresar su isbn
     * @param isbn Parametro que recibe el isbn del libro a eliminar
     * @return Si el libro se elimina retorna verdadero, de lo contrario falso
     */
    public boolean eliminarLibroIsbn(String isbn){
        for (int i = 0; i < coleccion.size(); i++) {
            if(coleccion.get(i).getIsbn().equals(isbn)){
                coleccion.remove(i);
                return true;
            }
        }return false;
    }
    /**
     * Metodo que permite eliminar libros de la colección al ingresar su nombre
     * @param nombre Define el nombre del libro a eliminar
     * @return Si el libro se elimina retorna verdadero, de lo contrario falso
     */
    public boolean eliminarLibroNombre(String nombre){
        for (int i = 0; i < coleccion.size(); i++) {
            if(coleccion.get(i).getNombre().equals(nombre)){
                coleccion.remove(i);
                return true;
            }
        }return false;
    }
    
    /**
     * Metodo que permite acceder a la informacion del libro que este retorna, basandose en su isbn
     * @param isbn Define el isbn del libro el cual se obtiene la información
     * @return Devuelve un Libro
     */
    public Libro informacionIsbn(String isbn){
        Libro libro = new Libro();
        for (int i = 0; i < coleccion.size(); i++) {
            if(coleccion.get(i).getIsbn().equals(isbn)){
               libro = coleccion.get(i);
               return libro;
            }
        }return libro;
    }
    /**
     * Metodo que permite acceder a la informacion del libro que este retorna, basandose en su nombre
     * @param nombre Define el nombre del libro del cual se buscara la informacion
     * @return Devuelde un objeto de la clase libro
     */
    public Libro informacionNombre(String nombre){
        Libro libro = new Libro();
        for (int i = 0; i < coleccion.size(); i++) {
            if(coleccion.get(i).getNombre().equals(nombre)){
               libro = coleccion.get(i);
               return libro;
            }
        }return libro;
    }
    /**
     * Metodo que permite cambiar la cantidad de libros nuevos existentes, si estos son vendidos y evalua si es posible realizar la trasaccion
     * @param cantidad Define la cantidad de libros a vender
     * @param isbn Define el isbn del libro a vender
     * @return Si se puede veder retorna verdadero de lo contrario retorna falso
     */
    public boolean venderNuevo(int cantidad, String isbn){
        for (int i = 0; i < coleccion.size(); i++) {
            if(coleccion.get(i).getIsbn().equals(isbn)){
                if(coleccion.get(i).getCantidadNuevo() < cantidad){
                    return false;
                }else{
                    coleccion.get(i).setCantidadNuevo(coleccion.get(i).getCantidadNuevo()-cantidad);
                    return true;
                }
            }
        }return false;
    }
    /**
     * Metodo que permite cambiar la cantidad de libros usados existentes, si estos son vendidos y evalua si es posible realizar la trasaccion
     * @param cantidad Define la cantidad de libros a vender
     * @param isbn Define el isbn del libro a vender
     * @return Si se puede veder retorna verdadero de lo contrario retorna falso
     */
    public boolean venderUsado(int cantidad, String isbn){
        for (int i = 0; i < coleccion.size(); i++) {
            if(coleccion.get(i).getIsbn().equals(isbn)){
                if(coleccion.get(i).getCantidadUsado() < cantidad){
                    return false;
                }else{
                    coleccion.get(i).setCantidadUsado(coleccion.get(i).getCantidadUsado()-cantidad);
                    return true;
                }
            }
        }return false;
    }
    /**
     * Metodo que permite cambiar la cantidad de libros nuevos existentes, si estos son abastecidos
     * @param cantidad Define la cantidad de libros que se agregan
     * @param isbn Define el isbn del libro a abastecer
     * @return Si el posible el abastecimiento retorna verdadero de lo contraio retorna falso
     */
    public boolean abastecerNuevo(int cantidad, String isbn){
        for (int i = 0; i < coleccion.size(); i++) {
            if(coleccion.get(i).getIsbn().equals(isbn)){
                coleccion.get(i).setCantidadNuevo(coleccion.get(i).getCantidadNuevo()+cantidad);
                return true;
            }
        }return false;
    }
    /**
     * Metodo que permite cambiar la cantidad de libros usados existentes, si estos son abastecidos
     * @param cantidad Define la cantidad de libros que se agregan
     * @param isbn Define el isbn del libro el cual sera abastecido
     * @return Define el isbn del libro a abastecer
     */
     public boolean abastecerUsado(int cantidad, String isbn){
        for (int i = 0; i < coleccion.size(); i++) {
            if(coleccion.get(i).getIsbn().equals(isbn)){
                coleccion.get(i).setCantidadUsado(coleccion.get(i).getCantidadUsado()+cantidad);
                return true;
            }
        }return false;
    }
    /**
     * Metodo que permite identificar el nombre de lo libros de los cuales ya no quedan unidades disponibles ni nuevas ni usadas
     */
     public void librosFaltantes(){
      ArrayList<String> arreglo = new ArrayList<String>();
         for (int i = 0; i < coleccion.size(); i++) {
             if(coleccion.get(i).getCantidadNuevo() == 0 && coleccion.get(i).getCantidadUsado()==0){
                 arreglo.add(coleccion.get(i).getNombre());
             }
         }
         //System.out.println("Los libros que ya no tienen ejemplares nuevos o usados son:  ");
         JOptionPane.showMessageDialog(null,"Los libros que ya no tienen ejemplares nuevos o usados son:  " );
         for (int i = 0; i < arreglo.size(); i++) {
             //System.out.println(arreglo.get(i));
             JOptionPane.showMessageDialog(null, arreglo.get(i));
         }
     }
     /**
      * Metodo que permite modificar el precio de compra del libro nuevo 
      * @param valor Define el nuevo valor de venta
      * @param isbn Define el isbn del libro a modificar el precio
      * @return Si se realiza el cambio retorna verdadero, de lo contrario falso
      */
     public boolean cambiarPrecioCompraNuevo(float valor, String isbn){
         for (int i = 0; i < coleccion.size(); i++) {
             if(coleccion.get(i).getIsbn().equals(isbn)){
                 coleccion.get(i).setPrecioCompraNuevo(valor);
                 return true;
             }
         }return false;
     }
     /**
      * Metodo que permite modificar el precio de compra del libro usado 
      * @param valor Define el nuevo valor de venta
      * @param isbn Define el isbn del libro a modificar el precio
      * @return Si se realiza el cambio retorna verdadero, de lo contrario falso
      */
      public boolean cambiarPrecioCompraUsado(float valor, String isbn){
         for (int i = 0; i < coleccion.size(); i++) {
             if(coleccion.get(i).getIsbn().equals(isbn)){
                 coleccion.get(i).setPrecioCompraUsado(valor);
                 return true;
             }
         }return false;
     }
       /**
        * Metodo que permite modificar el precio de venta del libro nuevo
        * @param valor Define el nuevo valor de venta
        * @param isbn Define el isbn del libro a modificar el precio
        * @return Si se realiza el cambio retorna verdadero, de lo contrario falso
        */
       public boolean cambiarPrecioVentaNuevo(float valor, String isbn){
         for (int i = 0; i < coleccion.size(); i++) {
             if(coleccion.get(i).getIsbn().equals(isbn)){
                 coleccion.get(i).setPrecioVentaNuevo(valor);
                 return true;
             }
         }return false;
     }
       /**
        * Metodo que permite modificar el precio de venta del libro usado
        * @param valor Define el nuevo valor de venta
        * @param isbn Define el isbn del libro a modificar el precio
        * @return Si se realiza el cambio retorna verdadero, de lo contrario falso
        */
       public boolean cambiarPrecioVentaUsado(float valor, String isbn){
         for (int i = 0; i < coleccion.size(); i++) {
             if(coleccion.get(i).getIsbn().equals(isbn)){
                 coleccion.get(i).setPrecioventaUsado(valor);
                 return true;
             }
         }return false;
     } 
       
}
