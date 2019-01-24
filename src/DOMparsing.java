import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMparsing {
 public static void main(String[] args) {
	 try {
	File ipfile =new File("Student.xml");
	DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=factory.newDocumentBuilder();
	Document doc=builder.parse(ipfile);
	doc.getDocumentElement().normalize();
	System.out.println("Root Element:"+ doc.getDocumentElement().getNodeName());
	NodeList nodelist=doc.getElementsByTagName("student");
	System.out.println("*************");
	
	for (int i = 0; i < nodelist.getLength(); i++) {
		Node node=nodelist.item(i);
		System.out.println("current elemrnt:"+node.getNodeName());
		
		if(node.getNodeType()==Node.ELEMENT_NODE) {
		Element eElement=(Element) node;
		System.out.println("student roll no:"+ eElement.getAttribute("rollno"));
	    
	    System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());

       System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
        
        System.out.println("Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());	
	
	}
	}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

}
}