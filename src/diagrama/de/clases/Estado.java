/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama.de.clases;

import java.util.Date;

/**
 *
 * @author SENA
 */
public class Estado {
    
    private final Alarma alarma1 = new Alarma();

    private int dniEstado;

    public void setDniEstado(int dniEstadop) {
        this.dniEstado = dniEstadop;
    }

    public int getDniEstado() {
        return dniEstado;
    }
    private Date fecha;

    public void setFecha(Date fechap) {
        this.fecha = fechap;
    }

    public Date getFecha() {
        return fecha;
    }

    private int hora;

    public void setHora(int horap) {
        this.hora = horap;
    }

    public int getHora() {
        return hora;
    }
    private String detalle;

    public void setDetalle(String detallep) {
        this.detalle = detallep;
    }

    public String getDetalle() {
        return detalle;
    }

    public void Mostrar_estado() {
    }
;

   }
   
    

