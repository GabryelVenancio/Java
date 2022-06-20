/**
 * POO - Fundamentos  
 */
package minecraft;

/**
 * @author gabryel
 * Classe Modelo
 */
public class Bloco {
	
	/**
	 * Construtor
	 */
	public Bloco() {
		super();
		System.out.println("------------------------------");
	}
	// Atributos
	int resistencia;
	String textura;
	// M�todos
	// Void -> M�todo simples sem retorno
	/**
	 * M�todo usado para construir um bloco
	 */
	void construir() {
		System.out.println("Bloco colocado");
	}
	
	/**
	 * M�todo usado para obter recursos de minera��o
	 */
	void minerar() {
		System.out.println("Recursos obtidos");
	}
	
	/**
	 * M�todo usado para craftar
	 */
	void craftar() {
		System.out.println("Item criado");
	}
}
