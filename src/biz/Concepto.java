package biz;

import java.io.Serializable;

public class Concepto implements Serializable {

    private String nombre;


    private double porcentaje;
    
   
     public Concepto(String nombre,double porcentaje) {
    }
     
    public Concepto(){
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the porcentaje
     */
    public double getPorcentaje() {
        return porcentaje;
    }

    /**
     * @param porcentaje the porcentaje to set
     */
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    /**
     * @return the creditos
     */
   

    @Override
    public String toString() {
        return  "nombre:  " + nombre  + "   porcentaje:  "  + porcentaje/100 ;

    }    
   
}
