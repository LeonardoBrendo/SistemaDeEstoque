package leo.web.dev.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import leo.web.dev.bean.Cliente;
import leo.web.dev.service.ClienteService;

@Controller
@RequestMapping(path = "/indexCliente/")
public class ClienteController {
	@Autowired
	ClienteService clienteService;

	@RequestMapping(path="/")
	public ModelAndView index(Cliente cliente){
		ModelAndView model= new ModelAndView("/cliente/indexcliente");
		List<Cliente> clientes = clienteService.findAllCliente();
		model.addObject("clientes", clientes);
		return model;
	}
	@RequestMapping(path="/paginaSalvar")
	public ModelAndView paginaSalvarCliente(Cliente cliente){
		ModelAndView model= new ModelAndView("/cliente/cadastro-cliente");
		return model;
	}

	@RequestMapping(path = "/salvar", method=RequestMethod.POST)
	public ModelAndView salvar(@Valid Cliente cliente, RedirectAttributes attributes) {		
		clienteService.salvarCliente(cliente);
		attributes.addFlashAttribute("mensagem", "Cliente cadastrado com sucesso");
		ModelAndView model = new ModelAndView("/cliente/indexcliente"); 
		return model;
	}

	@RequestMapping("/listar")
	public String listaClientes(Model model) {
		List<Cliente> listaClientes = clienteService.findAllCliente();	
		if (listaClientes != null) {
			model.addAttribute("clientes", listaClientes);
		}
		return "/cliente/listaDeClientes";
	}
}
