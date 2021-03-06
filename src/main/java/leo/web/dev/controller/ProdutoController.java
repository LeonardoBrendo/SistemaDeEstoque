package leo.web.dev.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import leo.web.dev.bean.Produto;
import leo.web.dev.service.ProdutoService;


@Controller
@RequestMapping(path = "/indexProduto/")
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;

	@RequestMapping("/")
	public ModelAndView produto(Produto produto) {
		ModelAndView modelAndView = new ModelAndView("/produto/indexproduto");
		return modelAndView;
	}

	@RequestMapping(path = "/salvar", method = RequestMethod.POST)
	public ModelAndView salvar(@Valid Produto produto, RedirectAttributes attributes) {		
		produtoService.salvarProduto(produto);
		attributes.addFlashAttribute("mensagem", "Produto cadastrado com sucesso");
		return new ModelAndView("redirect:/cadastro-produto/");
	}
	
	public ModelAndView listar(Produto produto) {
		return new ModelAndView("redirect:/cadastro-produto/");
	}
}
