package jsontobeans.ex4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application4 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		String filePath = ClassLoader.getSystemClassLoader().getResource("ex456/acteursWithAdditionalPty.json").getFile();
		
		ObjectMapper mapper = new ObjectMapper();
		List<ActeurWithIgnoreDto> acteurs = mapper.readValue(new File(filePath),new TypeReference<List<ActeurWithIgnoreDto>>(){});
		for (ActeurWithIgnoreDto acteur : acteurs) {
			System.out.println(acteur);
		}
	}

}
