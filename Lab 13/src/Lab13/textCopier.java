package Lab13;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class textCopier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path dataFolder = Paths.get("./data");
		
		
		try {
			DirectoryStream<Path> ds = Files.newDirectoryStream(dataFolder);
			for(Path fileOrDir : ds) {
				if(fileOrDir.getFileName().toString().endsWith(".txt")) {
					Path outputFolder = Paths.get("./output/" + fileOrDir.getFileName());
					System.out.println(fileOrDir);
					Files.copy(fileOrDir, outputFolder);
				}
			}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
				
//		Files.copy(null, null);
	}

}
