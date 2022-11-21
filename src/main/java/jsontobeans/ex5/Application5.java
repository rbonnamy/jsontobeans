package jsontobeans.ex5;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jsontobeans.communs.Configuration;

public class Application5 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		mapper.setDateFormat(df);

		List<ActeurWithDateDto> acteurs = mapper.readValue(new File(Configuration.BASE_URL+"src\\main\\resources\\ex456\\acteursWithAdditionalPty.json"),new TypeReference<List<ActeurWithDateDto>>(){});
		for (ActeurWithDateDto acteur : acteurs) {
			System.out.println(acteur);
		}
	}

}
