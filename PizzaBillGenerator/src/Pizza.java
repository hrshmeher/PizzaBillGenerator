
public class Pizza {
	
	private int price;
	
	private boolean veg;
	
	private int bagpack = 20;
	private int ExtraCheese = 100;
	private int ExtraToppins = 150;
	
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppinsAdded  = false;
	private boolean isOpted = false;
	

	public Pizza(boolean veg) {
		this.veg = veg;
		if(this.veg) {
			this.price = 300;
		}else {
			this.price = 400;
			
		}
		basePizzaPrice = this.price;
		
	
		
	}
	
	/*
	 * public void getPizzaPrice() { System.out.println(this.price); }
	 */
	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		
		this.price += ExtraCheese;
		
	}
	public void addExtraToppins() {
		isExtraToppinsAdded = true;
		this.price += ExtraToppins;
		
	}
	public void takeaway() {
		isOpted = true;
		this.price += bagpack;
		
	}
	public void getBill() {
		String bill = "";
		System.out.println("Pizza : "+basePizzaPrice);
		
		if(isExtraCheeseAdded) {
			bill += "extra cheese added:"+ExtraCheese+ "\n";	
		}
		if(isExtraToppinsAdded) {
			bill += "extra toppins added:"+ExtraToppins+ "\n";
		}
		if(isOpted) {
			bill += "out for delivery:"+bagpack+ "\n";
		}
		bill += "Bill: "+this.price+"\n";
		System.out.println(bill);
	}
	
}
