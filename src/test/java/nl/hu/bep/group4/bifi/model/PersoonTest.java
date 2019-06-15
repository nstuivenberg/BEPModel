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


    }

    private void createPersoon() {
        persoon = new Persoon(
                1,
                "Nick",
                "Larie",
                "of",
                "0612345678",
                "0612345678",
                Persoon.Geslacht.VROUW
        );
    }
}
