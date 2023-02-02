package pet_package;

public class Goldfish extends Pet {

	// task 2
	
	//override the make noise method from the pet class
	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println("They're a goldfish.");
	}
		
}
