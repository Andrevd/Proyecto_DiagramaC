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
    
   private Actuador Actuador1;
   public void setActuador1(Actuador Actuador1p)
  {
  this.Actuador1=Actuador1p;
  }
  public Actuador getActuador1()
  {
  return Actuador1;
  }
  
  private Aviso Aviso1;
   public void setAviso1(Aviso Aviso1p)
  {
  this.Aviso1=Aviso1p;
  }
  public Aviso getAviso1()
  {
  return Aviso1;
  }
    
    
    
    
   private int dniAlarma;
   public void setdniAlarma(int dniAlarmap)
  {
  this.dniAlarma=dniAlarmap;
  }
  public int getdniAlarma()
  {
  return dniAlarma;
  }
  
    public void Activar_Aviso(){};
    public void Activar_Bloqueo(){};
     public void Activar_Desbloqueo(){};
}
