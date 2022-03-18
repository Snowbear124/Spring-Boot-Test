package com.snowbear.springboottest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
	
	@Autowired
	private Printer p;
	
	@RequestMapping("/test")	//設定網址時，後面會加上/test
	public String holle() {
		p.print("Holle Bean.");
		return "Holle Bean.";
	}

}
