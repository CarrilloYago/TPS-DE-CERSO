/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cersotp1;

/**
 *
 * @author yagoc
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contador=0;
    

    public Producto(String nombre,double precio){
        this.nombre=nombre;
        this.precio=precio;
        this.idProducto=this.contador;
        this.contador++;
    }
    
    public void setNombre(String nuevoNombre){
        this.nombre=nuevoNombre;
    }
    
    public void setPrecio(double nuevoPrecio){
        this.precio=nuevoPrecio;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
   
   
}
