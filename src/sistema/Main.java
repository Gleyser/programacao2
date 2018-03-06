package sistema;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Seja bem vindo ao sistema!");
		System.out.println("Digite sua matricula");
		String matricula = sc.next();
		System.out.println("Digite seu nome");
		String nome = sc.next();
		Sistema sistema = new Sistema(nome, matricula);
		cadastrarUsuario(sistema);
		cadastrarFuncionario(sistema);
		cadastrarPedido(sistema);
		
		
		
	}
	
	public static void cadastrarUsuario(Sistema sistema){
		System.out.println("Digite o nome do cliente");
		String nome = sc.next();
		System.out.println("Digite o endereco do cliente");
		String endereco = sc.next();
		System.out.println("Digite o cpf do cliente");		
		String cpf = "1234567890";
		sistema.cadastrarCliente(nome, cpf, endereco);
	}
	
	public static void cadastrarFuncionario(Sistema sistema){
		System.out.println("Digite o nome do funcionario");
		String nome = sc.next();
		System.out.println("Digite a matricula do funcionario");
		String matricula = sc.next();
		sistema.cadastrarFuncionario(nome, matricula);
	}
	
	public static void cadastrarPedido(Sistema sistema){
		System.out.println("Digite o nome do produto");
		String produto = sc.next();
		System.out.println("Digite a data");
		String data = sc.next();
		System.out.println("Digite o horario");
		String horario = sc.next();		
		System.out.println("Digite o cpf do cliente");
		String cpf = sc.next();
		sistema.cadastrarPedido(produto, data, horario, cpf);
	}

}
