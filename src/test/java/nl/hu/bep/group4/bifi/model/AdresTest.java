package nl.hu.bep.group4.bifi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdresTest {

    private Adres testAdres;

    private void setup() {
        testAdres = new Adres("weg", "1", "1234AB", "Ede", "22");
    }

    @Test
    public void testStraat() {
        setup();
        testAdres.setStraat("straat");
        assertEquals("straat", testAdres.getStraat());
    }

    @Test
    public void testHuisnummer() {
        setup();
        testAdres.setHuisnummer("22");
        assertEquals("22", testAdres.getHuisnummer());
    }

    @Test
    public void testPostcode() {
        setup();
        testAdres.setPostcode("3734EC");
        assertEquals("3734EC", testAdres.getPostcode());
    }

    @Test
    public void testPlaats() {
        setup();
        testAdres.setPlaats("Wageningen");
        assertEquals("Wageningen", testAdres.getPlaats());
    }

    @Test
    public void testBIC() {
        setup();
        testAdres.setBic("12");
        assertEquals("12", testAdres.getBic());
    }

    @Test
    public void testToString() {
        setup();
        String expected = "Adres [straat=weg, huisnummer=1, postcode=1234AB, plaats=Ede, BiC=22]";
        assertEquals(expected, testAdres.toString());
    }
}
