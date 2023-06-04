import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ReadDocument {
	public static Element read(String uri) {
		DocumentBuilder db;
		Document doc;
		try {
			db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			doc = db.parse(uri);
			return doc.getDocumentElement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
