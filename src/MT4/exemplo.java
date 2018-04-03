package MT3;

import java.util.ArrayList;

public class exemplo {
	private static ArrayList<Pessoa> alunos = new ArrayList<Pessoa>();
	public static void main(String[] args) {
		cadastrarPessoa("Maria", 25);
		cadastrarPessoa("Amadeu", 60);
		System.out.println("Maria e Amadeu cadastrados com sucesso");
		System.out.println("Total de pessoas cadastrados:" + quantidadeDePessoasCadastrados());		
		removerPessoa("Maria"); // removendo Maria
		System.out.println("Total de pessoas cadastrados:" + quantidadeDePessoasCadastrados());
		System.out.println("Total de pessoas cadastrados com mais de 18 anos:" + quantidadeDePessoasMaiorDeIdade());
		
	}
		

	// Para isso funcionar voc� deve criar a classe Aluno no mesmo pacote que essa classe.
	private static Aluno criaAluno(String nome, int idade){
		Pessoa pessoa = new Pessoa(nome, idade);
		return pessoa;
	}
	
	// IMPLEMENTE ESSE M�TODO. Dica: use o m�todo criaAluno! DUAS linhas resolve isso!
	private static void cadastrarPessoa(String nome, int idade){
		
		
	}
	
	// IMPLEMENTE ESSE M�TODO. Dica: use um for e um if!
	private static void removerPessoa(String nome){
		
	}
	
	// IMPLEMENTE ESSE M�TODO. Dica: use um for e um if!
	private static boolean verificaSePessoaoEstaCadastrado(String nome){
		
	}
		
	// IMPLEMENTE ESSE M�TODO. UMA linha resolve isso!
	private static int quantidadeDePessoasCadastrados() {
		
	}
	
	// Esse m�todo retorna o n�mero de pessoas que possui mais de 18 anos de idade
	// IMPLEMENTE ESSE M�TODO. Dica: use um contador, um for e um if!
	private static int quantidadeDePessoasMaiorDeIdade() {
		
	}

}
