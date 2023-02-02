package Lab13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Networking {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL("https://en.wikipedia.org/wiki/Dumb");
		URLConnection con = url.openConnection();
		
		Path outputFile =  Paths.get("./output/task3Output.txt");
		OutputStream os = Files.newOutputStream(outputFile);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line);
			}
			bw.close();
		}
		catch(IOException ioe) {
			throw ioe;
		}
	}

}
