package pet_package;

public class Dog extends Pet implements Strokeable {
	// task 2
	
	//override the make noise method from the pet class
	@Override
	public void makeNoise() {
		System.out.println(name + " Barks.");
	}

	@Override
	public void stroke() {
		// TODO Auto-generated method stub
		System.out.println(name + " enjoys being stroked.");
	}
	
}
