/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Camilo
 */
public class Sql {

    public static Empleado conexion = new Empleado();
    public static PreparedStatement sentencia;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;

    public int guardar(String nombre, double identificacion, String correo, String contraseña) {

        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO usuarios (nombre,identificacion,correo,contraseña) VALUES (?,?,?,?)");
        try {
            conexion = Empleado.conectar();
            sentencia = conexion.prepareStatement(sentencia_guardar);
            sentencia.setString(1, nombre);
            sentencia.setDouble(2, identificacion);
            sentencia.setString(3, correo);
            sentencia.setString(4, contraseña);
            resultado = sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    public static String buscarNombre(String correo) {

        String busqueda_nombre = null;
        Connection conexion = null;

        try {
            conexion = Empleado.conectar();
            String sentencia_buscar = ("SELECT nombre,identificacion FROM usuarios WHERE correo = '" + correo + "'");
            sentencia = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia.executeQuery();
            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String identificacion = resultado.getString("identificacion");
                busqueda_nombre = (nombre + " " + identificacion);
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_nombre;
    }

    public static String buscarUsuario(String correo, String contraseña) {
        String busqueda_usuario = null;
        Connection conexion = null;
        try {
            conexion = Empleado.conectar();
            String sentencia_buscar_usuario = ("SELECT nombre,correo,contraseña FROM usuarios WHERE correo = '" + correo + "' && contraseña = '" + contraseña + "'");
            sentencia = conexion.prepareStatement(sentencia_buscar_usuario);
            resultado = sentencia.executeQuery();
            if (resultado.next()) {
                busqueda_usuario = "usuario encontrado";
            } else {
                busqueda_usuario = "usuario no encontrado";
            }
            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_usuario;
    }
}
