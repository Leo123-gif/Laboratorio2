/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author Josue
 */
public class Usuarios {
    String usuario;
    String contraseña;
    String rol;
    String estado;

    public Usuarios(String usuario, String contraseña, String rol, String estado) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return usuario + " (" + rol + ") - " + estado;
    }
    
    
}
