/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2.pkg1m9procesosehilos;

import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author ALUMNEDAM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    final ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);
     final TareaProgramada tareaProgramada = new TareaProgramada("1");
       executor.scheduleAtFixedRate(tareaProgramada, 0, 0, TimeUnit.DAYS);
       
       
  
        
        
    }
    
    
    
    
}
