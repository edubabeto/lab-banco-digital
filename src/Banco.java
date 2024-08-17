import java.util.List;
import java.util.ArrayList;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void listarClientes() {
		System.out.println("=== Lista de Clientes por Conta ===");
		for (Conta conta: this.contas) {
			System.out.println(conta.cliente.getNome());
		}
	}

}
