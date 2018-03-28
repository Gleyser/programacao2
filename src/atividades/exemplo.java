package atividades;

import java.util.ArrayList;

public class exemplo {
	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	public static void main(String[] args) {
		
	}
	
	// Para isso funcionar você deve criar a classe Aluno no mesmo pacote que essa classe.
	private Aluno criaAluno(String nome, String matricula){
		Aluno aluno = new Aluno(nome, matricula);
		return aluno;
	}
	
	// Dica: use o método criaAluno!
	private void cadastrarAluno(String nome, String matricula){
		
	}
	
	private void removerAluno(String matricula){
		
	}
	
	private boolean verificaSeOAlunoEstaCadastrado(String matricula){
		
	}
	
	private Aluno recuperarAluno(String matricula){
		
	}

}
