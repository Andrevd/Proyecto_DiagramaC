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
public class Asignacion {
    
    private String conductor;
    private String clave;
    private String placa;
    private Vehiculo vehicu1;
    private Conductor condu1;
    private Estado estado1;

    public void setVehicu1(Vehiculo vehicu1P) {
        this.vehicu1 = vehicu1P;
    }

    public Vehiculo getTVehicu1() {
        return this.vehicu1;
    }

    public void setCondu1(Conductor condu1P) {
        this.condu1 = condu1P;
    }

    public Conductor getTCondu1() {
        return this.condu1;
    }

    public void setEstado1(Estado estado1P) {
        this.estado1 = estado1P;
    }

    public Estado getTEstado1() {
        return this.estado1;
    }

    public void setConductor(String conductorp) {
        this.conductor = conductorp;
    }

    public String getConductor() {
        return conductor;
    }

    public void setClave(String clavep) {
        this.clave = clavep;
    }

    public String getClave() {
        return clave;
    }

    public void setPlaca(String placap) {
        this.placa = placap;
    }

    public String getPlaca() {
        return placa;
    }

    public void Asignar_clave() {
    };

}
