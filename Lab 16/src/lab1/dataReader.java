package lab1;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class dataReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = db.parse("./input/trafficwatchni_incidents_rss.xml");
			System.out.println("Incidents: ");
			
			Element root = doc.getDocumentElement();
			NodeList DateNodes = root.getElementsByTagName("pubDate");
			NodeList TitleNodes = root.getElementsByTagName("title");
			NodeList DescNodes = root.getElementsByTagName("description");
//			
			for(int i = 0; i < DateNodes.getLength(); i++) {
				String DT = (DateNodes.item(i).getChildNodes().item(0).getNodeValue());
				System.out.println("Date of Incident : " + (DT.substring(0, 15)));
				System.out.println("Time of Incident : " + (DT.substring(17, 22)));
				
			}
			
			for(int i = 0; i < TitleNodes.getLength(); i++) {
				String DT2 = (TitleNodes.item(i).getChildNodes().item(0).getNodeValue());
				System.out.println("Title : " + DT2);
				
			}
			
			for(int i = 0; i < DescNodes.getLength(); i++) {
				String DT1 = (DescNodes.item(i).getChildNodes().item(0).getNodeValue());
				System.out.println("Description : " + DT1);
				
			}
			// gets data and outputs it to console
			Element incidents = doc.createElement("incidents");
			doc.appendChild(incidents);
			
			Element incident1 = doc.createElement("incident");
			Element Date
			

		}
		catch (ParserConfigurationException | SAXException | IOException e) {
			System.err.println("Error opening XML file: " + e);
		}
	}

}
