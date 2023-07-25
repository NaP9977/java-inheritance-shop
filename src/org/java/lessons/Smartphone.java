///Lo shop gestisce diversi tipi di prodotto:
////Smartphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
package org.java.lessons;

import java.util.Random;

public class Smartphone extends Prodotto{
    private long codiceIMEI;
    private int memoria;

   public Smartphone( String nome, String marca, double prezzo, double iva, long codiceIMEI, int memoria){
       super(nome,marca,prezzo,iva);
       this.codiceIMEI = generaIMEI();
        this.memoria = memoria;
    }


    public long getCodiceIMEI() {
        return codiceIMEI;
    }

    public int getMemoria() {
        return memoria;
    }
private long generaIMEI(){
        Random imei = new Random();
       return imei.nextLong(1000000000000000L);
    }




}
