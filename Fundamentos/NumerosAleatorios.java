/**
 * Fundamentos do Java
 * Gerador de n�meros e caracteres aleat�rios
 */
package fundamentos;

import java.util.Random;

/**
 * @author gabryel
 *
 */
public class NumerosAleatorios {

	/**
	 * M�todo principal
	 * @param args
	 */
	public static void main(String[] args) {
		//Uso da classe Ramdom para gerar n�meros aleat�rios
		Random gerador = new Random();
		//Exemplo 1:
		//(100) Gerar n�meros entre 0 e 99
		int numero = gerador.nextInt(100);
		System.out.println(numero);
		//Exemplo 2:
		int dado = gerador.nextInt(6) + 1;
		System.out.println("Face do dado: " + dado);
		//Exemplo 3:
		//A linha abaixo cria um objeto que cont�m caracteres
		String chassi = new String("0123456789ABCDEFGHIJKLMNOPQRSTUVXZ");
		System.out.print("Chassi: * ");
		for (int i = 0; i < 16; i++) {
			//A linha abaixo cria uma vari�vel do tipo char que usa o objeto
			//gerador para gerar u n�mero aleat�rio ente 0 e o tamanho m�ximo
			//de caracters do objeto chassi (.lenght() -> tamanho da String)
			//(char) converter a tipo int para o tipo char
			char numeracao = (char)gerador.nextInt(chassi.length());
			//a linha abaixo imprime o valor da vari�vel numera��o
			//(.charAt() -> imprime apenas 1 caracter
			System.out.print(chassi.charAt(numeracao));
		}
		System.out.println(" * ");
	}

}
