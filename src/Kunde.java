import java.util.List;

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
