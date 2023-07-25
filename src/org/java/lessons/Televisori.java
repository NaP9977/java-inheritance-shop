package org.java.lessons;

public class Televisori extends Prodotto {
    private int dimensioni;
    private boolean IsItSmart;

    public Televisori(String nome, String marca, double prezzo, double iva, int dimensioni, boolean IsItSmart) {
        super(nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.IsItSmart = IsItSmart;
    }

    public boolean isItSmart() {
        return IsItSmart;
    }

    public int getDimensioni() {
        return dimensioni;
    }
public String IsItSmart(boolean isItSmart) {
    if (isItSmart) {
        return "Sì";
    } else {
        return "no";
    }
}


        public String toString() {
        return "Televisore:" + "Codice: " + getCodice() +
                ", Nome: " + getNome() +
                ", Marca: " + getMarca() +
                ", Prezzo: " + prezzoIva() +
                ", IVA: " + getIva() + ", Dimensioni: " + getDimensioni() + ", SmartTv:  " + IsItSmart;
    }

}