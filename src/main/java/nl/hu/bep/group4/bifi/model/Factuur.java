package nl.hu.bep.group4.bifi.model;

import java.util.Date;
import java.util.List;

public class Factuur {
	private Klant klant;
	private Date datumtijd;
    private int factuurNummer;
    private List<FactuurRegel> factuurregels;
    private String opmerking;
    private Persoon contactPersoon;
    
    
	public Factuur() {}


	public Factuur(Klant klant, Date datumtijd, int factuurNummer, List<FactuurRegel> factuurregels, String opmerking,
			Persoon contactPersoon) {
		this.klant = klant;
		this.datumtijd = datumtijd;
		this.factuurNummer = factuurNummer;
		this.factuurregels = factuurregels;
		this.opmerking = opmerking;
		this.contactPersoon = contactPersoon;
	}


	public Klant getKlantId() {
		return klant;
	}


	public void setKlantId(Klant klant) {
		this.klant = klant;
	}


	public Date getDatumtijd() {
		return datumtijd;
	}


	public void setDatumtijd(Date datumtijd) {
		this.datumtijd = datumtijd;
	}


	public int getFactuurNummer() {
		return factuurNummer;
	}


	public void setFactuurNummer(int factuurNummer) {
		this.factuurNummer = factuurNummer;
	}


	public List<FactuurRegel> getFactuurregels() {
		return factuurregels;
	}


	public void setFactuurregels(List<FactuurRegel> factuurregels) {
		this.factuurregels = factuurregels;
	}


	public String getOpmerking() {
		return opmerking;
	}


	public void setOpmerking(String opmerking) {
		this.opmerking = opmerking;
	}


	public Persoon getContactPersoon() {
		return contactPersoon;
	}


	public void setContactPersoon(Persoon contactPersoon) {
		this.contactPersoon = contactPersoon;
	}
}
