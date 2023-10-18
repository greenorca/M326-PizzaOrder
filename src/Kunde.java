import java.util.List;

/**
 * vorläufiger Prototyp zur Verwaltung der Kundendaten
 * @author sven
 *
 */
public class Kunde {
	String name;
	List<Adresse> adressen;

	/**
	 * @param name
	 * @param adressen
	 */
	public Kunde(String name, List<Adresse> adressen) {
		super();
		this.name = name;
		this.adressen = adressen;
	}
}
