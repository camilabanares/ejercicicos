
package controlador;

import java.util.Scanner;
import modelo.Calculadora;
import vista.CalculadoraVista;

public class CalculadoraControlador {
    Scanner entrada= new Scanner(System.in);
    private Calculadora modelo;
    private  CalculadoraVista vista;

    public CalculadoraControlador(Calculadora modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public CalculadoraControlador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void programa(){
        this.vista.menu();
        String operacion= entrada.nextLine();
        switch (operacion) {
            case "suma":
                suma();
            break;
            case "resta":
                resta();
            break;
            case "multiplicacion":
                multiplicacion();
            break;
            case "division":
                division();
            break;
            default:
                System.out.println("opcion no valida");
            break;
        }
    }
    public void suma(){
        vista.menuSuma();
        vista.entradaDatos();
        modelo.setNumeroUno(entrada.nextInt());
        vista.entradaDatos();
        modelo.setNumeroDos(entrada.nextInt());
        modelo.suma();
        vista.mostrarDatos(modelo.getResultado());
    }
    public void resta(){
        vista.menuResta();
        vista.entradaDatos();
        modelo.setNumeroUno(entrada.nextInt());
        vista.entradaDatos();
        modelo.setNumeroDos(entrada.nextInt());
        modelo.resta();
        vista.mostrarDatos(modelo.getResultado());
    }
    public void multiplicacion(){
        vista.menuMultiplicacion();
        vista.entradaDatos();
        modelo.setNumeroUno(entrada.nextInt());
        vista.entradaDatos();
        modelo.setNumeroDos(entrada.nextInt());
        modelo.multiplicacion();
        vista.mostrarDatos(modelo.getResultado());
    }
    public void division(){
        vista.menuDivision();
        vista.entradaDatos();
        modelo.setNumeroUno(entrada.nextInt());
        vista.entradaDatos();
        modelo.setNumeroDos(entrada.nextInt());
        modelo.division();
        vista.mostrarDatos(modelo.getResultado());
    }
    public void entrada(){
        
    }
    
    
}
