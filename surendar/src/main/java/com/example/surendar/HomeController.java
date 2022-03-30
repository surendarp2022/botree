package com.example.surendar;
import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	
	public ModelAndView page1(Product product)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("Product", product);
		System.out.print("hi"+product);
		mv.setViewName("page1");
		return mv;
	}
}


