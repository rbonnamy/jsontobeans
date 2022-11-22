package jsontobeans.ex1;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application1 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		String filePath = ClassLoader.getSystemClassLoader().getResource("ex1/acteur.json").getFile();
		
		ObjectMapper mapper = new ObjectMapper();
		ActeurDto acteur1 = mapper.readValue(new File(filePath), ActeurDto.class);
		System.out.println(acteur1);
	}

}
