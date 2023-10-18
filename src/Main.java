import java.util.List;

/**
 * Demo - Testrahmen für PizzaOrder-App
 * @author sven
 *
 */
public class Main {

	public static void main(String[] args) {
		
		PizzaOrderController pizzaOrderController = new PizzaOrderController();
		pizzaOrderController.populateKunden();
		pizzaOrderController.populatePizzaMenu();
		
		Kunde k0 = pizzaOrderController.kunden.get(0);
		
		Bestellung b = new Bestellung(k0.adressen.get(0));
		
		List<PizzaTyp> menu = pizzaOrderController.pizzaMenu;
		
		b.addPizzaProdukt(new PizzaProdukt(menu.get(1), 30, 30));
		b.addPizzaProdukt(new PizzaProdukt(menu.get(2), 25, 20));
		
		pizzaOrderController.addBestellung(b);
		
	}

}
