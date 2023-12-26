package com.Devtools.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/test")
	public String addition() {
		int a=10;
		int b=20;
		int c=10;
		return "total : "+(a+b+c);
		
	}
	@GetMapping("/sub")
	public String Sub()
	{
		int x=50;
		int y=20;
		return ""+(x-y);
	}

}
