package atividades;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaPadariaZe{
	private static Scanner sc = new Scanner(System.in);
	// O array produtos guarda os produtos cadastrados
	private static ArrayList<String> produtos = new ArrayList<String>();	
	public static void main(String[] args) {
		imprimeMensagemDeBoasVindas();
		String opcaoDigitada = lerOpcao();
		while (!opcaoDigitada.equals("S")){
			switch (opcaoDigitada) {
			case "C":				
				// Falta código aqui. Complete!
				// COMO FAZER? 
				// Passo 1: leia o nome e o preço do teclado, usando os métodos lerProduto() e lerPrecoDoProduto()
				// Passo 2: passe o nome e preço lido para o método CadastrandoProduto(String produto, Integer preco)
				System.out.println("Cadastrando...");
				opcaoDigitada = lerOpcao();
				break;
				
			case "V":
				// O código aqui está completo, mas você precisa implementar o método venderProduto.
				String produtoASerVendido = lerProduto();
				venderProduto(produtoASerVendido);
				System.out.println("Vendendo...");
				opcaoDigitada = lerOpcao();
				break;
				
			case "L":
				System.out.println("Todos os produtos cadastradoss são:");
				// Aqui você imprime todos os elementos do array produtos.
				// COMO FAZER? use o método toString() do array.
				opcaoDigitada = lerOpcao();
				break;
				
			case "S":
				System.out.println("Saindo do sistema...");
				break;
				
			default:
				System.out.println("Você não digital uma opção válida!");
				opcaoDigitada = lerOpcao();
				break;
			}
		}
		
	}
	
	/* Esse método ler uma opção do teclado e retorna essa opcao. 
	 * MUITO parecido com os exemplos das aulas anteriores.
	 * COMO FAZER? Inicie uma string, leia do teclado e retorne essa string lida.
	 */ 
	private static String lerOpcao(){
		System.out.println("Por favor, digite uma opção: C para cadastrar um produto, V para vender um produto, L para listar os produtos cadastrados e S para sair");
		// aqui você adiciona o código que está faltando (leia o como fazer?)
		return "S"; // essa linha será editada por você
	}
	
	// Esse método adiciona imprime a mensagem de abertura do sistema. Já está feito pra vcs :)
	private static void imprimeMensagemDeBoasVindas(){
		System.out.println("=======** Seja bem vindo(a) ao sistema das padaria do Zé! **=======");
	}
	
	/* Esse método ler o nome do produto do teclado e retorna esse nome. 
	 * MUITO parecido com os exemplos das aulas anteriores.
	 * COMO FAZER? Inicie uma string, leia do teclado e retorne essa string lida.
	 */ 
	private static String lerProduto(){
		System.out.println("Por favor, digite o nome do produto");
		// aqui você adiciona o código que está faltando (leia o como fazer?)
		return ""; // essa linha será editada por você
	}
	
	/* Esse método ler um preço (Integer) do teclado e retorna essa preço. 
	 * MUITO parecido com os exemplos das aulas anteriores.
	 * COMO FAZER? Inicie um Integer, leia do teclado e retorne esse Integer lido.
	 */ 
	private static Integer lerPrecoDoProduto(){
		System.out.println("Por favor, digite o preço do produto");
		// aqui você adiciona o código que está faltando (leia o como fazer?)
		return 10; // essa linha será editada por você
	}
	
	// Esse método adiciona o produto recebido como parâmetro. Já está feito pra vcs :)
	private static void CadastrandoProduto(String produto, Integer preco){
		produtos.add(produto);
		// Por enquanto o preço dos produtos não será armazenado
	
	}
	
	/* Esse método vende um produto (apenas remove ele da listad e produtos) 
	 * MUITO parecido com os exemplos das aulas anteriores.
	 * COMO FAZER? 
	 * 1) verifique se o produto está no array produtos, para isso use o produtos.contains(produtoASerVendido)
	 * 2) se estiver, remova o produto do array
	 * 3) se não estive, imprima a mensagem "Produto não cadastrado"
	 */ 
	private static void venderProduto(String produtoASerVendido) {
		// aqui você adiciona o código que está faltando (leia o como fazer?)
		
	}

}
