import java.util.List;

public class Drohne {

	public void deliver(List<PizzaProdukt> ready, Adresse adresse) {
		System.out.println("DELIVERING "+ready.size()+" Pizzas to " + adresse);
	}

}
