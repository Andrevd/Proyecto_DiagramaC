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
public class Aviso {
    
       private int dniAviso;

    public void setDniAviso(int dniAvisop) {
        this.dniAviso = dniAvisop;
    }

    public int getDniAviso() {
        return dniAviso;
    }

    private String aviso;

    public void setAviso(String avisop) {
        this.aviso = avisop;
    }

    public String getAviso() {
        return aviso;
    }

    public void Emitir_Mensaje() {
    };

}


