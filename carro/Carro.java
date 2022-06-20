/**
 * Fundamento Classe Modelo
 */
package carro;

/**
 * @author gabryel Classe Modelo
 */

public class Carro {

	/**
	 * Construtor
	 */
	public Carro() {
		super();
		System.out.println("------------------------------");
	}

	String modelo;
	int ano;
	String cor;

	void ligar() {
		System.out.println("Ligando Carro");
	}

	void desligar() {
		System.out.println("Desligando Carro");
	}

	void acelerar() {
		System.out.println("Acelerando");
	}

}
