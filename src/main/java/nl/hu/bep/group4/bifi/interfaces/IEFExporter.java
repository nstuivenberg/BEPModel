package nl.hu.bep.group4.bifi.interfaces;

import java.util.List;

import nl.hu.bep.group4.bifi.model.Factuur;

public interface IEFExporter {
	public void exportFacturen(List<Factuur> facturen);
}
