package pet_package;

public class Cat extends Pet implements Strokeable{
	// task 2
	
	//override the make noise method from the pet class
	@Override
	public void makeNoise() {
		System.out.println(name + " Meows.");
	}

	@Override
	public void stroke() {
		// TODO Auto-generated method stub
		System.out.println(name + " wanders off and ignores you.");
	}
	
	
}
