package leo.web.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leo.web.dev.bean.Cliente;
import leo.web.dev.repositorio.ClienteRepositorio;

@Service
public class ClienteService {	
	@Autowired
	ClienteRepositorio clienteRepositorio;
	
	public Cliente salvarCliente(Cliente cliente,String nome, String cpf, Integer idade, String email, String senha, String telefone){
		cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setIdade(idade);
		cliente.setEmail(email);
		cliente.setSenha(senha);		
		cliente.setTelefone(telefone);
		clienteRepositorio.save(cliente);
		return cliente;
	}
}
