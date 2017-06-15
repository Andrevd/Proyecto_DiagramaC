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
    
    private final Alarma Alarma1 = new Alarma ();
    
   private int dniEstado;
   public void setdniEstado(int dniEstadop)
   {
   this.dniEstado=dniEstadop;
   }
   public int getdniEstado()
   {
   return dniEstado;
   }
  private Date fecha;
   public void setfecha(Date fechap)
   {
   this.fecha=fechap;
   }
   public Date getfecha()
   {
   return fecha;
   }
   
    private int hora;
   public void sethora(int horap)
   {
   this.hora=horap;
   }
   public int gethora()
   {
   return hora;
   }
       private String detalle;
   public void setdetalle(String detallep)
   {
   this.detalle=detallep;
   }
   public String getdetalle()
   {
   return detalle;
   }
   public void Mostrar(){};

   }
   
    

