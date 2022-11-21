package jsontobeans.ex6;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import jsontobeans.communs.Configuration;

public class Application6 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		JavaTimeModule module = new JavaTimeModule();
        LocalDateDeserializer localDateDeserializer =  new LocalDateDeserializer(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        module.addDeserializer(LocalDate.class, localDateDeserializer);
        
        mapper.registerModule(module);
		
		List<ActeurWithLocalDateDto> acteurs4 = mapper.readValue(new File(Configuration.BASE_URL+"src\\main\\resources\\ex456\\acteursWithAdditionalPty.json"),new TypeReference<List<ActeurWithLocalDateDto>>(){});
		for (ActeurWithLocalDateDto acteur : acteurs4) {
			System.out.println(acteur);
		}
	}

}
