/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Jeronimo
 */
public class Usuario {
    private String nombre;
    private String correo;
    private int cedula;
    private String Telefono;

    public Usuario(String nombre, String correo, int cedula, String Telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    @Override
    public String toString() {
    return "----- Usuario -----\n" +
           "Nombre: " + nombre + "\n" +
           "Correo: " + correo + "\n" +
           "Cédula: " + cedula + "\n" +
           "Teléfono: " + Telefono + "\n";
}   }
