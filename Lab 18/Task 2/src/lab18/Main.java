package lab18;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.logger.LogBackendType;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import uk.ac.mmu.advprog.ormlab.Person;
import uk.ac.mmu.advprog.ormlab.Pet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path dbPath = Paths.get("./data/pokemonORM.db");
		String connectionString = "jdbc:sqlite:" + dbPath.toString();
		
		//Comment this out if you'd like to see what the ORM is doing in too much detail
		LoggerFactory.setLogBackendFactory(LogBackendType.NULL);
		
		try {
			//deletes any old db before starting - obviously not done in real systems
			Files.deleteIfExists(dbPath);
			
			//connect to the db
			ConnectionSource cs = new JdbcConnectionSource(connectionString);			
			
			//does all the SQL to create the tables for us
			TableUtils.createTable(cs,Pokemon.class);
			TableUtils.createTable(cs,Moves.class);
			TableUtils.createTable(cs,pokemonMoves.class);
			
			//gets Data Accessor Objects to handle the storing/finding of our people and pets
			Dao<Pokemon,Integer> PokemonDAO = DaoManager.createDao(cs, Pokemon.class);
			Dao<Moves,Integer> MovesDao = DaoManager.createDao(cs, Moves.class);
			
			//put some people and their pets into the db
			Pokemon p1 = new Pokemon("Joe","Bloggs",21);
			Pokemon p2 = new Pokemon("Jane","Bloggs",22);
			
			Moves m1 = new Moves("Mr TiggyWinkles",p1);
			Moves m2 = new Moves("Tiberius",p1);
			
			PokemonDAO.create(p1);
			PokemonDAO.create(p2);			
			MovesDao.create(m1);
			MovesDao.create(m1);
			
			System.out.println("There are " + PokemonDAO.countOf() + "Pokemons in the database");
			
			//query-by-example: find me objects that look like this
			Pokemon example = new Pokemon();
			example.setSurname("Bloggs");			
			List<Pokemon> results = PokemonDAO.queryForMatching(example);
			
			for(Pokemon p : results) {
				//find each person's pets
				Moves exampleMoves = new Moves();
				examplePet.setOwner(p);
				
				List<PMoves> MoveList = MovesDao.queryForMatching(exampleMoves);
				System.out.println(p.getForename() + " " + p.getSurname() + " has " + MoveList.size() + " Moves");
			}
			
			//close the connection to the database, and don't throw any exceptions if it goes wrong
			cs.closeQuietly();
		}
		catch(SQLException sqle) {
			System.err.println("Problem accessing db...");
			sqle.printStackTrace();
		} catch (IOException ioe) {
			System.err.println("Problem deleting db at startup...");
			ioe.printStackTrace();
		}
		
	}

}
