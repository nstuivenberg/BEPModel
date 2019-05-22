package nl.hu.bep.group4.bifi.model;

public class FactuurRegel {
    private int productID;
    private String productNaam;
    private double aantal;
    private double totaalprijsExBTW;
    private enum BTWcode {
        Hoog,
        Laag,
        Geen
    }
    private enum Unit {
        Kilogram
    }
}
