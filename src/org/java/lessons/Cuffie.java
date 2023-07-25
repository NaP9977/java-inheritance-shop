package org.java.lessons;

public class Cuffie extends Prodotto{
    private String wireless;
    private String cablate;

    public Cuffie( String nome, String marca, double prezzo, double iva, String wireless, String cablate){
        super( nome, marca, prezzo, iva);
        this.cablate = cablate;
        this.wireless = wireless;
    }

    public String getCablate() {
        return cablate;
    }

    public String getWireless() {
        return wireless;
    }





}
