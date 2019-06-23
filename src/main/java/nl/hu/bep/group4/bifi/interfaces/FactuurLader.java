package nl.hu.bep.group4.bifi.interfaces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import nl.hu.bep.group4.bifi.exceptions.GarbageDataException;
import nl.hu.bep.group4.bifi.model.Factuur;

public interface FactuurLader {
	List<Factuur> getFacturenVoorMaand(int maandNummer)
			throws GarbageDataException, ClassNotFoundException, SQLException, IOException;
}
