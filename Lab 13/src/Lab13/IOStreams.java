package Lab13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOStreams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
			Path textFile = Paths.get("./data/task2.txt");
			InputStream is = Files.newInputStream(textFile);
			BufferedReader br = new BufferedReader(new InputStreamReader (is));
			
			Path outputFile =  Paths.get("./output/task2Output.txt");
			OutputStream os = Files.newOutputStream(outputFile);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			
			String currentLine = "";
			while((currentLine = br.readLine()) != null) {
				if(currentLine.charAt(0) == '+') {
					System.out.println(currentLine);
					bw.write(currentLine);
				}
			}
			br.close();
			bw.close();
		
		
	}

}
