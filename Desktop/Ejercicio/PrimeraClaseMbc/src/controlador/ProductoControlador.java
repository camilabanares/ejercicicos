/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Scanner;
import modelo.Producto;
import vista.ProductoVista;
/**
 *
 * @author 1-
 */
public class ProductoControlador {
    Scanner entrada= new Scanner (System.in);
    private Producto modelo;
    private ProductoVista vista;

    public ProductoControlador(Producto modelo, ProductoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void programa(){
        int salir=0;
        do{
        vista.menu();
        String seleccion= entrada.nextLine();
        switch (seleccion) {
            case "ingresar":
            ingresar();
            break;
            case "mostrar":
            mostrar();
            case "movimientos":
                movimientos();
            break;
            case "salir":
                salir=1;
                System.out.println("Saliendo");
            break;
            default:
                System.out.println("mal ingresado");
            break;          
        }
    } while (salir !=1);
       
    }    
    public void ingresar(){
        vista.menuIngresar();
        vista.nombre();
        modelo.setNombre(entrada.nextLine());
        vista.marca();
        modelo.setMarca(entrada.nextLine());
        vista.precio();
        modelo.setPrecio(entrada.nextInt());
        vista.stock();
        modelo.setStock(entrada.nextInt());
        vista.mostrarDatos(modelo.mostrarDatos());
        vista.exito();
    }
    public void mostrar(){
        vista.mostrarDatos(modelo.mostrarDatos());
    }
    public void movimientos(){
        int salir=0;
        do {
            vista.movimientos();
            String seleccion= entrada.nextLine();
            switch (seleccion) {
                case "descuento":
                    descuento();
                break;
                case "alza":
                    alza();
                break;
                case "ventas":
                    ventas();
                break;
                case "reposicion":
                    
                break;
                case "volver":
                    salir=1;
                break;
                default:
                    System.out.println("seleccione opcion valida");
                break;
            }
        } while (salir!=1);
        
    }
    public void descuento(){
        vista.descuento();
        modelo.descuento(entrada.nextInt());
        entrada.skip("\n");
        vista.exito();
    }
    public  void alza(){
        vista.alza();
        modelo.alza(entrada.nextInt());
        entrada.skip("\n");
        vista.exito();
    }
    public void ventas(){
        vista.ventas();
        int ventas= entrada.nextInt();
        entrada.skip("\n");
        if (ventas<=modelo.getStock()) {
            modelo.ventas(ventas);
            vista.exito();
        }else{
            vista.errorVentas();
        }
        
    }
    public void reposicion(){
        vista.reposicion();
        modelo.reposicion(entrada.nextInt());
        entrada.skip("\n");
        vista.exito();
    }
           
}
