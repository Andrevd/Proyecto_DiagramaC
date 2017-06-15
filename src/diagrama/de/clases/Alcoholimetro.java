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
public class Alcoholimetro {
    
   private Alarma Alarma1;
   public void setAlarma1(Alarma Alarma1p)
  {
  this.Alarma1=Alarma1p;
  }
  public Alarma getAlarma1()
  {
  return Alarma1;
  }
    
    
    
   private int dniAlcoholimetro;
   public void setdniAlcoholimetro(int dniAlcoholimetrop)
  {
  this.dniAlcoholimetro=dniAlcoholimetrop;
  }
  public int getdniAlcoholimetro()
  {
  return dniAlcoholimetro;
  }
  
    public void Detectar_Alcohol(){};
}
