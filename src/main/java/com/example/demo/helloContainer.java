package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

public class helloContainer {

    @GetMapping("/")
	public Object hello(){
		Map<String, String> object = new HashMap<>();
		object.put("name", "prakharjoshi25125");
		object.put("email", "prakharjoshi25@gmail.com");
		return object;
	}
}
