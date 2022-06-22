/**
 * POO - Encapsulamento e métodos especiais
 */
package contas;

/**
 * @author gabryel
 *
 */
public class Conta {

	// Atributos
	// Para encapsular(proteger) uma variável devemos usar
	// o modificador private e criar métodos específicos (get e
	// set) para outras classe e pacotes terem acesso ás
	// variáveis
	// Passo 1: Modificador private
	private String cliente;
	private double saldo;

	// Passo 2: Criar os métodos específicos (get e set)

	/**
	 * Construtor
	 */
	public Conta() {
		System.out.println("---------------");
		System.out.println("Agência 0261");
	}

	// Encapsulaento - Passo 2 Criar os métodos
	// específicos (get e set) | Eclipse - botão direito do mouse
	// - Source - Generate Getters and Setters - selecionar as
	// variáveis encapsuladas

	/**
	 * Ler o conteúdo da variável cliente
	 * 
	 * @return cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * Setar(atribuir) um nome a variável cliente
	 * 
	 * @param cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	/**
	 * Obter o saldo do cliente
	 * 
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Setar (atribuir) um valor a conta corrente
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Métodos
	/**
	 * Método Simples Exibir o valor do saldo
	 */
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}

	/**
	 * Método simples com uma variável local
	 * 
	 * @param valor
	 */

	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: R$ " + valor);
	}

	/**
	 * Método simples com uam variável local para depositar um valor na conta
	 * 
	 * @param valor
	 */

	protected void depositar(double valor) {
		saldo += valor;
		System.out.println("Crédito: R$ " + valor);
	}

	/**
	 * Método simples com uma variável local e um objeto que será criado para
	 * indicar a conta de destino da transferência do valor
	 * 
	 * @param destino
	 * @param valor
	 */
	protected void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferência: R$ " + valor);
	}

	/**
	 * Método com retorno obrigatório da variável total
	 * 
	 * @param cc1
	 * @param cc2
	 * @return
	 */
	double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;
	}
}
