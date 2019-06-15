package nl.hu.bep.group4.bifi.model;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FactuurTest {

    private Factuur factuur;
    private Klant klant;
    List<FactuurRegel> factuurRegelList;
    Persoon contactpersoon;

    private void setup() {
        klant = new Klant(1);
        factuurRegelList = new ArrayList<>();
        contactpersoon = new Persoon(1);
        contactpersoon.setGeslacht(Persoon.Geslacht.MAN);
        factuur = new Factuur(klant, "datumtijd", 1, factuurRegelList,
                "opmerking", contactpersoon);
    }

    @Test
    public void testFactuur() {
        setup();

        assertEquals(klant, factuur.getKlant());
        assertEquals("datumtijd", factuur.getDatumtijd());
        assertEquals(1, factuur.getFactuurNummer());
        assertEquals(factuurRegelList, factuur.getFactuurregels());
        assertEquals("opmerking", factuur.getOpmerking());
        assertEquals(contactpersoon, factuur.getContactPersoon());
    }

    @Test
    public void testKlantInFactuur() {
        Factuur legeFactuur  = new Factuur();
        Klant klant = new Klant(1);
        legeFactuur.setKlant(klant);
        assertEquals(klant, legeFactuur.getKlant());
    }
    @Test
    public void testToString() {
        setup();
        String expected = "Factuur [klant=Klant [id=1, bedrijfsnaam=null, rechtsvorm=null, VAT=null, bankrekeningNummer=null, giroNummer=null, BiC=null, contactPersonen=null, adres=null, factuurAdres=null], datumtijd=datumtijd, factuurNummer=1, factuurregels=[], opmerking=opmerking, contactPersoon=Persoon [id=1, voornaam=null, tussenvoegsel=null, achternaam=null, telefoon=null, fax=null, geslacht=MAN]]";

        assertEquals(expected, factuur.toString());
    }

}
