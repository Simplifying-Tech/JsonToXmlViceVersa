import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.json.XML;

public class XmlToJson {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/test/resources/XmlFile.xml");
		 
		String stringXml = Files.readAllLines(path).get(0);
		         
		JSONObject json = XML.toJSONObject(stringXml);
		         
		System.out.println(json);
	}

}
