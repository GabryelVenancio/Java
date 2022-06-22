/**
 * Conta corrente
 */
package contas;

/**
 * @author gabryel
 *
 */
public class PessoaFisica {

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Cliente 1
		Conta cc1 = new Conta();
		cc1.setCliente("Leandro Ramos");
		cc1.setSaldo(10000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1000);
		cc1.exibirSaldo();
		cc1.depositar(500);
		// Cliente 2
		Conta cc2 = new Conta();
		cc2.setCliente("Kelly Cristina");
		cc2.setSaldo(8500);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		cc2.depositar(250);
		cc2.exibirSaldo();
		// Transferência
		System.out.println("______________");
		System.out.println("Transferência");
		System.out.println("______________");
		System.out.println("Cliente: " + cc1.getCliente());
		System.out.println("Favorevido: " + cc2.getCliente());
		cc1.transferir(cc2, 2000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		// Relatório gerencial
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
		System.out.println("Saldo total nas contas: " + relatorio);
	}

}
