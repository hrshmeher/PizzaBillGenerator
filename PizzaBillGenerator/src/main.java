
public class main {

	public static void main(String[] args) {
		/*
		 * Pizza basePizza = new Pizza(false); basePizza.addExtraCheese();
		 * basePizza.addExtraToppins(); basePizza.takeaway();
		 * 
		 * basePizza.getBill();
		 */
		DeluxePizza dp = new DeluxePizza(false);
		dp.takeaway();
		dp.getBill();
		
	}

}
