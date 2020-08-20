package com.cos.instagram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/test/join")
	public String test1() {
		return "auth/join";
	}
	
	@GetMapping("/test/login")
	public String test2() {
		return "auth/login";
	}
	
	@GetMapping("/test/explore")
	public String test3() {
		return "image/explore";
	}
	
	@GetMapping("/test/feed")
	public String test4() {
		return "image/feed";
	}
	
	@GetMapping("/test/footer")
	public String test5() {
		return "layout/footer";
	}
	

	@GetMapping("/test/header")
	public String test6() {
		return "layout/header";
	}
	

	@GetMapping("/test/image")
	public String test7() {
		return "image/image-upload";
	}
}
