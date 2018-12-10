/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author 1-
 */
public class ProductoVista {
    
    public void menu(){
        System.out.println(".: Producto :.\n"
                + "Ingresar/Mostrar/Movimetos/Salir\n"
                + "selecciona una opcion");
               
    }
    public void mostrarDatos(String datos){
        System.out.println(datos);
    }
    public void menuIngresar(){
        System.out.println(".: Ingresar Producto:. ");
    }
    public void nombre(){
        System.out.println("Ingrese nombre:");
    }
    public void marca(){
        System.out.println("Ingrese marca:");
    }
    public void precio(){
        System.out.println("Ingrese precio:");
    }
    public void stock(){
        System.out.println("Ingrese stock:");
    }
    public  void movimientos(){
        System.out.println(".: Mvimientos:. \n"
                + "decuentos/alza/ventas/reposicion/volver\n"
                + "seleccione una opcion:");
    }
    public void exito(){
        System.out.println("ingresado exitosamente");
    }
    public  void descuento(){
        System.out.println("ingrese descuento en el producto:");
    }
    public void alza(){
        System.out.println("ingrese alza en el producto:");
    }
    public void ventas(){
        System.out.println("igrese cantidad de productos vendidos:");
    }
    public void reposicion(){
        System.out.println("igrese cantidad de productos en reposicion:");
    }
    public void errorVentas(){
        System.out.println("no hay stock suficiente");
    }
}
