package com.sax;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
     File infile=new File("Student.xml");
     SAXParserFactory factory = SAXParserFactory.newInstance();
    SAXParser saxParser=factory.newSAXParser();
    
    SAXparsing parsering=new SAXparsing();
    
    saxParser.parse(infile,parsering);
	} 
     
     catch (Exception e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
     
	}

}
