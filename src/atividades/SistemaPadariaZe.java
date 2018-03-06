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
				String nome = lerProduto();
				Integer preco = lerPrecoDoProduto();
				CadastrandoProduto(nome, preco);
				System.out.println("Cadastrando...");
				opcaoDigitada = lerOpcao();
				break;
				
			case "V":
				// O código aqui está completo, mas você precisa implementar o método venderProduto.
				String nomeDoProdutoASerVendido = lerProduto();
				venderProduto(nomeDoProdutoASerVendido);
				System.out.println("Vendendo...");
				opcaoDigitada = lerOpcao();
				break;
				
			case "L":
				System.out.println("Todos os produtos cadastradoss são:");
				// Aqui você imprime todos os elementos do array produtos.
				// COMO FAZER? use o método toString() do array.
				// Para imprimir a representação do ARRAY 
				System.out.println(produtos.toString());
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
	
	private static String lerOpcao(){
		System.out.println("Por favor, digite uma opção: C para cadastrar um produto, V para vender um produto, L para listar os produtos cadastrados e S para sair");
		String opcao = sc.next();
		return opcao; 
	}
	
	// Esse método adiciona imprime a mensagem de abertura do sistema. Já está feito pra vcs :)
	private static void imprimeMensagemDeBoasVindas(){
		System.out.println("=======** Seja bem vindo(a) ao sistema das padaria do Zé! **=======");
	}
	
	
	private static String lerProduto(){
		System.out.println("Por favor, digite o nome do produto");
		String retorno = sc.next();
		return retorno; // essa linha será editada por você
	}
	
	
	private static Integer lerPrecoDoProduto(){
		System.out.println("Por favor, digite o preço do produto");
		// aqui você adiciona o código que está faltando (leia o como fazer?)
		Integer preco = sc.nextInt();
		return preco; // essa linha será editada por você
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
		if (produtos.contains(produtoASerVendido)){
			produtos.remove(produtoASerVendido);
		}
		else {
			System.out.println("Produto não cadastrado");
		}
	}

}