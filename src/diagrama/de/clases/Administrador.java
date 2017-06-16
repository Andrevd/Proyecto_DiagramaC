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
public class Administrador {
    
    private int dniAdministrador;
    private String nomUsuario;
    private String contraseña;
    private Asignacion asignacion1;
    private Validacion validacion1;
    private Conductor conduc1;
    private Vehiculo vehiculo1;

    public void setAsignacion1(Asignacion asignacion1P) {
        this.asignacion1 = asignacion1P;
    }

    public Asignacion getTAsignacion1() {
        return this.asignacion1;
    }

    public void setValidacion1(Validacion validacion1P) {
        this.validacion1 = validacion1P;
    }

    public Validacion getTValidacionr1() {
        return this.validacion1;
    }

    public void setConductor1(Conductor conduc1P) {
        this.conduc1 = conduc1P;
    }

    public Conductor getTConduc1() {
        return this.conduc1;
    }

    public void setVehiculo1(Vehiculo vehiculo1P) {
        this.vehiculo1 = vehiculo1P;
    }

    public Vehiculo getTVehiculo1() {
        return this.vehiculo1;
    }

    public void setDniAdministrador(int dniAdministradorp) {
        this.dniAdministrador = dniAdministradorp;
    }

    public int getDniAdministrador() {
        return dniAdministrador;
    }

    public void setNomUsuario(String nomUsuariop) {
        this.nomUsuario = nomUsuariop;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setContraseña(String contraseñap) {
        this.contraseña = contraseñap;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void Asignar_clave() {
    };

    
   public void Registrar_conductores() {
    };

    
   public void Registrar_vehiculo() {
    };

    
   public void Registrarse() {
    };

   
}
