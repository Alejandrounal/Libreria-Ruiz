/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import javax.swing.JOptionPane;

/**
 *Declaracion de la clase Main, en la cual se ejecutara el programa
 * @author Alejandro
 */


public class Main {
    /**
     * Metodo que permite mostrar en pantalla la informacion de un libro dado su Isbn
     * @param isbn Define el isbn del libro a mostrar informacion 
     * @param tienda Define la tienda de la cual se obtendra la informacion
     */ 
    public static void informacionIsbn(String isbn,Tienda tienda){
        if(tienda.informacionIsbn(isbn).getIsbn() ==  null){
           // System.out.println("el libro no existe");
           JOptionPane.showMessageDialog(null,"El lbro no existe");
        }else{
            //System.out.println(tienda.informacionIsbn(isbn).darCaracteristicas());
            JOptionPane.showMessageDialog(null,tienda.informacionIsbn(isbn).darCaracteristicas());  
        }
    }
    /**
     * Metodo que permite mostrar en pantalla la informacion de un libro dado su Nombre
     * @param nombre Define el nombre del libro a mostrar la informacion
     * @param tienda Define la tienda de la cual se obtendra la informacion
     */
     public static void informacionNombre(String nombre,Tienda tienda){
        if(tienda.informacionIsbn(nombre).getNombre() ==  null){
            //System.out.println("el libro no existe");
            JOptionPane.showMessageDialog(null,"El lbro no existe");
        }else{
            //System.out.println(tienda.informacionIsbn(nombre).darCaracteristicas());
            JOptionPane.showMessageDialog(null,tienda.informacionNombre(nombre).darCaracteristicas());  
        }
    }
     /**
      * Metodo que permite verificar si es posible realizar la venta del libro nuevo, de no ser asi muestra en pantalla cuantos libros hay nuevos y usdaos del ejemplar buscado 
      * @param cantidad Define la cantidad de libros a vender
      * @param isbn Define el isbn de libro a vender
      * @param tienda Define la tienda de la cual se obtendra la informacion
      */
    public static void verificarVentaNuevo(int cantidad, String isbn, Tienda tienda){
        if(tienda.informacionIsbn(isbn).getCantidadNuevo()<cantidad){
            //System.out.println("No hay suficientes libros, la transaccion no puede ser realizada");
            //System.out.println("Del producto solo hay:    " + tienda.informacionIsbn(isbn).getCantidadNuevo()+ " libros nuevos       y       "  + tienda.informacionIsbn(isbn).getCantidadUsado()+"  libros usados");
            JOptionPane.showMessageDialog(null, "No hay sufientes libros, la transaccion no puede ser realizada \n     Del producto hay   " + tienda.informacionIsbn(isbn).getCantidadNuevo()+ " libros nuevos       y       "  + tienda.informacionIsbn(isbn).getCantidadUsado()+"  libros usados" );
        }else{
            tienda.venderNuevo(cantidad, isbn);
            //System.out.println("Transaccion realizada");
            JOptionPane.showMessageDialog(null, "Transaccion realizada");
        }
    }
     /**
      * Metodo que permite verificar si es posible realizar la venta del libro usado, de no ser asi muestra en pantalla cuantos libros hay nuevos y usdaos del ejemplar buscado 
      * @param cantidad Define la cantidad de libros a vender
      * @param isbn Define el isbn de libro a vender
      * @param tienda Define la tienda de la cual se obtendra la informacion
      */
    public static void verificarVentaUsado(int cantidad, String isbn, Tienda tienda){
        if(tienda.informacionIsbn(isbn).getCantidadUsado()<cantidad){
           // System.out.println("No hay suficientes libros, la transaccion no puede ser realizada");
            //System.out.println("Del producto solo hay:    " + tienda.informacionIsbn(isbn).getCantidadNuevo()+ " libros nuevos       y       "  + tienda.informacionIsbn(isbn).getCantidadUsado()+"  libros usados");
            JOptionPane.showMessageDialog(null, "No hay sufientes libros, la transaccion no puede ser realizada \n     Del producto hay    " + tienda.informacionIsbn(isbn).getCantidadNuevo()+ " libros nuevos       y       "  + tienda.informacionIsbn(isbn).getCantidadUsado()+"  libros usados" );
        }else{
            tienda.venderUsado(cantidad, isbn);
            //System.out.println("Transaccion realizada");
            JOptionPane.showMessageDialog(null, "Transaccion realizada");
        }
    }
    /**
     * Metodo en el cual se ejecutan el resto de metodos 
     * @param args Es el ejecutable
     */
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        JOptionPane.showMessageDialog(null,"Bienvenido a la libreria");  
        int entrada = 0;
        while(entrada != 16) {
            entrada = Integer.parseInt(JOptionPane.showInputDialog("    Que desea hacer: \n 1.Agregar Libro           \n 2.Eliminar Libro por Isbn         \n 3.Eliminar Libro por Nombre        \n 4.Informacion por Isbn         \n 5.Informacion por Nombre         \n 6.Vender Nuevo        \n 7.Vender Usado          \n 8.Abastecer Nuevo       \n 9.Abastecer Usado      \n 10.Saber que libros faltan         \n 11.Cambiar Precio de Compra Nuevo \n 12.Cambiar Precio de Compra Usado \n 13.Cambiar Precio de Venta Nuevo \n 14. Cambiar Precio de Compra Usado \n \n              15. Salir del programa \n " ));
            switch(entrada){
                case 1: 
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del libro");
                    String isbn = JOptionPane.showInputDialog("Ingrese el isbn del libro");
                    String autor = JOptionPane.showInputDialog("Ingrese el autor del libro");
                    String editorial = JOptionPane.showInputDialog("Ingrese la editorial del libro");
                    float precioVentaNuevo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de venta nuevo"));
                    float precioVentaUsado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de venta usado"));
                    float precioCompraNuevo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de compra nuevo"));
                    float precioCompraUsado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de compra usado"));
                    int estante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del estante en donde se ubicara el libro"));
                    int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila en donde se ubicara el libro"));
                    String espacios = JOptionPane.showInputDialog("Ingrese el rango de espacios en donde se ubicara el libro");
                    tienda.agregarLibro(nombre, autor, isbn, editorial, precioVentaNuevo, precioVentaUsado, precioCompraNuevo,precioCompraUsado , espacios, fila, estante);
                    break;
                    
                case 2:
                    String isbn2 = JOptionPane.showInputDialog("Ingrese el isbn del libro");
                    tienda.eliminarLibroIsbn(isbn2);
                    break;
                
                case 3:
                    String nombre3 = JOptionPane.showInputDialog("Ingrese el nombre del libro del libro");
                    tienda.eliminarLibroIsbn(nombre3);
                    break;
                    
                case 4:
                    String isbn4 = JOptionPane.showInputDialog("Ingrese el Isbn del libro");
                    informacionIsbn(isbn4,tienda);
                    break;
                    
                case 5:
                    String nombre5 = JOptionPane.showInputDialog("Ingrese el nombre del libro del libro");
                    informacionNombre(nombre5,tienda);
                    break;
                    
                case 6:
                    int cantidad6 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de libros a vender"));
                     String isbn6 = JOptionPane.showInputDialog("Ingrese el nombre del Isbn del libro");
                     verificarVentaNuevo(cantidad6,isbn6, tienda);
                     break;
                     
                case 7: 
                    int cantidad7 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de libros a vender"));
                     String isbn7 = JOptionPane.showInputDialog("Ingrese el Isbn del libro");
                     verificarVentaUsado(cantidad7,isbn7, tienda);
                     break;
                     
                case 8:
                     int cantidad8 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de libros a abastecer"));
                     String isbn8 = JOptionPane.showInputDialog("Ingrese el Isbn del libro");
                     tienda.abastecerNuevo(cantidad8, isbn8);
                     break;
                     
                case 9:
                     int cantidad9 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de libros a abastecer"));
                     String isbn9 = JOptionPane.showInputDialog("Ingrese el Isbn del libro");
                     tienda.abastecerUsado(cantidad9, isbn9);
                     break;
                     
                case 10:
                    tienda.librosFaltantes();
                    break;
                    
                case 11:
                     String isbn11 = JOptionPane.showInputDialog("Ingrese el isbn del libro");
                     float valorNuevo11 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de compra del producto nuevo"));
                     tienda.cambiarPrecioCompraNuevo(valorNuevo11, isbn11);
                     break;
                     
                case 12:
                     String isbn12 = JOptionPane.showInputDialog("Ingrese el isbn del libro");
                     float valorNuevo12 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de compra del producto usado"));
                     tienda.cambiarPrecioCompraUsado(valorNuevo12, isbn12);
                     break;
                
                case 13:
                     String isbn13 = JOptionPane.showInputDialog("Ingrese el isbn del libro");
                     float valorNuevo13 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de venta del producto nuevo"));
                     tienda.cambiarPrecioVentaNuevo(valorNuevo13, isbn13);
                     break;
                     
                case 14:
                     String isbn14 = JOptionPane.showInputDialog("Ingrese el isbn del libro");
                     float valorNuevo14 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de venta del producto usado"));
                     tienda.cambiarPrecioVentaUsado(valorNuevo14, isbn14);
                     break;
                     
                case 15: 
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
        }
    }    
}  
    