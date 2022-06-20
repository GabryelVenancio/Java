/**
 * POO - Fundamentos
 */
package minecraft;

/**
 * @author gabryel
 * Classe Modelo com heran�a (extends)
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
	
	// m�todo
	/**
	 * M�todo usado para arar a terra
	 */
	void arar() {
		System.out.println("Terra preparada para o plantio");
		// Aten��o!
		conquista = true;
	}
	
	//Polimorfismo (sobrescrita do m�todo minerar)
	void minerar() {
		System.out.println("Dano causado");
	}
}
