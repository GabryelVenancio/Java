/**
 * 
 */
package carro;

/**
 * @author gabryel Classe Modelo com herança (extends)
 */
public class Aviao extends Carro {

	/**
	 * Construtor
	 */
	public Aviao() {
		System.out.println("___ Aeronaves ___");
	}

	double envergadura;
	public String aterrizar;

	/**
	 * @param args
	 */
	void aterrizar() {
		System.out.println("Aterrissagem: Liberada");
	}

	void acelerar() {
		System.out.println("Decolar");
	}
}
