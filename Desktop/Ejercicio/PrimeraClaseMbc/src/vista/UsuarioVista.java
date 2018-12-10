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
public class UsuarioVista {
    public void mostrarDatos(String datos){
        System.out.println("datos del usuario son: "+datos);
    }
    public void menu(){
        System.out.println(".: Usuario :.\n"
                + "ingresar/mostrar usuario\n"
                + "ingrese seleccion:");
    }
    public void nombre(){
        System.out.println("Ingresar nombre:");
    }
    public void apellidoPaterno(){
        System.out.println("Ingresar Apellido Paterno:");
    }
    public void apellidoMaterno(){
        System.out.println("Ingresar Apellido Materno:");
    }
    public void direccion(){
        System.out.println("Ingresar Direccion:");
    }
    public void telefono(){
        System.out.println("Ingresar Telefono:");
    }
    public void edad(){
        System.out.println("Ingresar Edad:");
    }
    public void email(){
        System.out.println("Ingresar Email:");
    }
    public void exito(){
        System.out.println("Creado con exito");
    }
    
}
