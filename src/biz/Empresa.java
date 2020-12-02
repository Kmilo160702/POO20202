/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz;

import java.util.ArrayList;

/**
 *
 * @author Camilo
 */
public class Empresa {

    private double nit;
    private ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    /**
     * @return the nit
     */
    public double getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(double nit) {
        this.nit = nit;
    }

    /**
     * @return the empleados
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * @param empleados the empleados to set
     */
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nit=" + nit + ", empleados=" + empleados + '}';
    }
    

}
