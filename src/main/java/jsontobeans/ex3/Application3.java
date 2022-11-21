package jsontobeans.ex3;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jsontobeans.communs.Configuration;
import jsontobeans.ex1.ActeurDto;
import jsontobeans.ex4.ActeurWithIgnoreDto;

public class Application3 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		List<ActeurDto> acteurs = mapper.readValue(new File(Configuration.BASE_URL+"src\\main\\resources\\ex3\\acteurs.json"),new TypeReference<List<ActeurDto>>(){});
		for (ActeurDto acteur : acteurs) {
			System.out.println(acteur);
		}
	}

}
