/**
 * verantwortlich für pizza zubereitung
 * @author sven
 *
 */
public class PizzaAutomat {

	public PizzaProdukt backePizza(PizzaProdukt p) {
		System.out.println("Pizza vom Typ "+ p.pizzaTyp.name +" wird gebacken, Moment bitte");
		try {
			
			Thread.sleep(1000);
			throw new Exception("Fix me"); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Pizza fertig");
		return p;
	}

}
