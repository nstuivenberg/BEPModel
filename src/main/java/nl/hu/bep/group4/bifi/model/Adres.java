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
    private String bic;
    
	public Adres(String straat, String huisnummer, String postcode, String plaats, String bic) {
		super();
		this.straat = straat;
		this.huisnummer = huisnummer;
		this.postcode = postcode;
		this.plaats = plaats;
		this.bic = bic;
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
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	@Override
	public String toString() {
		return "Adres [straat=" + straat + ", huisnummer=" + huisnummer + ", postcode=" + postcode + ", plaats="
				+ plaats + ", BiC=" + bic + "]";
	}
}
