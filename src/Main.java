
public class Main {

	public static void main(String[] args) {
		Banco bb = new Banco("Banco do Brasil");
		Cliente venilton = new Cliente();
		Cliente eduardo = new Cliente();
		venilton.setNome("Venilton");
		eduardo.setNome("Eduardo");
		
		Conta cc1 = new ContaCorrente(venilton);
		Conta cc2 = new ContaCorrente(eduardo);
		Conta poupanca = new ContaPoupanca(venilton);

		cc1.depositar(100);
		cc1.transferir(100, poupanca);
		
		cc2.depositar(1000000);

		cc1.imprimirExtrato();
		cc2.imprimirExtrato();
		poupanca.imprimirExtrato();
		bb.getContas().add(cc1);
		bb.getContas().add(poupanca);
		bb.getContas().add(cc2);

		bb.listarClientes();
	}

}
