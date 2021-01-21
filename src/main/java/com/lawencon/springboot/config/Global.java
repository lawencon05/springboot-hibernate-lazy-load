package com.lawencon.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * @author lawencon05
 */

@Configuration
public class Global {

	/**
	 * JavaTimeModule = support java 8 time
	 * JsonInclude.Include.NON_EMPTY = remove null field
	 */
	@Bean
	public ObjectMapper objectMapper() {
		JavaTimeModule module = new JavaTimeModule();
		return new ObjectMapper().registerModule(module).registerModule(new Hibernate5Module())
				.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
	}
}
