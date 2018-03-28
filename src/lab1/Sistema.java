package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Livro> livros = new ArrayList<Livro>();
	private static double totalDeVendas = 0;
	
	public static void main(String[] args) {
		boasVindas();		
		int opcao = lerOpcao();		
		while (opcao!= 4){
			switch (opcao) {
			case 1:
				cadastraLivro();
				opcao = lerOpcao();
				break;
			case 2:
				venderLivro();
				opcao = lerOpcao();
				break;
			case 3:
				imprimirBalanco();
				opcao = lerOpcao();
				break;

			default:
				System.out.println("opcao incorreta");
				opcao = lerOpcao();
				break;
			}
			
		}
	}
	
	private static void imprimirBalanco() {
		System.out.println("= = = = Impressao de Balanco = = = = ");
		System.out.println("Total arrecadado em vendas:" + totalDeVendas);
		
	}

	private static void venderLivro() {
		System.out.println("= = = = Venda de Livros = = = = ");
		System.out.println("Digite o nome do livro:");
		String nome = sc.next();
		if (!livroEstaCadastrado(nome)){
			System.out.println(nome + "nao cadastrado no sistema.");
		}
		Livro livroASerVendido = recuperaLivro(nome);
		System.out.println(nome + "custa R$" + livroASerVendido.getValor() + "cada");

		System.out.println("Digite o quntidade de livros que deseja vender");	
		int quantidade = sc.nextInt();
		
		double venda = quantidade * livroASerVendido.getValor();
		totalDeVendas = totalDeVendas + venda;
		System.out.println("Total arrecadado:" + venda);	
		
		
	}
	
	private static Livro recuperaLivro(String nome) {
		for (Livro livro: livros){
			if (livro.getNome().equals(nome)){
				return livro;
			}
		}
		return null;
	}

	private static boolean livroEstaCadastrado(String nome){
		for (Livro livro: livros){
			if (livro.getNome().equals(nome)){
				return true;
			}
		}
		return false;
	}

	private static void cadastraLivro() {
		System.out.println("= = = = Cadastro de Livros = = = = ");
		System.out.println("Digite o nome do livro:");
		String nome = sc.next();
		System.out.println("Digite o preco do livro:");		
		double preco = sc.nextDouble();
		System.out.println("Digite o quntidade de livros:");	
		int quantidade = sc.nextInt();
		Livro livro = new Livro(nome, quantidade, preco);
		livros.add(livro);
		System.out.println(nome + "cadastrado com sucesso…");		
	}

	private static int lerOpcao() {
		System.out.println("Digite a opção desejada: 1 -­ Cadastrar um Livro 2 ­- Vender um Livro 3 - ­Imprimir Balanço 4 - ­ Sair ");
		System.out.println("Opção:");
		int opcao = sc.nextInt();
		return opcao;
	}

	private static void boasVindas(){
		System.out.println("= = = = Bem­vindo(a) ao Livraria P2 = = = =");
		
	}

}
