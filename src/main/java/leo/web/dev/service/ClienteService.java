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
		
	public List<Cliente> findAll(){
		return clienteRepositorio.findAll();
	}
	
    public Cliente findOne(Integer id) {
        return clienteRepositorio.findOne(id);
    }
     
    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepositorio.saveAndFlush(cliente);
    }
     
    public void delete(Integer id) {
    	clienteRepositorio.delete(id);
    }
	
    /*
	public Cliente salvarCliente(String nome, String cpf, Integer idade, String email, String senha, String telefone){
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setIdade(idade);
		cliente.setEmail(email);
		cliente.setSenha(senha);		
		cliente.setTelefone(telefone);
		clienteRepositorio.save(cliente);
		return cliente;
	}*/
}
