package leo.web.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leo.web.dev.bean.Cliente;
import leo.web.dev.repositorio.ClienteRepositorio;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepositorio clienteRepositorio;

	public List<Cliente> findAllCliente() {
		return clienteRepositorio.findAll();
	}

	public Cliente findOneCliente(Integer id) {
		return clienteRepositorio.findOne(id);
	}

	public Cliente salvarCliente(Cliente cliente) {
		return clienteRepositorio.saveAndFlush(cliente);
	}

	public void deleteCliente(Integer id) {
		clienteRepositorio.delete(id);
	}

}
