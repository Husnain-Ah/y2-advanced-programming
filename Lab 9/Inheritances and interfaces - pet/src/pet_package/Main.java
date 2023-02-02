package pet_package;

public class Main {
	//task 2 and 3

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initialise pets
		Pet cat = new Cat();
		cat.setName("kitkat");
		
		Pet dog = new Dog();
		dog.setName("fluffy");
		
		Pet fish = new Goldfish();
		fish.setName("demonspawn");
		
		// make noise for pets
		cat.makeNoise();
		dog.makeNoise();
		fish.makeNoise();
		
		//stroke strokeable pets
		((Strokeable)cat).stroke();
		((Strokeable)dog).stroke();
		
		System.out.println("\n");
		
		PetShop shop = new PetShop();
		
		Cat c = shop.buyCat();
		System.out.println("Bought " + c.getName());
		
		Dog d = shop.buyDog();
		System.out.println("Bought " + d.getName());
		
		Goldfish g = shop.buyGoldfish();
		System.out.println("Bought " + g.getName());
		
		System.out.println("\n");
		
		Pet b = shop.buyPetByCost(5);
		System.out.println("Bought " + b.getName());
	}

}
