package sistema;

import java.util.ArrayList;

public class Sistema {
	private ArrayList<Pedido> pedidos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Funcionario> funcionarios;
	private Funcionario funcionarioAtual;
	
	public Sistema(String matricula, String nome) {
		this.pedidos = new ArrayList<Pedido>();
		this.clientes = new ArrayList<Cliente>();
		this.funcionarios = new ArrayList<Funcionario>();
		this.funcionarioAtual = new Funcionario(nome, matricula);
	}
	
	private Funcionario recuperaFuncionario(String matricula) {
		for (Funcionario func:this.funcionarios){
			if (func.getMatricula().equals(matricula)){
				return func;
			}
		}
		System.out.println("Funcionario nao localizado");
		return null;
	}

	public void cadastrarFuncionario(String nome, String matricula){
		Funcionario funcionario = new Funcionario(nome, matricula);
		funcionarios.add(funcionario);
	}
	
	public void cadastrarCliente(String nome, String cpf, String endereco){
		Cliente cliente = new Cliente(nome, cpf, endereco);
		clientes.add(cliente);
	}
	
	public void cadastrarPedido(String produto, String data, String horario, String cpf){
		Funcionario funcAtual = this.funcionarioAtual;
		Funcionario funcEntregador = new Funcionario("José", "1234");
		Cliente cliente = recuperaCliente(cpf);
		Pedido pedido = new Pedido(produto, data, horario, funcEntregador, funcAtual, cliente);
	}

	private Cliente recuperaCliente(String cpf) {
		for (Cliente cliente:this.clientes){
			if(cliente.getCpf().equals(cpf)){
				return cliente;
			}
		}
		System.out.println("Cliente nao localizado");
		return null;
	}
	
	

}
