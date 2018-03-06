package sistema;

public class Cliente {
	private String endereco;
	private String nome;
	private String cpf;
	
	public Cliente(String endereco, String nome, String cpf) {
		this.endereco = endereco;
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	@Override
	public String toString() {
		return "Cliente [endereco=" + endereco + ", nome=" + nome + ", cpf="
				+ cpf + "]";
	}
	
	
	
	

}
