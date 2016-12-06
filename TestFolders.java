import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class TestFolders {

	public static Document loadXMLFromString(String xml) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		InputSource is = new InputSource(new StringReader(xml));
		return builder.parse(is);
	}

	public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
		Collection<String> folders = new ArrayList<>();

		if (xml != null) {

			try {
				Document document = loadXMLFromString(xml);
				/*if (document == null) {
					System.out.println("Document NULL");
				} else {
					System.out.println("Document OK");
				}

				*/
				NodeList nList = document.getElementsByTagName("folder");

				//System.out.println("NodeList len : " + nList.getLength());

				for (int temp = 0; temp < nList.getLength(); temp++) {

					Node nNode = nList.item(temp);
					Element eElement = (Element) nNode;
					String folderName = eElement.getAttribute("name");
					if(folderName.startsWith(String.valueOf(startingLetter))) {
						//System.out.println("folderName : " + folderName);
						folders.add(folderName);
					}
					
					
				}

			} catch (SAXException sxe) {
				Exception x = sxe;
				if (sxe.getException() != null)
					x = sxe.getException();
				x.printStackTrace();
			} catch (ParserConfigurationException pce) {
				pce.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

		}

		return folders;
	}

	public static void main(String[] args) throws Exception {
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "<folder name=\"c\">"
				+ "<folder name=\"program files\">" + "<folder name=\"uninstall information\" />" + "</folder>"
				+ "<folder name=\"users\" />" + "</folder>";

		Collection<String> names = folderNames(xml, 'u');
		for (String name : names)
			System.out.println(name);
	}
}