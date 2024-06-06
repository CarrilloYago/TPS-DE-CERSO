/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author yagoc
 */
public interface EmpleadoDAO {
    Empleado save(Empleado empleado);
    List<Empleado> listar();
    Empleado buscar(int id);
    
}
