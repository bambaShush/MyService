package com.example.demo;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class X {
	
	@RequestMapping(
		path="/hello",
		method=RequestMethod.GET,
		produces=MediaType.APPLICATION_JSON_VALUE)
	public Map<String,Object> hello(){
		Map<String,Object> rv = new HashMap<>();
		rv.put("message", "hello");
		return rv;
	}
}
