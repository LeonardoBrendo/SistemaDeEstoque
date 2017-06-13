package leo.web.dev.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;


@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	
    @NotBlank(message = "Nome é uma informação obrigatória.")
	private String nome;
	
	
    @NotNull(message = "cpf é uma informação obrigatória.")
	private Integer cpf;
	
	
    @NotNull(message = "idade é uma informação obrigatória.")
	private Integer idade;
	
	
	@NotBlank(message = "email é uma informação obrigatória.")
	private String email;
		
    @NotBlank(message = "senha é uma informação obrigatória.")
	private String senha;
	

	@NotNull(message = "telefone é uma informação obrigatória.")
	private Integer telefone;
	
	@OneToMany
	List<Produto> objetos;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public List<Produto> getObjetos() {
		return objetos;
	}

	public void setObjetos(List<Produto> objetos) {
		this.objetos = objetos;
	}
	
}
