package lab17;

import java.sql.*;

public class JDBCSQLiteTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection c = DriverManager.getConnection("jdbc:sqlite:MusicDatabase.db")){
			
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM Track WHERE TrackId = 1;");
			
			while(rs.next()) {
				System.out.println("This track is called " + rs.getString("Name"));
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}

}
