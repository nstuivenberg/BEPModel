package nl.hu.bep.group4.bifi.model;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class KlantTest {

    private Klant klant;

    @Test
    public void testId() {
        setup();
        klant.setId(22);
        assertEquals(22, klant.getId());
    }

    @Test
    public void testBedrijfsnaam() {
        setup();
        klant.setBedrijfsnaam("bedrijfsnaam");
        assertEquals("bedrijfsnaam", klant.getBedrijfsnaam());
    }

    @Test
    public void testRechtsvorm() {
        setup();
        klant.setRechtsvorm("NV");
        assertEquals("NV", klant.getRechtsvorm());
    }

    @Test
    public void testVAT() {
        setup();
        klant.setVAT("666");
        assertEquals("666", klant.getVAT());
    }

    @Test
    public void testBankrekeningnummer() {
        setup();
        klant.setBankrekeningNummer("1");
        assertEquals("1", klant.getBankrekeningNummer());
    }

    @Test
    public void testGironummer() {
        setup();
        klant.setGiroNummer("1");
        assertEquals("1", klant.getGiroNummer());
    }

    @Test
    public void testContactPersonen() {
        setup();
        Persoon persoon = new Persoon(
                1,
                "Nick",
                "of",
                "Larie",
                "0612345678",
                "0612345678",
                Persoon.Geslacht.VROUW
        );
        List<Persoon> persoonList = new ArrayList<>();
        persoonList.add(persoon);

        klant.setContactPersonen(persoonList);

        assertFalse(klant.getContactPersonen().isEmpty());
        assertEquals(1, klant.getContactPersonen().size());
        assertEquals(persoon, klant.getContactPersonen().get(0));
    }

    @Test
    public void testAdres() {
        setup();
        Adres adres = klant.getFactuurAdres();
        List<Adres> adresList = new ArrayList<>();
        adresList.add(adres);
        klant.setAdres(adresList);

        assertFalse(klant.getAdres().isEmpty());
        assertEquals(1, klant.getAdres().size());
        assertEquals(adres, klant.getAdres().get(0));
    }

    @Test
    public void testFactuurAdres() {
        setup();
        Adres factuuradres = klant.getFactuurAdres();

        factuuradres.setPlaats("Rotterdam");
        klant.setFactuurAdres(factuuradres);

        assertEquals(factuuradres, klant.getFactuurAdres());
        assertEquals("Rotterdam",  klant.getFactuurAdres().getPlaats());
    }

    @Test
    public void testBic() {
        setup();
        klant.setBiC("bic");
        assertEquals("bic", klant.getBiC());
    }

    @Test
    public void testToString() {
        setup();
        assertEquals("Klant [id=1, bedrijfsnaam=bedrijf, rechtsvorm=BV, vat=vat, bankrekeningNummer=123456789, giroNummer=12, bic=12, contactPersonen=[], adres=[], factuurAdres=Adres [straat=factuuradres, huisnummer=1, postcode=1234AB, plaats=Ede, bic=22]]",
                klant.toString());
    }

    private void setup() {
        Adres factuuradres = new Adres("factuuradres", "1", "1234AB", "Ede", "22");
        klant = new Klant(1,
                "bedrijf",
                "BV",
                "vat",
                "123456789",
                "12",
                "12",
                new ArrayList<>(),
                new ArrayList<>(),
                factuuradres
                );
    }
}
