/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controlador.ProductoControlador;
import modelo.Producto;
import vista.ProductoVista;

/**
 *
 * @author 1-
 */
public class ProductoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto modelo=new Producto();
        ProductoVista vista= new ProductoVista();
        ProductoControlador controlador= new ProductoControlador(modelo,vista);
        controlador.programa();
    }
    
}
