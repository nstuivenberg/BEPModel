package nl.hu.bep.group4.bifi.model;

import java.util.List;

public class Klant {
	private int id;
    private String bedrijfsnaam;
    private String rechtsvorm;
    private String vat;
    private String bankrekeningNummer;
    private String giroNummer;
    private String bic;
    private List<Persoon> contactPersonen;
    private List<Adres> adres;
    private Adres factuurAdres;
    
    public Klant(int id) {
    	super();
    	this.id = id;
    }
	public Klant(int id, String bedrijfsnaam, String rechtsvorm, String vat, String bankrekeningNummer,
			String giroNummer, String bic, List<Persoon> contactPersonen, List<Adres> adres, Adres factuurAdres) {
		super();
		this.id = id;
		this.bedrijfsnaam = bedrijfsnaam;
		this.rechtsvorm = rechtsvorm;
		this.vat = vat;
		this.bankrekeningNummer = bankrekeningNummer;
		this.giroNummer = giroNummer;
		this.bic = bic;
		this.contactPersonen = contactPersonen;
		this.adres = adres;
		this.factuurAdres = factuurAdres;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return this.vat;
	}
	public void setVAT(String vat) {
		this.vat = vat;
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
		return bic;
	}
	public void setBiC(String bic) {
		this.bic = bic;
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
	@Override
	public String toString() {
		return "Klant [id=" + id + ", bedrijfsnaam=" + bedrijfsnaam + ", rechtsvorm=" + rechtsvorm + ", vat=" + vat
				+ ", bankrekeningNummer=" + bankrekeningNummer + ", giroNummer=" + giroNummer + ", bic=" + bic
				+ ", contactPersonen=" + contactPersonen + ", adres=" + adres + ", factuurAdres=" + factuurAdres + "]";
	}
}
