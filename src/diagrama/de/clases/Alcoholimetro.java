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
    
   private Alarma alarma1;
   public void setAlarma1(Alarma alarma1p)
  {
  this.alarma1=alarma1p;
  }
  public Alarma getAlarma1()
  {
  return alarma1;
  }  
    
   private int dniAlcoholimetro;
   public void setDniAlcoholimetro(int dniAlcoholimetrop)
  {
  this.dniAlcoholimetro=dniAlcoholimetrop;
  }
  public int getDniAlcoholimetro()
  {
  return dniAlcoholimetro;
  }
  
    public void Detectar_Alcohol(){};
}
