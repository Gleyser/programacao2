package atividades;

import java.util.ArrayList;
import java.util.Scanner;

public class exemploPessoa {
	public static void main(String[] args) {
		Pessoa jose = new Pessoa("jos�", 25, "solteiro", "M");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do aben�oado:");
		String nome = sc.next();
		System.out.println("Digite a idade do aben�oado:");
		Integer idade = sc.nextInt();
		System.out.println("Digite a e. civil do aben�oado:");
		String civil = sc.next();
		System.out.println("Digite a genero do aben�oado:");
		String genero = sc.next();
		Pessoa pessoa = new Pessoa(nome, idade, civil, genero);
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
		pessoa.setIdade(50);
		System.out.println(pessoa.getIdade());
		pessoa.setNome("Ana");
		System.out.println(pessoa.getNome());
		
		ArrayList<Pessoa> usuarios = new ArrayList<Pessoa>();
		usuarios.add(pessoa);
		usuarios.add(jose);
		System.out.println(usuarios);
		
	}

}
