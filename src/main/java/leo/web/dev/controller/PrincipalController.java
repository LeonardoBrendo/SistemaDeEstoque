package leo.web.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import leo.web.dev.bean.Cliente;

@Controller
public class PrincipalController {
	
	@RequestMapping(path="/")
	public ModelAndView index(Cliente cliente){
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	
}
