package Lab5;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant Bobbys = new Restaurant(); 
		
		Bobbys.setName("Bobbys");
		System.out.println(Bobbys.getName());
		
//		Bobbys.stockUp(5);
		int min = 1;
	    int max = 15;
	    
		int random = (int)Math.floor(Math.random()*(max-min+1)+min);
		
		Bobbys.stockUp(random);
		
		for (int i = 0; i < 11; i++)
		{
			try {
				Bobbys.serveCheeseBurger();
			} catch (outOfStockException e) {
				System.err.println("Out of Cheeseburgers.");
				//exit block
			}
		}
		
		
		
	}

}
