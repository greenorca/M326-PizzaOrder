import java.util.Random;

public class Qualitätssicherung {

	Random r = new Random();
	
	public boolean checkPizza(PizzaProdukt p1) {
		
		System.out.println("Pizzaqualität wird beurteilt");
		if (r.nextDouble()>0.8) {
			System.out.println("Pizza OK");
			return true;
		}
		System.out.println("Pizza NOK");
		return false;
	}

}
