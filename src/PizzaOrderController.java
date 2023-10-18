import java.util.ArrayList;
import java.util.List;

/**
 * verantwortlich für gesamten Pizza-Order Prozess
 * @author sven
 *
 */
public class PizzaOrderController {
	
	PaymentServiceProvider psp;
	PizzaAutomat pizzaAutomat;
	Drohne drohne;
	RandomQualitätssicherung qs;
	List<PizzaTyp> pizzaMenu;
	List<Bestellung> bestellungen;
	List<Kunde> kunden;
	
	public PizzaOrderController() {
		psp = new PaymentServiceProvider();
		pizzaAutomat = new PizzaAutomat();
		drohne = new Drohne();
		qs = new RandomQualitätssicherung();
		kunden = new ArrayList<>();
		pizzaMenu = new ArrayList<>();
		bestellungen = new ArrayList<>();
	}
	
	/**
	 * Kunde hinzufügen
	 * @param k
	 */
	public void addKunde(Kunde k) {
		kunden.add(k);
	}
	
	/**
	 * neue Bestellung ausführen
	 * @param b
	 */
	public void addBestellung(Bestellung b) {
		bestellungen.add(b);
		handleBestellung(b);
	}
	
	/**
	 * Bestellung abarbeiten
	 * @param bestellung
	 */
	private void handleBestellung(Bestellung bestellung) {
		// TODO Auto-generated method stub
		List<PizzaProdukt> ready = new ArrayList<>();
		for (PizzaProdukt p: bestellung.pizzas) {
			ready.add(makePizza(p));
		}
		drohne.deliver(ready, bestellung.adresse);
	}
	
	/*
	 * 
	 */
	private PizzaProdukt makePizza(PizzaProdukt p) {
		
		System.out.println("makePizza nicht implementiert, pls fix me");
		return null;
	}

	/**
	 * erstellt ein paar Demo-Kunden
	 */
	public void populateKunden() {
		
		kunden.add(new Kunde("Max Muster", List.of(new Adresse("Musterstrasse 1", "Murksstadt"))));
		kunden.add(new Kunde("Biene Maja", List.of(new Adresse("Blumewäg 21", "Schlumpfhausen"))));
		
	}
	
	/**
	 * erstellt ein Demo-Pizza-Menü
	 */
	public void populatePizzaMenu() {
		pizzaMenu.add(new PizzaTyp("Margaritha", List.of("Teig", "Tomatensosse", "Mozarella")));
		pizzaMenu.add(new PizzaTyp("Tonno", List.of("Teig", "Tomatensosse", "Thon", "Mozarella")));
		pizzaMenu.add(new PizzaTyp("Fish-Banane", List.of("Teig", "Tomatensosse", "Hering", "Banane", "Curry", "Zimt", "Knobi", "Mozarella")));
		
	}

}
