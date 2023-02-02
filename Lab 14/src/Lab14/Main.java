package Lab14;

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
import java.util.ArrayList;

public class Main {

	ArrayList<Tariff> tariffArray = new ArrayList<Tariff>(); 
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path textFile = Paths.get("./energy_tariffs.csv");
		InputStream is = Files.newInputStream(textFile);
		BufferedReader br = new BufferedReader(new InputStreamReader (is));
		
//		Path outputFile =  Paths.get("./output/task2Output.txt");
//		OutputStream os = Files.newOutputStream(outputFile);
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		
		String currentLine = "";
		while((currentLine = br.readLine()) != null) {
			
				System.out.println(currentLine.split(",")[0]);
				//bw.write(currentLine);
			Tariff t1 = new Tariff();
			t1.setSupplierName(currentLine.split(",")[0]);
			t1.setTariffName(currentLine.split(",")[1]);
			t1.setFixLength(currentLine.split(",")[2]);
			t1.setElectricityStandingCharge(currentLine.split(",")[3]); //parse these to different datatypes
			t1.setElectricityPricePerKWH(currentLine.split(",")[4]);
			t1.setGasStandingCharge(currentLine.split(",")[5]);
			t1.setGasPricePerKWH(currentLine.split(",")[6]);
		}
		br.close();
//		bw.close();
		
		
		
		
		
	}

}
