
public class Adresse {
	String strasse;
	String ort;
	
	/**
	 * @param strasse
	 * @param ort
	 */
	public Adresse(String strasse, String ort) {
		super();
		this.strasse = strasse;
		this.ort = ort;
	}
	
	public String toString() {
		return this.strasse + " in " + this.ort;
	}

}
