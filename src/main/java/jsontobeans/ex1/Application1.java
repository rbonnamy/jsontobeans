package jsontobeans.ex1;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jsontobeans.communs.Configuration;

public class Application1 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		ActeurDto acteur1 = mapper.readValue(new File(Configuration.BASE_URL+"src\\main\\resources\\ex1\\acteur.json"), ActeurDto.class);
		System.out.println(acteur1);
	}

}
