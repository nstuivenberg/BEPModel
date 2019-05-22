package nl.hu.bep.group4.bifi.model;

public class FactuurRegel {
    private int productID;
    private String productNaam;
    private double aantal;
    private double totaalprijsExBTW;
    public enum BTWcode {
        HOOG,
        LAAG,
        GEEN
    }
    public enum Unit {
        KILOGRAM
    }
    
	public FactuurRegel(int productID, String productNaam, double aantal, double totaalprijsExBTW) {
		super();
		this.productID = productID;
		this.productNaam = productNaam;
		this.aantal = aantal;
		this.totaalprijsExBTW = totaalprijsExBTW;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductNaam() {
		return productNaam;
	}
	public void setProductNaam(String productNaam) {
		this.productNaam = productNaam;
	}
	public double getAantal() {
		return aantal;
	}
	public void setAantal(double aantal) {
		this.aantal = aantal;
	}
	public double getTotaalprijsExBTW() {
		return totaalprijsExBTW;
	}
	public void setTotaalprijsExBTW(double totaalprijsExBTW) {
		this.totaalprijsExBTW = totaalprijsExBTW;
	}
    
}
