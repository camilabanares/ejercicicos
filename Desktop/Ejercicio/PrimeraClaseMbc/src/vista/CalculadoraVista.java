package vista;

public class CalculadoraVista {
    
    public void menu(){
        System.out.println(".: Menu :.\n"
                + "suma/resta/multiplicacion/division\n"
                + "Ingrese operacion:");
    }
    public void menuSuma(){
        System.out.println(".:Suma:.");
    }
    public void menuResta(){
        System.out.println(".:Resta:.");
    }
    public void menuMultiplicacion(){
        System.out.println(".:Multiplicacion:.");
    }
    public void menuDivision(){
        System.out.println(".:Divsion:.");
    }
    public void entradaDatos(){
        System.out.println("Igrese numero:");
    }
    public void mostrarDatos(int resultado){
        System.out.println("El resultado es: "+resultado);
    }
}
