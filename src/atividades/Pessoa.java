package atividades;

public class Pessoa {
	private String nome;
	private Integer idade;
	private String civil;
	private String genero;
	
	public Pessoa(String nome, Integer idade, String civil, String genero){
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.civil = civil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCivil() {
		return civil;
	}

	public void setCivil(String civil) {
		this.civil = civil;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", civil=" + civil
				+ ", genero=" + genero + "]";
	}
	
	
	
	
	
	
	

}
