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
				// Falta c�digo aqui. Complete!
				// COMO FAZER? 
				// Passo 1: leia o nome e o pre�o do teclado, usando os m�todos lerProduto() e lerPrecoDoProduto()
				// Passo 2: passe o nome e pre�o lido para o m�todo CadastrandoProduto(String produto, Integer preco)
				System.out.println("Cadastrando...");
				opcaoDigitada = lerOpcao();
				break;
				
			case "V":
				// O c�digo aqui est� completo, mas voc� precisa implementar o m�todo venderProduto.
				String produtoASerVendido = lerProduto();
				venderProduto(produtoASerVendido);
				System.out.println("Vendendo...");
				opcaoDigitada = lerOpcao();
				break;
				
			case "L":
				System.out.println("Todos os produtos cadastradoss s�o:");
				// Aqui voc� imprime todos os elementos do array produtos.
				// COMO FAZER? use o m�todo toString() do array.
				opcaoDigitada = lerOpcao();
				break;
				
			case "S":
				System.out.println("Saindo do sistema...");
				break;
				
			default:
				System.out.println("Voc� n�o digital uma op��o v�lida!");
				opcaoDigitada = lerOpcao();
				break;
			}
		}
		
	}
	
	/* Esse m�todo ler uma op��o do teclado e retorna essa opcao. 
	 * MUITO parecido com os exemplos das aulas anteriores.
	 * COMO FAZER? Inicie uma string, leia do teclado e retorne essa string lida.
	 */ 
	private static String lerOpcao(){
		System.out.println("Por favor, digite uma op��o: C para cadastrar um produto, V para vender um produto, L para listar os produtos cadastrados e S para sair");
		// aqui voc� adiciona o c�digo que est� faltando (leia o como fazer?)
		return "S"; // essa linha ser� editada por voc�
	}
	
	// Esse m�todo adiciona imprime a mensagem de abertura do sistema. J� est� feito pra vcs :)
	private static void imprimeMensagemDeBoasVindas(){
		System.out.println("=======** Seja bem vindo(a) ao sistema das padaria do Z�! **=======");
	}
	
	/* Esse m�todo ler o nome do produto do teclado e retorna esse nome. 
	 * MUITO parecido com os exemplos das aulas anteriores.
	 * COMO FAZER? Inicie uma string, leia do teclado e retorne essa string lida.
	 */ 
	private static String lerProduto(){
		System.out.println("Por favor, digite o nome do produto");
		// aqui voc� adiciona o c�digo que est� faltando (leia o como fazer?)
		return ""; // essa linha ser� editada por voc�
	}
	
	/* Esse m�todo ler um pre�o (Integer) do teclado e retorna essa pre�o. 
	 * MUITO parecido com os exemplos das aulas anteriores.
	 * COMO FAZER? Inicie um Integer, leia do teclado e retorne esse Integer lido.
	 */ 
	private static Integer lerPrecoDoProduto(){
		System.out.println("Por favor, digite o pre�o do produto");
		// aqui voc� adiciona o c�digo que est� faltando (leia o como fazer?)
		return 10; // essa linha ser� editada por voc�
	}
	
	// Esse m�todo adiciona o produto recebido como par�metro. J� est� feito pra vcs :)
	private static void CadastrandoProduto(String produto, Integer preco){
		produtos.add(produto);
		// Por enquanto o pre�o dos produtos n�o ser� armazenado
	
	}
	
	/* Esse m�todo vende um produto (apenas remove ele da listad e produtos) 
	 * MUITO parecido com os exemplos das aulas anteriores.
	 * COMO FAZER? 
	 * 1) verifique se o produto est� no array produtos, para isso use o produtos.contains(produtoASerVendido)
	 * 2) se estiver, remova o produto do array
	 * 3) se n�o estive, imprima a mensagem "Produto n�o cadastrado"
	 */ 
	private static void venderProduto(String produtoASerVendido) {
		// aqui voc� adiciona o c�digo que est� faltando (leia o como fazer?)
		
	}

}
