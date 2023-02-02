package pet_package;
import java.util.ArrayList; // import the ArrayList class

public class PetShop {
	//task 4
	
	//create arraylist of 10 pets
	ArrayList<Pet> PetStock = new ArrayList<Pet>();
			
	public PetShop() {
		//filling stock with 10 pets
		
		Pet cat1 = new Cat();
		cat1.setName("kitkat");
		cat1.setCost(5.50);
		PetStock.add(cat1);
		
		Pet cat2 = new Cat();
		cat2.setName("snowball");
		cat2.setCost(2.50);
		PetStock.add(cat2);
		
		Pet cat3 = new Cat();
		cat3.setName("billy");
		cat3.setCost(7.50);
		PetStock.add(cat3);
		
		Pet dog1 = new Dog();
		dog1.setName("francis");
		dog1.setCost(10);
		PetStock.add(dog1);
		
		Pet dog2 = new Dog();
		dog2.setName("colt");
		dog2.setCost(7.30);
		PetStock.add(dog2);
		
		Pet dog3 = new Dog();
		dog3.setName("michaelangelo");
		dog3.setCost(1);
		PetStock.add(dog3);
		
		Pet fish1 = new Goldfish();
		fish1.setName("kebab");
		fish1.setCost(0.50);
		PetStock.add(fish1);
		
		Pet fish2 = new Goldfish();
		fish2.setName("grilled");
		fish2.setCost(2.10);
		PetStock.add(fish2);
		
		Pet fish3 = new Goldfish();
		fish3.setName("fried");
		fish3.setCost(1.11);
		PetStock.add(fish3);
		
		Pet fish4 = new Goldfish();
		fish4.setName("drowning");
		fish4.setCost(3);
		PetStock.add(fish4);	
	}
	
	public Cat buyCat() {
		//iterate through arraylist
		for (int i = 0; i < PetStock.size(); i++) {
			if(PetStock.get(i) instanceof Cat) {
				Cat temp = (Cat) PetStock.get(i);
				PetStock.remove(temp);
				return temp;
			}
		}
		return null;
	}
	
	public Dog buyDog() {
		//iterate through arraylist
		for (int i = 0; i < PetStock.size(); i++) {
			if(PetStock.get(i) instanceof Dog) {
				Dog temp = (Dog) PetStock.get(i);
				PetStock.remove(temp);
				return temp;
			}
		}
		return null;
	}
	
	public Goldfish buyGoldfish() {
		//iterate through arraylist
		for (int i = 0; i < PetStock.size(); i++) {
			if(PetStock.get(i) instanceof Goldfish) {
				Goldfish temp = (Goldfish) PetStock.get(i);
				PetStock.remove(temp);
				return temp;
			}
		}
		return null;
	}
	
	
	
	public Pet buyPetByCost(double cash) {
	
		Pet highestCostPet = null;
		
		for (int i = 0; i < PetStock.size(); i++) {
			if(highestCostPet==null) {
				highestCostPet = PetStock.get(i);
				
			}
			else {
				if(highestCostPet.getCost() < PetStock.get(i).getCost() && PetStock.get(i).getCost() <= cash) {
					highestCostPet = PetStock.get(i);
				}
			}
		}
		return highestCostPet;
		
		
	}
	
}
