package jsontobeans.ex2;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application2 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		String filePath = ClassLoader.getSystemClassLoader().getResource("ex2/acteurWithNestedProperty.json").getFile();
		
		ObjectMapper mapper = new ObjectMapper();
		ActeurWithNestedPtyDto acteur2 = mapper.readValue(new File(filePath), ActeurWithNestedPtyDto.class);
		System.out.println(acteur2);
		
	}

}
