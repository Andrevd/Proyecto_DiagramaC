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
public class Perfil {
   private int dniPerfil;
   private String descripcion;
   private Administrador administrador1;
   private Conductor conductor1;
            
    public void setAdministrador1(Administrador administrador1P){
        this.administrador1= administrador1P;
    }
    public Administrador getTAdministrador1(){
    return this.administrador1;
    }
    
      public void setConductor1(Conductor conductor1P){
        this.conductor1= conductor1P;
    }
    public Conductor getTConductor1(){
    return this.conductor1;
    }
   
   public void setDniPerfil(int dniPerfilp)
  {
  this.dniPerfil=dniPerfilp;
  }
  public int getDniPerfil()
  {
  return dniPerfil;
  }
  
     public void setDescripcion(String descripcionp)
  {
  this.descripcion=descripcionp;
  }
  public String getDescripcion()
  {
  return descripcion;
  }
  
      
}
