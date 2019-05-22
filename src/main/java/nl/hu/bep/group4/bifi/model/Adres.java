package nl.hu.bep.group4.bifi.model;

public class Adres {
    private String straat;
    private enum type {
        factuur,
        post,
        afleveradres
    }
    private String huisnummer;
    private String postcode;
    private String plaats;
    private String BiC;
}
