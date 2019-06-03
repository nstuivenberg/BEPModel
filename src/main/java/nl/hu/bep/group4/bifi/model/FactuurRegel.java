package nl.hu.bep.group4.bifi.model;

public class FactuurRegel {
    private int productID;
    private String productNaam;
    private double aantal;
    private double totaalprijsExBTW;
    private BTWcode btwCode;
    private Unit unit;
    
    public enum BTWcode {
        HOOG,
        LAAG,
        GEEN
    }
    public enum Unit {
        KILOGRAM
    }
    
    public FactuurRegel() {}

	public FactuurRegel(int productID, String productNaam, double aantal, double totaalprijsExBTW, BTWcode btwCode,
			Unit unit) {
		this.productID = productID;
		this.productNaam = productNaam;
		this.aantal = aantal;
		this.totaalprijsExBTW = totaalprijsExBTW;
		this.btwCode = btwCode;
		this.unit = unit;
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

	public BTWcode getBtwCode() {
		return btwCode;
	}

	public void setBtwCode(BTWcode btwCode) {
		this.btwCode = btwCode;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "FactuurRegel [productID=" + productID + ", productNaam=" + productNaam + ", aantal=" + aantal
				+ ", totaalprijsExBTW=" + totaalprijsExBTW + ", btwCode=" + btwCode + ", unit=" + unit + "]";
	}
}