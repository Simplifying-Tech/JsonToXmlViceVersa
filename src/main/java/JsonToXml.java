import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.json.XML;

public class JsonToXml {

	public static void main(String[] args) throws IOException {
		String root="root";
	    Path path = Paths.get("src/test/resources/JsonFile.json");
	 
	    String stringJson = Files.readAllLines(path).get(0);
	     
	    JSONObject json = new JSONObject(stringJson);
	     
	    //System.out.println(XML.toString(json));
	     
	   System.out.println("<?xml version=\"1.0\" encoding=\"ISO-8859-15\"?>\n<"+root+">" + XML.toString(json) + "</"+root+">");

	}

}
