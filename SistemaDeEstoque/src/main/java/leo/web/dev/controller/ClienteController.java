package leo.web.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import leo.web.dev.service.ClienteService;

@Controller
@RequestMapping(value = "/clientes/")
public class ClienteController {
	@Autowired
	ClienteService clienteService;

	@RequestMapping("/")
	public ModelAndView cliente() {
		ModelAndView modelAndView = new ModelAndView("clientes");
		return modelAndView;
	}
	@RequestMapping(path = "/salvar", method = RequestMethod.POST)
	public String salvar(@RequestParam String nomeCliente, @RequestParam String cpfCliente,@RequestParam Integer idadeCliente, @RequestParam String emailCliente, @RequestParam String senhaCliente,@RequestParam String telefoneCliente) {
		clienteService.salvarCliente(nomeCliente, cpfCliente, idadeCliente, emailCliente, senhaCliente,telefoneCliente);
		return "redirect:/clientes/";
	}

}
