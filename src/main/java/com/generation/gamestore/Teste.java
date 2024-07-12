package com.generation.gamestore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("/teste")
public class Teste {
		@GetMapping()
		public String getHello() {
			return "Hello World";
		}
}
