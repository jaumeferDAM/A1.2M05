/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2.pkg1m9procesosehilos;

import java.util.Calendar;
import java.util.Date;
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

        System.out.println(Thread.currentThread().getName() + " HoraInicial. Time = " + new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName() + " HoraFinal. Time = " + new Date());

    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
