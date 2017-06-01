package leo.web.dev.bean;

import javax.persistence.Entity;

@Entity
public class Papel {

	private int id;
	private String funcao;
	
	public Papel() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
}
