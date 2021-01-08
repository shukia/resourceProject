package xxe;

import java.io.FileInputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class XMLInputFactoryTest1 {

	private void getXml(String filename) throws XMLStreamException {

		try {

			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			XMLStreamReader reader = inputFactory.createXMLStreamReader(new FileInputStream(filename));
			int eventCounter = 0;
			while (reader.hasNext()) {
				int event = reader.next();
				eventCounter++;
			}
			System.out.println("eventCounter = " + eventCounter);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
