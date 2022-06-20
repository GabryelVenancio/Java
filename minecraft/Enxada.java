/**
 * POO - Fundamentos
 */
package minecraft;

/**
 * @author gabryel
 * Classe Modelo com herança (extends)
 */
public class Enxada extends Bloco {

	/**
	 * Construtor
	 */
	public Enxada() {
		System.out.println("____ CAMPO ____");
	}
	
	// atributos
	boolean conquista;
	
	// método
	/**
	 * Método usado para arar a terra
	 */
	void arar() {
		System.out.println("Terra preparada para o plantio");
		// Atenção!
		conquista = true;
	}
	
	//Polimorfismo (sobrescrita do método minerar)
	void minerar() {
		System.out.println("Dano causado");
	}
}
