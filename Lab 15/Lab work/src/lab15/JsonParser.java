package lab15;

import org.json.*;
import java.nio.file.*;
import java.io.*;

public class JsonParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = Files.newBufferedReader(Paths.get("./library.json"));
			String json = ""; String line = "";
			while((line = br.readLine()) != null) { json = json + line;}
			System.out.println("Books in library: ");
			
			JSONArray root = new JSONArray(json);
			for(int i=0; i<root.length(); i++) {
				JSONObject book = root.getJSONObject(i);
				
				System.out.println(book.getString("title"));
			}
			
//			JSONArray names = new JSONArray(json);
//			for(int i=0; i<names.length(); i++) {
//				JSONObject book1 = root.getJSONObject(i);
//				
//				System.out.println(book1.getString("forename"));
//			}
		}
		catch (IOException | JSONException e) {
			System.err.println("Error opening JSON file: " + e);
		}
	}
	
}
