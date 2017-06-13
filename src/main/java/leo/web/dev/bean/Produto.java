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
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "Nome é uma informação obrigatória.")
	private String nome;
	
	@NotNull(message = "Peso é uma informação obrigatória.")
	private Double peso;
	
	@NotNull(message = "Valor é uma informação obrigatória.")
	private Double valor;
	
	@NotNull(message = "Tipo é uma informação obrigatória.")
	private ProdutoEnum tipo;
	
	@NotNull(message = "Quantidade é uma informação obrigatória.")
	private Double quantidade;
	
	@OneToMany
	List<Cliente> clientes;

	public Produto() {
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

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public ProdutoEnum getTipo() {
		return tipo;
	}

	public void setTipo(ProdutoEnum tipo) {
		this.tipo = tipo;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
