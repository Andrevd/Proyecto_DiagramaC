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
  public void setdniActuador(int dniActuadorp)
  {
  this.dniActuador=dniActuadorp;
  }
  public int getdniActuador()
  {
  return dniActuador;
  }
  
  private byte bloqueo;
  public void setbloqueo(byte bloqueop)
  {
  this.bloqueo=bloqueop;
  }
  public byte getbloqueo()
  {
  return bloqueo;
  }
  
  private byte desbloqueo;
  public void setdesbloqueo(byte desbloqueop)
  {
  this.desbloqueo=desbloqueop;
  }
  public byte getdesbloqueo()
  {
  return desbloqueo;
  }
  
    public void Bloquear_Circuito_Electrico(){};
    public void Desbloquear_Circuito_Electrico(){};
}


