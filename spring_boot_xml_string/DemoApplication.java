package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/string")
	public String xmlToString() throws JsonProcessingException {
		ObjectMapper xmlMapper = new XmlMapper();
		HitList list = new HitList();
		List<Hit> hitList = new ArrayList<>();
		hitList.add(new Hit("232323"));
		hitList.add(new Hit("4323232"));
		list.setHitList(hitList);
		return xmlMapper.writeValueAsString(list);
	}

	@GetMapping("/xml")
	public HitList stringToXml() throws JsonMappingException, JsonProcessingException {
		String str = "<HitList><hitList><hitList><stdt>232323</stdt></hitList><hitList><stdt>4323232</stdt></hitList></hitList></HitList>";
		ObjectMapper xmlMapper = new XmlMapper();
		return xmlMapper.readValue(str, HitList.class);
	}

}
