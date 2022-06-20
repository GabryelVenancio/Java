/**
 * Fundamentos do Java
 * Tabuada
 */
package fundamentos;

import java.util.Scanner;

/**
 * @author gabryel
 *
 */
public class Tabuada {

	/**
	 * Construtor
	 */
	public Tabuada() {
		
	}

	/**
	 * M�todo principal
	 * @param args
	 */
	public static void main(String[] args) {
		//vari�vel
		int valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("------- TABUADA -------");
		System.out.println("Digite o valor da tabuada: ");
		//entrada
		valor = teclado.nextInt();
		System.out.println("Tabuada do " + valor);
		System.out.println("");
		//processamento/sa�da
		for (int i = 1; i < 11; i++) {
			System.out.println(valor + "x" + i + " = " + (valor *i));
		}
		teclado.close();
	  }
		
	}

