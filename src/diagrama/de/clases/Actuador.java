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
public class Actuador {
 
    private int dniActuador;

    public void setDniActuador(int dniActuadorp) {
        this.dniActuador = dniActuadorp;
    }

    public int getDniActuador() {
        return dniActuador;
    }

    private byte bloqueo;

    public void setBloqueo(byte bloqueop) {
        this.bloqueo = bloqueop;
    }

    public byte getBloqueo() {
        return bloqueo;
    }

    private byte desbloqueo;

    public void setDesbloqueo(byte desbloqueop) {
        this.desbloqueo = desbloqueop;
    }

    public byte getDesbloqueo() {
        return desbloqueo;
    }

    public void Bloquear_Circuito_Electrico() {
    };

    
    public void Desbloquear_Circuito_Electrico() {
    };

}


