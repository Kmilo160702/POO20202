package biz;

import java.io.Serializable;

public class Creditos  implements Serializable{

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

    private int mesCreditos;

    private int anioCreditos;
    
     private Concepto concepto;
    
    

    public Creditos(){
    }

    /**
     * @return the mesCreditos
     */
    public int getMesCreditos() {
        return mesCreditos;
    }

    /**
     * @param mesCreditos the mesCreditos to set
     */
    public void setMesCreditos(int mesCreditos) {
        this.mesCreditos = mesCreditos;
    }

    /**
     * @return the anioCreditos
     */
    public int getAnioCreditos() {
        return anioCreditos;
    }
    
    

    /**
     * @param anioCreditos the anioCreditos to set
     */
    public void setAnioCreditos(int anioCreditos) {
        this.anioCreditos = anioCreditos;
    }
    
    
    public int obtieneMes(){
        return getMesCreditos();
    }
    
    public int obtieneAno(){
        return getAnioCreditos();
    }
    
    @Override
     public String toString() {
       return "Concepto" + getConcepto() + "MesCreditos:  "+getMesCreditos()+"   AnioCreditos:  "+getAnioCreditos();
       
    }
}
