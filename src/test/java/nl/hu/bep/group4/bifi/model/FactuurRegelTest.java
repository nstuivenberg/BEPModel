package nl.hu.bep.group4.bifi.model;

import static nl.hu.bep.group4.bifi.model.FactuurRegel.Unit.KILOGRAM;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class FactuurRegelTest {

    FactuurRegel factuurRegel;

    @Test
    public void testEmptyFactuurRegel() {
        FactuurRegel emptyFactuurRegel = new FactuurRegel();
        assertEquals(0, emptyFactuurRegel.getProductID());
        assertEquals(0, emptyFactuurRegel.getAantal());
        assertEquals(0, emptyFactuurRegel.getTotaalprijsExBTW());
        assertNull(emptyFactuurRegel.getProductNaam());
        assertNull(emptyFactuurRegel.getBtwCode());
        assertNull(emptyFactuurRegel.getUnit());
    }
    @Test
    public void testFactuurRegel() {
        createFactuur();

        assertEquals(1, factuurRegel.getProductID());
        assertEquals("Peter", factuurRegel.getProductNaam());
        assertEquals(2.2, factuurRegel.getAantal());
        assertEquals(2.22, factuurRegel.getTotaalprijsExBTW());
        assertEquals(FactuurRegel.BTWcode.LAAG, factuurRegel.getBtwCode());
        assertEquals(KILOGRAM, factuurRegel.getUnit());
    }
    @Test
    public void testSetProductId() {
        createFactuur();
        factuurRegel.setProductID(2);
        assertEquals(2, factuurRegel.getProductID());
    }
    @Test
    public void testSetProductNaam() {
        createFactuur();
        factuurRegel.setProductNaam("Alex");
        assertEquals("Alex", factuurRegel.getProductNaam());
    }

    @Test
    public void testSetAantal() {
        createFactuur();
        factuurRegel.setAantal(6.6);
        assertEquals(6.6, factuurRegel.getAantal());
    }

    @Test
    public void testSetTotaalPrijs() {
        createFactuur();
        factuurRegel.setTotaalprijsExBTW(6.6);
        assertEquals(6.6, factuurRegel.getTotaalprijsExBTW());
    }
    @Test
    public void testSetBTWCodeHoog() {
        createFactuur();
        factuurRegel.setBtwCode(FactuurRegel.BTWcode.HOOG);
        assertEquals(FactuurRegel.BTWcode.HOOG, factuurRegel.getBtwCode());
    }
    @Test
    public void testSetBTWCodeGeen() {
        createFactuur();
        factuurRegel.setBtwCode(FactuurRegel.BTWcode.GEEN);
        assertEquals(FactuurRegel.BTWcode.GEEN, factuurRegel.getBtwCode());
    }
    @Test
    public void testSetUnit() {
        createFactuur();
        factuurRegel.setUnit(KILOGRAM);
        assertEquals(KILOGRAM, factuurRegel.getUnit());
    }

    private void createFactuur() {
        factuurRegel = new FactuurRegel(1,
                "Peter",
                2.2,
                2.22,
                FactuurRegel.BTWcode.LAAG,
                KILOGRAM);
    }

}
