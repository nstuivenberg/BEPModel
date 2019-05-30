package nl.hu.bep.group4.bifi.model;

public class Persoon {
    private String voornaam;
    private String achternaam;
    private String tussenvoegsel;
    private String telefoon;
    private String fax;
    private Geslacht geslacht;
    public enum Geslacht {
        MAN,
        VROUW
    }
    
	public Persoon(String voornaam, String achternaam, String tussenvoegsel, String telefoon, String fax,
			Geslacht geslacht) {
		super();
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.tussenvoegsel = tussenvoegsel;
		this.telefoon = telefoon;
		this.fax = fax;
		this.geslacht = geslacht;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public String getTussenvoegsel() {
		return tussenvoegsel;
	}
	public void setTussenvoegsel(String tussenvoegsel) {
		this.tussenvoegsel = tussenvoegsel;
	}
	public String getTelefoon() {
		return telefoon;
	}
	public void setTelefoon(String telefoon) {
		this.telefoon = telefoon;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public Geslacht getGeslacht() {
		return geslacht;
	}
	public void setGeslacht(Geslacht geslacht) {
		this.geslacht = geslacht;
	}
}
