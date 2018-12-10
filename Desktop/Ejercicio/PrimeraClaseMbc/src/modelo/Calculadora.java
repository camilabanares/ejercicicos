package modelo;

public class Calculadora {
    private int numeroUno;
    private int numeroDos;
    private int resultado;
    
    public Calculadora() {
    
    }

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    public void suma(){
        this.resultado= this.numeroUno+this.numeroDos;
    }    
    public void resta(){
        this.resultado= this.numeroUno-this.numeroDos;
    }
    public void multiplicacion(){
        this.resultado= this.numeroUno*this.numeroDos;
    }
    public void division(){
        this.resultado= this.numeroUno/this.numeroDos;
    }
    
    
}
