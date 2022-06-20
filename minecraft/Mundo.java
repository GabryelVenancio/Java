/**
 * Jogo Minecraft (Exemplo POO)
 */
package minecraft;

/**
 * @author gabryel
 * Classe resposável pela criação dos objetos
 *
 */
public class Mundo {

	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
		// objeto 1
		// new (criação de um novo objeto)
		// . (ponto) -> acessa os atributos e metodos
		Bloco blocoTerra = new Bloco();
		blocoTerra.resistencia = 1;
		blocoTerra.textura = "Terra";
		System.out.println("Bloco: " + blocoTerra.textura);
		System.out.println("Resistência: " + blocoTerra.resistencia);
		blocoTerra.minerar();
		blocoTerra.construir();
		// objeto 2
		Bloco blocoMadeira = new Bloco();
		blocoMadeira.resistencia = 2;
		blocoMadeira.textura = "Madeira";
		System.out.println("Bloco: " + blocoMadeira.textura);
		System.out.println("Resistência: " + blocoMadeira.resistencia);
		blocoMadeira.minerar();
		blocoMadeira.construir();
	}

}
