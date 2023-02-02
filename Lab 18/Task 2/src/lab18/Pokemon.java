package lab18;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "pokemon")
public class Pokemon {

	//properties
	
	@DatabaseField
	private String name;
	
	@DatabaseField
	private String type;
	
	@DatabaseField
	private String ability;
	
	@DatabaseField
	private String description;
	
	@DatabaseField(generatedId = true) //means that we'll get an AUTO_INCREMENT id from the db
	private int id;
	
	//constructors

	public Pokemon(String name, String type, String ability, String description) {
		super();
		this.name = name;
		this.type = type;
		this.ability = ability;
		this.description = description;
	}
	
	public Pokemon() { 
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

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
