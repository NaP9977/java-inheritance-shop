package org.java.lessons;

import java.math.BigDecimal;

public class Televisori extends Prodotto {
    private int dimensioni;
    private boolean IsItSmart;

    public Televisori(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, int dimensioni, boolean IsItSmart){
        super(codice, nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.IsItSmart = IsItSmart;
        }

    public boolean isItSmart() {
        return IsItSmart;
    }

    public int getDimensioni() {
        return dimensioni;
    }
}
