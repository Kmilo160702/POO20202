package biz;

import java.io.Serializable;

public class Deducciones implements Serializable {

    private int mesDeduccion;

    private int anioDeduccion;
    
   private Concepto concepto;

    public Deducciones() {
        
    }


    /**
     * @return the mesDeduccion
     */
    public int getMesDeduccion() {
        return mesDeduccion;
    }

    /**
     * @param mesDeduccion the mesDeduccion to set
     */
    public void setMesDeduccion(int mesDeduccion) {
        this.mesDeduccion = mesDeduccion;
    }

    /**
     * @return the anioDeduccion
     */
    public int getAnioDeduccion() {
        return anioDeduccion;
    }

    /**
     * @param anioDeduccion the anioDeduccion to set
     */
    public void setAnioDeduccion(int anioDeduccion) {
        this.anioDeduccion = anioDeduccion;
    }
     public String toString() {
       return "MesDeduccion: "+getMesDeduccion()+"   AnioDeduccion:  "+getAnioDeduccion()+" Concepto: "+getConcepto();
}

    /**
     * @return the concepto
     */
    public Concepto getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(Concepto concepto) {
        this.concepto = concepto;
    }
}
