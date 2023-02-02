package Lab5;

public class Restaurant {
	String name; int stockLevel = 0;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	public void stockUp(int amount) {
		stockLevel += amount;
	}
	 
	public void serveCheeseBurger() throws outOfStockException {
		
		if (stockLevel <= 0) {
			throw new outOfStockException("No cheeseburgers left!");
		}
		else {
			System.out.println("Cheeseburger!");
			stockLevel -= 1;
		}
	}
	
	
	
}

