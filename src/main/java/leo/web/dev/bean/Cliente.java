package leo.web.dev.bean;

import java.util.List;

import javax.persistence.Column;
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
	
	@Column(nullable = true, length = 50)
    @NotBlank(message = "Nome é uma informação obrigatória.")
	private String nome;
	
	@Column(nullable = true, length = 50)
    @NotBlank(message = "cpf é uma informação obrigatória.")
	private String cpf;
	
	@Column(nullable = true, length = 50)
    @NotNull(message = "idade é uma informação obrigatória.")
	private Integer idade;
	
	@Column(nullable = true, length = 50)
    @NotBlank(message = "email é uma informação obrigatória.")
	private String email;
	
	@Column(nullable = true, length = 50)
    @NotBlank(message = "senha é uma informação obrigatória.")
	private String senha;
	
	@Column(nullable = true, length = 50)
    @NotBlank(message = "telefone é uma informação obrigatória.")
	private String telefone;
	
	@OneToMany
	List<Objeto> objetos;
	
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
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
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Objeto> getObjetos() {
		return objetos;
	}

	public void setObjetos(List<Objeto> objetos) {
		this.objetos = objetos;
	}
		
}
