package lab18;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "pokemonMoves")
public class pokemonMoves {
	
	//properties
	
	@DatabaseField
	public String pokemon;

	@DatabaseField
	public String move;

}
