package sistema;

import java.util.Enumeration;

public class Pedido {
	private String produto;
	private String data;
	private String horario;
	private Funcionario funcionarioEntrega;
	private Funcionario funcionarioCadastro;
	private Cliente cliente;
	private Acoes estadoAtual;
	
	public Pedido(String produto, String data, String horario,
			Funcionario funcionarioEntrega, Funcionario funcionarioCadastro,
			Cliente cliente) {		
		this.produto = produto;
		this.data = data;
		this.horario = horario;
		this.funcionarioEntrega = funcionarioEntrega;
		this.funcionarioCadastro = funcionarioCadastro;
		this.cliente = cliente;
		this.estadoAtual = Acoes.PORFAZER;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Funcionario getFuncionarioEntrega() {
		return funcionarioEntrega;
	}
	public void setFuncionarioEntrega(Funcionario funcionarioEntrega) {
		this.funcionarioEntrega = funcionarioEntrega;
	}
	public Funcionario getFuncionarioCadastro() {
		return funcionarioCadastro;
	}
	public void setFuncionarioCadastro(Funcionario funcionarioCadastro) {
		this.funcionarioCadastro = funcionarioCadastro;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public Acoes getEstadoAtual() {
		return estadoAtual;
	}
	public void setEstadoAtual(Acoes estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
	@Override
	public String toString() {
		return "Pedido [produto=" + produto + ", data=" + data + ", horario="
				+ horario + ", funcionarioEntrega=" + funcionarioEntrega
				+ ", funcionarioCadastro=" + funcionarioCadastro + ", cliente="
				+ cliente + "]";
	}
	
	
	
	
	
	

}
