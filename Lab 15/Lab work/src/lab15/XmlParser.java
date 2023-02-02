package lab15;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import org.xml.sax.*;

public class XmlParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = db.parse("./library.xml");
			System.out.println("Books in library: ");
			
			Element root = doc.getDocumentElement();
			NodeList titleNodes = root.getElementsByTagName("title");
			NodeList authorNodes = root.getElementsByTagName("author");
			
			for(int i = 0; i < titleNodes.getLength(); i++) {
				System.out.println(titleNodes.item(i).getChildNodes().item(0).getNodeValue());
			}
			
			for(int i = 0; i < authorNodes.getLength(); i++) {
				Element author = (Element) authorNodes.item(i);
				NodeList forenames = author.getElementsByTagName("forename");
				NodeList surnames = author.getElementsByTagName("surname");
				System.out.println(forenames.item(0).getChildNodes().item(0).getNodeValue() + " " + surnames.item(0).getChildNodes().item(0).getNodeValue());
			}	
		}
		catch (ParserConfigurationException | SAXException | IOException e) {
			System.err.println("Error opening XML file: " + e);
		}
	}

}
