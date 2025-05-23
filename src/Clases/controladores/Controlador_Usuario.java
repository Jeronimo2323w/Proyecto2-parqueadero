/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.controladores;

import Clases.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Jeronimo
 */
public class Controlador_Usuario {

    private ArrayList<Usuario> usuario;

    public Controlador_Usuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }

    public void AgregarUsuario(String correo, String nombre, String Telefono, int cedula) {
        Usuario NuevoUsuario = new Usuario(nombre, correo, cedula, Telefono);
        usuario.add(NuevoUsuario);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuario;
    }

    public Usuario BuscarUsuarioPorcedula(int cedula) {
        for (Usuario usuarios : usuario) {
            if (usuarios.getCedula() == cedula) {
                return usuarios;
            }
        }
        return null;
    }

    public boolean EliminarUsuario(int cedula) {
        Usuario UsuarioEncontrado = BuscarUsuarioPorcedula(cedula);
        if (UsuarioEncontrado != null) {
            usuario.remove(UsuarioEncontrado);
            return true;
        }
        return false;
    }

    public boolean ActualizarUsuario(int cedula, String nuevoNombre, String nuevoCorreo, String nuevoTelefono) {
        Usuario UsuarioEncontrado = BuscarUsuarioPorcedula(cedula);
        if (UsuarioEncontrado != null) {
            UsuarioEncontrado.setNombre(nuevoNombre);
            UsuarioEncontrado.setCorreo(nuevoCorreo);
            UsuarioEncontrado.setTelefono(nuevoTelefono);
            return true;
        }
        return false;
    }
}

