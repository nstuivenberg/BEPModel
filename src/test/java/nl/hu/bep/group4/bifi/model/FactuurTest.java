package nl.hu.bep.group4.bifi.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FactuurTest {

    private Factuur factuur = new Factuur();

    @Test
    public void testKlantInFactuur() {
        Klant klant = new Klant(1);
        factuur.setKlant(klant);
        assertEquals(klant, factuur.getKlant());
    }

    @Test
    public void testDatumTijd() {
        Instant dateTimeNow = Instant.now();
        factuur.setDatumtijd(dateTimeNow.toString());
        assertEquals(dateTimeNow.toString(), factuur.getDatumtijd());
    }

    @Test
    public void testFactuurNummer() {
        factuur.setFactuurNummer(666);
        assertEquals(666, factuur.getFactuurNummer());
    }

    @Test
    public void testFactuurRegels() {
        List<FactuurRegel> factuurRegelList = new ArrayList<>();
        factuur.setFactuurregels(factuurRegelList);
        assertTrue(factuur.getFactuurregels().isEmpty());
        assertEquals(factuurRegelList, factuur.getFactuurregels());
    }

    @Test
    public void testOpmerking() {
        factuur.setOpmerking("opmerking");
        assertEquals("opmerking", factuur.getOpmerking());
    }

    @Test
    public void testContactPersoon() {
        Persoon persoon = new Persoon(1);
        factuur.setContactPersoon(persoon);
        assertEquals(persoon, factuur.getContactPersoon());
    }

}
