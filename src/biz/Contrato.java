/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Camilo
 */
public class Contrato implements Serializable {

    private Date fechaInicio;
    private Date fechaFinal;
    private String numeroDeContrato;
    private String objetoContrato;
    private Cargo cargo;
    private Deducciones deducciones;
    private Creditos creditos;

    public Contrato(Cargo cargo) {
        this.cargo = cargo;
    }

    public Contrato() {
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFinal
     */
    public Date getFechaFinal() {
        return fechaFinal;
    }

    /**
     * @param fechaFinal the fechaFinal to set
     */
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * @return the numeroDeContrato
     */
    public String getNumeroDeContrato() {
        return numeroDeContrato;
    }

    /**
     * @param numeroDeContrato the numeroDeContrato to set
     */
    public void setNumeroDeContrato(String numeroDeContrato) {
        this.numeroDeContrato = numeroDeContrato;
    }

    /**
     * @return the objetoContrato
     */
    public String getObjetoContrato() {
        return objetoContrato;
    }

    /**
     * @param objetoContrato the objetoContrato to set
     */
    public void setObjetoContrato(String objetoContrato) {
        this.objetoContrato = objetoContrato;
    }

    /**
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the deducciones
     */
    public Deducciones getDeducciones() {
        return deducciones;
    }

    /**
     * @param deducciones the deducciones to set
     */
    public void setDeducciones(Deducciones deducciones) {
        this.deducciones = deducciones;
    }

    /**
     * @return the creditos
     */
    public Creditos getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(Creditos creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Contrato{" + "fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", numeroDeContrato=" + numeroDeContrato + ", objetoContrato=" + objetoContrato + ", cargo=" + cargo + ", deducciones=" + deducciones + ", creditos=" + creditos + '}';
    }

}
