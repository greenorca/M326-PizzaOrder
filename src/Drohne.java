import java.util.List;

/**
 * liefert fertige Pizzen an Lieferadresse aus
 * @author sven
 *
 */
public class Drohne {

	public void deliver(List<PizzaProdukt> ready, Adresse adresse) {
		System.out.println("DELIVERING "+ready.size()+" Pizzas to " + adresse);
	}

}
