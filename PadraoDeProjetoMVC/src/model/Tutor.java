/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author gleyser
 */
public class Tutor implements Serializable {
    private String nome;
    private String matricula;
    private String email;
    private String disciplina;
    private static final long serialVersionUID = 2806421523585360625L;

    public Tutor(String nome, String matricula, String email, String disciplina) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        return "Tutor{" + "nome=" + nome + ", matricula=" + matricula + ", email=" + email + ", disciplina=" + disciplina + '}';
    }
    
    
    
    
}
