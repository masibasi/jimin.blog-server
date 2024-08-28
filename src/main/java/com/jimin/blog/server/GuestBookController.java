package com.jimin.blog.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestBookController {
	
	@RequestMapping(method = RequestMethod.GET, path="/guest-book")
	public String guestBook() {
		return "HI";
	}
}
