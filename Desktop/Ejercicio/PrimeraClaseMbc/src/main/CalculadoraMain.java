package main;

import controlador.CalculadoraControlador;
import modelo.Calculadora;
import vista.CalculadoraVista;

public class CalculadoraMain {

    public static void main(String[] args) {
        Calculadora modelo= new Calculadora();
        CalculadoraVista vista= new CalculadoraVista();
        CalculadoraControlador controlador= new CalculadoraControlador(modelo,vista);
        controlador.programa();
    }
    
}
