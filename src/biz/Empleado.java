/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz;

import com.mysql.jdbc.Connection;
import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Camilo
 */
public class Empleado implements Serializable {

    //MySql
    public static String url = "jdbc:mysql://localhost/login";
    public static String usuario = "root";
    public static String contraseña = "2018";
    public static String clase = "com.mysql.jdbc.Driver";
    //Atributos
    private long identificacion;
    private String nombre;
    private String correo;
    private String clave;
    private int liquidacionAnio;
    private int liquidacionMes;
    private Contrato contrato;

    public Empleado() {
    }

    public Empleado(long identificacion, String nombre, String correo, String clave, int administrador) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
    }

    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conectado");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conexion;
    }

    /**
     * @return the identificacion
     */
    public long getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
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
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the administrador
     */
    public int getLiquidacionAnio() {
        return liquidacionAnio;
    }

    public void setLiquidacionAnio(int liquidacionAnio) {
        this.liquidacionAnio = liquidacionAnio;
    }

    public int getLiquidacionMes() {
        return liquidacionMes;
    }

    public void setLiquidacionMes(int liquidacionmes) {
        this.liquidacionMes = liquidacionmes;
    }

    public int liquidarMes(int mescredito, int mesdeducciones) {

        //Crea variable que retorna el valor de la liquidacion mes
        int total2;
        Creditos oCredito = new Creditos();

        int x = oCredito.obtieneMes();
        mescredito = mescredito + x;

        Deducciones oDeducciones = new Deducciones();

        int y = mesdeducciones;

        total2 = mescredito - y;

        System.out.println("soy totalmes" + total2);

        setLiquidacionMes(total2);

        this.liquidacionMes = total2;

        return total2;
    }

    public int liquidarAnio(int aniocredito, int anodeduccion) {

        int total;
        Creditos oCredito = new Creditos();

        int z = oCredito.obtieneAno();
        aniocredito = aniocredito + z;

        Deducciones oDeducciones = new Deducciones();

        int c = anodeduccion;

        total = aniocredito - c;

        setLiquidacionAnio(total);

        this.liquidacionAnio = total;

        System.out.println("soy totalano" + this.liquidacionAnio);

        return total;
    }

    @Override
    public String toString() {
        return "Empleado : " + "identificacion=" + identificacion + ", nombre=" + nombre + ", correo=" + correo + ", liquidacionano=" + getLiquidacionAnio() + ", liquidacionmes=" + getLiquidacionMes();
    }

    /**
     * @return the contrato
     */
    public Contrato getContrato() {
        return contrato;
    }

    /**
     * @param contrato the contrato to set
     */
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

}
