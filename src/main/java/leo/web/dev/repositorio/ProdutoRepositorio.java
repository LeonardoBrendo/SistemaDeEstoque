package leo.web.dev.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import leo.web.dev.bean.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Integer>{
	Produto findByNome(String nome);
}
