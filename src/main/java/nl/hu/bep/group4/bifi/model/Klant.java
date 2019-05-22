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
    
    public Klant(String bedrijfsnaam, String rechtsvorm, String vAT, String bankrekeningNummer, String giroNummer,
			String biC, List<Persoon> contactPersonen, List<Adres> adres, Adres factuurAdres) {
		super();
		this.bedrijfsnaam = bedrijfsnaam;
		this.rechtsvorm = rechtsvorm;
		VAT = vAT;
		this.bankrekeningNummer = bankrekeningNummer;
		this.giroNummer = giroNummer;
		BiC = biC;
		this.contactPersonen = contactPersonen;
		this.adres = adres;
		this.factuurAdres = factuurAdres;
	}
	public String getBedrijfsnaam() {
		return bedrijfsnaam;
	}
	public void setBedrijfsnaam(String bedrijfsnaam) {
		this.bedrijfsnaam = bedrijfsnaam;
	}
	public String getRechtsvorm() {
		return rechtsvorm;
	}
	public void setRechtsvorm(String rechtsvorm) {
		this.rechtsvorm = rechtsvorm;
	}
	public String getVAT() {
		return VAT;
	}
	public void setVAT(String vAT) {
		VAT = vAT;
	}
	public String getBankrekeningNummer() {
		return bankrekeningNummer;
	}
	public void setBankrekeningNummer(String bankrekeningNummer) {
		this.bankrekeningNummer = bankrekeningNummer;
	}
	public String getGiroNummer() {
		return giroNummer;
	}
	public void setGiroNummer(String giroNummer) {
		this.giroNummer = giroNummer;
	}
	public String getBiC() {
		return BiC;
	}
	public void setBiC(String biC) {
		BiC = biC;
	}
	public List<Persoon> getContactPersonen() {
		return contactPersonen;
	}
	public void setContactPersonen(List<Persoon> contactPersonen) {
		this.contactPersonen = contactPersonen;
	}
	public List<Adres> getAdres() {
		return adres;
	}
	public void setAdres(List<Adres> adres) {
		this.adres = adres;
	}
	public Adres getFactuurAdres() {
		return factuurAdres;
	}
	public void setFactuurAdres(Adres factuurAdres) {
		this.factuurAdres = factuurAdres;
	}

}
