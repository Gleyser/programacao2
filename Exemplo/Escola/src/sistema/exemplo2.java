package sistema;

import java.util.ArrayList;

public class exemplo2 {
	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	public static void main(String[] args) {
		
	}
	
	private Aluno criaAluno(String nome, String matricula){
		Aluno aluno = new Aluno(nome, matricula);
		return aluno;
	}
	
	// Dica: use o m�todo criaAluno!
	private void cadastrarAluno(String nome, String matricula){
		
	}
	
	private void removerAluno(String matricula){
		
	}
	
	private boolean verificaSeOAlunoEstaCadastrado(String matricula){
		
	}
	
	private Aluno recuperarAluno(String matricula){
		
	}

}
