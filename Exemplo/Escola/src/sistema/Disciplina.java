package sistema;

import java.util.HashSet;
import java.util.Set;

public class Disciplina {
	private String nome;
	private int cargaHoraria;
	private String codIdentificador;
	private Set<Aluno> alunosMatriculados;
	
	public Disciplina(String nome, int cargaHoraria, String codIdentificador){
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.codIdentificador = codIdentificador;
		this.alunosMatriculados = new HashSet<Aluno>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargahoraria() {
		return cargaHoraria;
	}

	public void setCargahoraria(int cargahoraria) {
		this.cargaHoraria = cargahoraria;
	}
	
	
	
	public String getCodIdentificador() {
		return codIdentificador;
	}

	public void matricularAluno(Aluno aluno) throws Exception{
		if (this.alunosMatriculados.contains(aluno)){
			throw new Exception("aluno já matriculado");
		}
		this.alunosMatriculados.add(aluno);
	}
	
	
	public void desmatricular(Aluno aluno) throws Exception{
		if (!this.alunosMatriculados.contains(aluno)){
			throw new Exception("aluno não matriculado");
		}
	
		this.alunosMatriculados.remove(aluno);
	}

	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", cargahoraria=" + cargaHoraria + ", codIdentificador=" + codIdentificador
				+ ", alunosMatriculados=" + alunosMatriculados + "]";
	}
	
	

}
