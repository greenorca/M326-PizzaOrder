import java.util.ArrayList;
import java.util.List;

/**
 * verwaltet relevante Daten einer Bestellung
 * @author sven
 *
 */
public class Bestellung {
	
	List<PizzaProdukt> pizzas;
	Adresse adresse;

	public Bestellung(Adresse adresse) {
		this.adresse = adresse;
		pizzas = new ArrayList<>();
	}
	
	public void addPizzaProdukt(PizzaProdukt p) {
		System.out.println("Fix me");
	}
	
}
