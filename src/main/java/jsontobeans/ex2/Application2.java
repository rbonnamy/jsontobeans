package jsontobeans.ex2;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jsontobeans.communs.Configuration;

public class Application2 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		ActeurWithNestedPtyDto acteur2 = mapper.readValue(new File(Configuration.BASE_URL+"src\\main\\resources\\ex2\\acteurWithNestedProperty.json"), ActeurWithNestedPtyDto.class);
		System.out.println(acteur2);
		
	}

}
