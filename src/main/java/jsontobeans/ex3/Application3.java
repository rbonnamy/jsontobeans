package jsontobeans.ex3;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jsontobeans.ex1.ActeurDto;

public class Application3 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		String filePath = ClassLoader.getSystemClassLoader().getResource("ex3/acteurs.json").getFile();
		
		ObjectMapper mapper = new ObjectMapper();

		List<ActeurDto> acteurs = mapper.readValue(new File(filePath),new TypeReference<List<ActeurDto>>(){});
		for (ActeurDto acteur : acteurs) {
			System.out.println(acteur);
		}
	}

}
