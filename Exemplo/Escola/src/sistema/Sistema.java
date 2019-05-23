package sistema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sistema {
	private Map<String, Aluno> alunosCadastrados;
	private Map<String, Disciplina> disciplinas;
	
	public Sistema(){
		this.alunosCadastrados = new HashMap<String, Aluno>();
		this.disciplinas = new HashMap<String, Disciplina>();
	}
	
	public void cadastrarAluno(String nome, String matricula) throws Exception{
		if (this.alunosCadastrados.containsKey(matricula)){
			throw new Exception("Matricula ja cadastrada");
		}
		Aluno aluno = new Aluno(nome, matricula);
		this.alunosCadastrados.put(matricula, aluno);
	}
	
	public void removerAluno(String matricula) throws Exception{
		if (!this.alunosCadastrados.containsKey(matricula)){
			throw new Exception("Matricula nao cadastrada");
		}
		this.alunosCadastrados.remove(matricula);
	}
	
	public void cadastrarDisciplina(String nome, int cargaHoraria, String codIdetificador){
		Disciplina disciplina = new Disciplina(nome, cargaHoraria, codIdetificador);
		this.disciplinas.put(codIdetificador, disciplina);
	}
	
	public void removerDisciplina(String codIdentificador){
		this.disciplinas.remove(codIdentificador);
	}
	
	private Aluno recuperarAluno(String matricula){
		return this.alunosCadastrados.get(matricula);
	}
	
	private Disciplina recuperarDisciplina(String codIdentificador){
		return this.disciplinas.get(codIdentificador);
	}
	
	public void matricularAluno(String matricula, String codDaDisciplina) throws Exception{
		Disciplina disciplina = recuperarDisciplina(codDaDisciplina);
		Aluno aluno = recuperarAluno(matricula);
		disciplina.matricularAluno(aluno);
	}
	
	public void desmatricularAluno(String matricula, String codDaDisciplina) throws Exception{
		Disciplina disciplina = recuperarDisciplina(codDaDisciplina);
		Aluno aluno = recuperarAluno(matricula);
		disciplina.desmatricular(aluno);
	}
	
	public String exibeAluno(String matricula){
		return recuperarAluno(matricula).toString();
		
	}
	
	public String exibeDisciplina(String cod){
		return recuperarDisciplina(cod).toString();
		
	}

}
