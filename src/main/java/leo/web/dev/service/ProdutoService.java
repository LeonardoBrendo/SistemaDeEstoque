package leo.web.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leo.web.dev.bean.Produto;
import leo.web.dev.repositorio.ProdutoRepositorio;

@Service
public class ProdutoService{

	@Autowired
	private ProdutoRepositorio produtoRepositorio;
	
	public List<Produto> findAllProduto() {
		return produtoRepositorio.findAll();
	}

	public Produto findOneProduto(Integer id) {
		return produtoRepositorio.findOne(id);
	}

	public Produto salvarProduto(Produto produto) {
		return produtoRepositorio.saveAndFlush(produto);
	}

	public void deleteProduto(Integer id) {
		produtoRepositorio.delete(id);
	}
	
}
