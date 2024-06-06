/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yagoc
 */
public class EmpleadoDAOimp1 implements EmpleadoDAO{
    static List<Empleado> dbEmpleados = new ArrayList<>();

    @Override
    public Empleado save(Empleado empleado) {
        dbEmpleados.add(empleado);
        return empleado;
    }

    @Override
    public List<Empleado> listar() {
        return dbEmpleados;
    }

    @Override
    public Empleado buscar(int id) {
        for (Empleado dbEmpleado : dbEmpleados) {
            if(dbEmpleado.getId()== id){
                return new Empleado (id,dbEmpleado.getNombre(),dbEmpleado.getDepartamento(),dbEmpleado.getCantidad());
                }
            }
        
        return null;
    }
    
}
