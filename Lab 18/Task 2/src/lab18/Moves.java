package lab18;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "moves")
public class Moves {
	
	//properties
	
	@DatabaseField
	private String name;
	
	@DatabaseField
	private String type;
	
	@DatabaseField
	private String category;
	
	@DatabaseField
	private int power;
	
	@DatabaseField
	private String description;
	
	@DatabaseField
	private int accuracy;
	
	@DatabaseField
	private int defaultPP;
	
	@DatabaseField(generatedId = true) //means that we'll get an AUTO_INCREMENT id from the db
	private int id;
	
	//constructors
	
	public Moves(String name, String type, String category, int power, String description, int accuracy, int defaultPP) {
		super();
		this.name = name;
		this.type = type;
		this.category = category;
		this.power = power;
		this.description = description;
		this.accuracy = accuracy;
		this.defaultPP = defaultPP;
	}
	
	public Moves() {
		//a class must have a default constructor to work with ORMLite		
	}
	
	//getters & setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getDefaultPP() {
		return defaultPP;
	}

	public void setDefaultPP(int defaultPP) {
		this.defaultPP = defaultPP;
	}
}
