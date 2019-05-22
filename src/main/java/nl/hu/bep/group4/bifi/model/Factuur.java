package nl.hu.bep.group4.bifi.model;

import java.util.Date;

public class Factuur {
    private Date datumtijd;
    private int nummer;
    private Klant klant;
    private String opmerking;
    
	public Factuur(Date datumtijd, int nummer, Klant klant, String opmerking) {
		super();
		this.datumtijd = datumtijd;
		this.nummer = nummer;
		this.klant = klant;
		this.opmerking = opmerking;
	}
	public Date getDatumtijd() {
		return datumtijd;
	}
	public void setDatumtijd(Date datumtijd) {
		this.datumtijd = datumtijd;
	}
	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	public Klant getKlant() {
		return klant;
	}
	public void setKlant(Klant klant) {
		this.klant = klant;
	}
	public String getOpmerking() {
		return opmerking;
	}
	public void setOpmerking(String opmerking) {
		this.opmerking = opmerking;
	}
}
