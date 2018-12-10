/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 1-
 */
public class Producto {
    private String nombre;
    private String marca;
    private int precio;
    private int stock;
    
    public Producto (){
    }
    public Producto(String nombre, String marca, int precio, int stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String mostrarDatos(){
        return this.nombre+" de la marca "+this.marca+" con un precio de "
                +this.precio+" con un stock de "+this.stock;
                
    }
    public void descuento(int descuento){
        this.precio= (int)(this.precio*((double)(100-descuento)/100));
    }
    public void alza(int alza){
        this.precio=(int)(this.precio*((double)(100+alza)/100));
    }
    public void ventas(int ventas){
        this.stock=(this.stock-ventas);
    }
    public void reposicion(int reposicion){
        this.stock=(this.stock+reposicion);
    }
            
}
