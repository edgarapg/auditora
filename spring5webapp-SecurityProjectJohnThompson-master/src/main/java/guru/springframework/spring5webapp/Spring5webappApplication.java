package guru.springframework.spring5webapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;


@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) throws SAXNotRecognizedException, SAXNotSupportedException, ParserConfigurationException {
		SpringApplication.run(Spring5webappApplication.class, args);
		SAXParserFactory factory = SAXParserFactory.newInstance();
	

		factory.setXIncludeAware(true); 
		factory.setFeature("http://apache.org/xml/features/xinclude", true); 
	}

}

