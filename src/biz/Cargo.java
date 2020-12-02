package biz;

import java.io.Serializable;

public class Cargo implements Serializable {

    private String descripcion;

    private double salario;

    private String nombreCargo;
    
    
    
    public Cargo(){}

    public Cargo(String descripcion, double salario, String nombreCargo) {
        this.descripcion = descripcion;
        this.salario = salario;
        this.nombreCargo = nombreCargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }
    @Override
     public String toString() {
        return "descripcion= " + descripcion  + ", \t\t"  +"salario= " + salario + ", \t\t"  +"nombre del cargo= " + nombreCargo ;
    }

}