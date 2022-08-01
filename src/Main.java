
public class Main {

	public static void main(String[] args) {
		Cliente junior = new Cliente();
		junior.setNome("Junior");
		
		Conta cc = new ContaCorrente(junior);
		Conta poupanca = new ContaPoupanca(junior);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
