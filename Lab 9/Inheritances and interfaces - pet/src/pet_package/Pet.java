package pet_package;

public abstract class Pet {
	// task 1
	// initialise variables
	String name;
	int age;
	double cost;
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	// getters
	public String getName() {
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public double getCost() {
		return cost;
	}
	
	// additional method
	public void makeNoise() {
		System.out.println(name + " doesn't make any noise.");
	}
	
	
}
