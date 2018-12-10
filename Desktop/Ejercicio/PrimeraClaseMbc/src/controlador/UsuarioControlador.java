/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Scanner;
import modelo.Usuario;
import vista.UsuarioVista;

/**
 *
 * @author 1-
 */
public class UsuarioControlador {
    Scanner entrada= new Scanner(System.in);
    private Usuario modelo;
    private UsuarioVista vista;
   

    public UsuarioControlador(Usuario modelo, UsuarioVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void programa(){
        vista.menu();
        String seleccion= entrada.nextLine();
        switch (seleccion) {
            case "ingresar":
                ingresar();
            break;
            case "mostrar":
                mostrar();
            break;
            default:
                System.out.println("mal ingresado");
            break;
        }
    }
    public void mostrar(){
        vista.mostrarDatos(modelo.mostrarDatos());
    }
    public void ingresar(){
        vista.nombre();
        modelo.setNombre(entrada.nextLine());
        vista.apellidoPaterno();
        modelo.setApellidoPaterno(entrada.nextLine());
        vista.apellidoMaterno();
        modelo.setApellidoMaterno(entrada.nextLine());
        vista.direccion();
        modelo.setDireccion(entrada.nextLine());
        vista.telefono();
        modelo.setTelefono(entrada.nextLine());
        vista.edad();
        modelo.setEdad(entrada.nextInt());
        entrada.skip("\n");
        vista.email();
        modelo.setEmail(entrada.nextLine());
        vista.exito();
        vista.mostrarDatos(modelo.mostrarDatos());
    }
}
