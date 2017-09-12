	package leo.web.dev.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import leo.web.dev.bean.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{
		
	Cliente findByNome(String nome);
	List<Integer> findByCpf(Integer cpf);
}
