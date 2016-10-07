/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2.pkg1m9procesosehilos;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author ALUMNEDAM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        final ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Hora actual = " + new Date());
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            TareaProgramada tareaProgramada = new TareaProgramada("Tarea");
            executor.scheduleAtFixedRate(tareaProgramada, 2, 3, TimeUnit.SECONDS);
        }
        Thread.sleep(30000);
        executor.shutdown();
        while (!executor.isTerminated()) {
            //Espera
        }
        System.out.println("Todos los hilos terminados");
    }

    public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize) {
        return new ScheduledThreadPoolExecutor(corePoolSize);
    }

}
