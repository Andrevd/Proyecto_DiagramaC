/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama.de.clases;

/**
 *
 * @author SENA
 */
public class Usuario extends Perfil {
    
    private int dniUsuario;
    private String perfil;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String movil;
    private String correo;
    private String nom_usuario;
    private String contraseña;

    public void setPerfil(String perfilp) {
        this.perfil = perfilp;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setDniUsuario(int dniUsuariop) {
        this.dniUsuario = dniUsuariop;
    }

    public int getDniUsuario() {
        return dniUsuario;
    }

    public void setCedula(String cedulap) {
        this.cedula = cedulap;
    }

    public String getCedula() {
        return cedula;
    }

    public void setNombres(String nombresp) {
        this.nombres = nombresp;
    }

    public String getNombres() {
        return nombres;
    }

    public void setApellidos(String apellidosp) {
        this.apellidos = apellidosp;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setTelefono(String telefonop) {
        this.telefono = telefonop;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setMovil(String movilp) {
        this.movil = movilp;
    }

    public String getMovil() {
        return movil;
    }

    public void setCorreo(String correop) {
        this.correo = correop;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNom_usuario(String nom_usuariop) {
        this.nom_usuario = nom_usuariop;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setContraseña(String contraseñap) {
        this.contraseña = contraseñap;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void Registrar_usuario() {
    };

    
public void modificar_usuario() {
    };

    
public void Deshabilitar_usuario() {
    };

    
  
}
