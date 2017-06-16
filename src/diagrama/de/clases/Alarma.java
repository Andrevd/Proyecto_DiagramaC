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
public class Alarma {
    
    private Actuador actuador1;

    public void setActuador1(Actuador actuador1p) {
        this.actuador1 = actuador1p;
    }

    public Actuador getActuador1() {
        return actuador1;
    }

    private Aviso aviso1;

    public void setAviso1(Aviso aviso1p) {
        this.aviso1 = aviso1p;
    }

    public Aviso getAviso1() {
        return aviso1;
    }

    private int dniAlarma;

    public void setDniAlarma(int dniAlarmap) {
        this.dniAlarma = dniAlarmap;
    }

    public int getDniAlarma() {
        return dniAlarma;
    }

    public void Activar_Aviso() {
    };

    
    public void Activar_Bloqueo() {
    };

    
     public void Activar_Desbloqueo() {
    };

}
