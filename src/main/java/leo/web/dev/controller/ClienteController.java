package leo.web.dev.controller;

import javax.validation.Valid;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import leo.web.dev.bean.Cliente;
import leo.web.dev.service.ClienteService;

@Controller
@RequestMapping(value = "/cadastro-cliente/")
public class ClienteController {
	@Autowired
	ClienteService clienteService;

	@RequestMapping("/")
	public ModelAndView cliente(Cliente cliente) {
		ModelAndView modelAndView = new ModelAndView("cadastro-cliente");
		return modelAndView;
	}

	@RequestMapping(path = "/salvar", method = RequestMethod.POST)
	public ModelAndView salvar(@Valid Cliente cliente, BindingResult result, RedirectAttributes attributes) {
		/*
		 * @RequestParam String nomeCliente,
		 * 
		 * @RequestParam String cpfCliente, @RequestParam Integer
		 * idadeCliente, @RequestParam String emailCliente,
		 * 
		 * @RequestParam String senhaCliente, @RequestParam String
		 * telefoneCliente
		 */

		if (result.hasErrors()) {
			return cliente(cliente);
		}

		clienteService.salvarCliente(cliente);
		attributes.addFlashAttribute("mensagem","Cliente cadastrado");
		return new ModelAndView("redirect:/cadastro-cliente/");
	}

}
