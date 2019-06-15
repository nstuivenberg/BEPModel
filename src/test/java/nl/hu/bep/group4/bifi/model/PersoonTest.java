package nl.hu.bep.group4.bifi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class PersoonTest {

    private Persoon persoon;

    @Test
    public void testEmptyPersoon() {
        persoon = new Persoon(2);
        assertEquals(2, persoon.getId());
        assertNull(persoon.getVoornaam());
        assertNull(persoon.getAchternaam());
        assertNull(persoon.getTussenvoegsel());
        assertNull(persoon.getTelefoon());
        assertNull(persoon.getFax());
        assertNull(persoon.getGeslacht());
    }

    @Test
    public void testPersoon() {
        createPersoon();
        assertEquals(1, persoon.getId());
        assertEquals("Nick", persoon.getVoornaam());
        assertEquals("Larie", persoon.getAchternaam());
        assertEquals("of", persoon.getTussenvoegsel());
        assertEquals("0612345678", persoon.getTelefoon());
        assertEquals("0612345678", persoon.getFax());
        assertEquals(Persoon.Geslacht.VROUW, persoon.getGeslacht());
    }

    @Test
    public void testSetId() {
        createPersoon();
        persoon.setId(666);
        assertEquals(666, persoon.getId());
    }
    @Test
    public void testSetVoornaam() {
        createPersoon();
        persoon.setVoornaam("Sjard");
        assertEquals("Sjard", persoon.getVoornaam());
    }

    @Test
    public void testSetAchternaam() {
        createPersoon();
        persoon.setAchternaam("achternaam");
        assertEquals("achternaam", persoon.getAchternaam());
    }

    @Test
    public void testSetTussenvoegsel() {
        createPersoon();
        persoon.setTussenvoegsel("tussenvoegsel");
        assertEquals("tussenvoegsel", persoon.getTussenvoegsel());
    }

    @Test
    public void testSetTelefoon() {
        createPersoon();
        persoon.setTelefoon("0612345678");
        assertEquals("0612345678", persoon.getTelefoon());
    }

    @Test
    public void testSetFax() {
        createPersoon();
        persoon.setFax("1234567890");
        assertEquals("1234567890", persoon.getFax());
    }

    @Test
    public void testSetGeslachtMan() {
        createPersoon();
        persoon.setGeslacht(Persoon.Geslacht.MAN);
        assertEquals(Persoon.Geslacht.MAN, persoon.getGeslacht());
    }

    @Test
    public void testToString() {
        createPersoon();
        assertEquals("Persoon [id=1, voornaam=Nick, tussenvoegsel=of, achternaam=Larie, telefoon=0612345678, fax=0612345678, geslacht=VROUW]",
                persoon.toString());
    }

    private void createPersoon() {
        persoon = new Persoon(
                1,
                "Nick",
                "of",
                "Larie",
                "0612345678",
                "0612345678",
                Persoon.Geslacht.VROUW
        );
    }
}
