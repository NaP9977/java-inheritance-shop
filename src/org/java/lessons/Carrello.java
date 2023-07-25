package org.java.lessons;

public class Carrello {
    public static void main(String[] args) {
Prodotto prodotto = new Prodotto("telefono", "nokia", 500, 0.22);
System.out.println(prodotto);
Televisori televisori = new Televisori("televisore", "LG", 300, 0.22, 40, true );
System.out.println(televisori);
Smartphone smartphone = new Smartphone("Galaxy S20", "Samsung", 500, 0.22, 256);
    System.out.println(smartphone);
    Cuffie cuffie = new Cuffie("cuffie", "xiaomi", 55.50, 0.20, "wireless");
System.out.print(cuffie);
    }
}
