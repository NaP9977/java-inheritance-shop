package org.java.lessons;

public class Cuffie extends Prodotto{
    private String tipologia;


    public Cuffie( String nome, String marca, double prezzo, double iva, String tipologia){
        super( nome, marca, prezzo, iva);
       this.tipologia = tipologia;
    }

    public String getTipologia() {
        return tipologia;
    }
    public String toString() {
        return "Smartphone:" + "Codice: " + getCodice() +
                ", Nome: " + getNome() +
                ", Marca: " + getMarca() +
                ", Prezzo: " + prezzoIva() +
                ", IVA: " + getIva() + ", tipologia:  " + tipologia;
    }
}
