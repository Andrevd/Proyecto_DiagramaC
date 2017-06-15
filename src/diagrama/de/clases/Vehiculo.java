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
public class Vehiculo {
        private String Placa;
    public void setPlaca(String Placap)
   {
   this.Placa=Placap;
   }
   public String getPlaca()
   {
   return Placa;
   }
   
    private String Ruta;
   public void setRuta(String Rutap)
   {
   this.Ruta=Rutap;
   }
   public String getRuta()
   {
   return Ruta;
   }
   public void Transportar(){};
}
