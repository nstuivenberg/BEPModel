package nl.hu.bep.group4.bifi.model;

import java.util.List;

public class Klant {
    private String bedrijfsnaam;
    private String rechtsvorm;
    private String VAT;
    private String bankrekeningNummer;
    private String giroNummer;
    private String BiC;
    private List<Persoon> contactPersonen;
    private List<Adres> adres;
    private Adres factuurAdres;

}
