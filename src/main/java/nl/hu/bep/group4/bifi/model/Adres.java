package nl.hu.bep.group4.bifi.model;

public class Adres {
    private String straat;
    public enum Type {
        FACTUUR,
        POST,
        AFLEVERADRES
    }
    private String huisnummer;
    private String postcode;
    private String plaats;
    private String BiC;
    
	public Adres(String straat, String huisnummer, String postcode, String plaats, String biC) {
		super();
		this.straat = straat;
		this.huisnummer = huisnummer;
		this.postcode = postcode;
		this.plaats = plaats;
		BiC = biC;
	}
	public String getStraat() {
		return straat;
	}
	public void setStraat(String straat) {
		this.straat = straat;
	}
	public String getHuisnummer() {
		return huisnummer;
	}
	public void setHuisnummer(String huisnummer) {
		this.huisnummer = huisnummer;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getPlaats() {
		return plaats;
	}
	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}
	public String getBiC() {
		return BiC;
	}
	public void setBiC(String biC) {
		BiC = biC;
	}
	@Override
	public String toString() {
		return "Adres [straat=" + straat + ", huisnummer=" + huisnummer + ", postcode=" + postcode + ", plaats="
				+ plaats + ", BiC=" + BiC + "]";
	}
}
