package MT3;

import java.util.ArrayList;

public class exemplo {
	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	public static void main(String[] args) {
		cadastrarAluno("Maria", "1");
		cadastrarAluno("Amadeu", "3");
		System.out.println("Maria e Amadeu cadastrados com sucesso");
		System.out.println("Total de alunos cadastrados:" + quantidadeDeAlunosCadastrados());		
		removerAluno("1"); // removendo Maria
		System.out.println("Total de alunos cadastrados:" + quantidadeDeAlunosCadastrados());
		
	}
	
	// Para isso funcionar voc� deve criar a classe Aluno no mesmo pacote que essa classe.
	private static Aluno criaAluno(String nome, String matricula){
		Aluno aluno = new Aluno(nome, matricula);
		return aluno;
	}
	
	// IMPLEMENTE ESSE M�TODO. Dica: use o m�todo criaAluno! DUAS linhas resolve isso!
	private static void cadastrarAluno(String nome, String matricula){
		Aluno aluno = criaAluno(nome, matricula);
		alunos.add(aluno);
	}
	
	// IMPLEMENTE ESSE M�TODO. Dica: use um for e um if!
	private static void removerAluno(String matricula){
		for (Aluno a: alunos) {
			if (a.getMatricula().equals(matricula)) {
				alunos.remove(a);
			}
		}
	}
	
	// IMPLEMENTE ESSE M�TODO. Dica: use um for e um if!
	private static boolean verificaSeOAlunoEstaCadastrado(String matricula){
		for (Aluno a: alunos) {
			if (a.getMatricula().equals(matricula)) {
				return true;
			}
		}
		return false;
	}
	
	// IMPLEMENTE ESSE M�TODO. Dica: use um for e um if!
	private Aluno recuperarAluno(String matricula){
		for (Aluno a: alunos) {
			if (a.getMatricula().equals(matricula)) {
				return a;
			}
		}
		// Por enquanto, enquanto n�o vimos exce��es
		return null;
	}
	
	// IMPLEMENTE ESSE M�TODO. UMA linha resolve isso!
	private static int quantidadeDeAlunosCadastrados(){
			 return alunos.size();
	}

}
