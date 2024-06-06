/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yagoc
 */
public class Empleado {
    
    private int id;
    private int cantidad;
    private String nombre;
    private String departamento;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String departamento,int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", cantidad=" + cantidad + ", nombre=" + nombre + ", departamento=" + departamento + '}';
    }
    
    


    
    
    
}
