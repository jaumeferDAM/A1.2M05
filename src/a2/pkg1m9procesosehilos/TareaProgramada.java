/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2.pkg1m9procesosehilos;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author ALUMNEDAM
 */
public class TareaProgramada implements Runnable {
    
     private String nombre;
    Calendar calendario = new GregorianCalendar(); 
 public TareaProgramada(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void run() {
      
        System.out.println("hora" + calendario.getTime());
        
    }
    
     
}
