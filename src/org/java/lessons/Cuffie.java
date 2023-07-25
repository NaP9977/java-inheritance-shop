package org.java.lessons;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{
    private String wireless;
    private String cablate;

    public Cuffie(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, String wireless, String cablate){
        super(codice, nome, marca, prezzo, iva);
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
