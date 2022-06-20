/**
 * Fundamentos do Java
 * Gerador de números e caracteres aleatórios
 */
package fundamentos;

import java.util.Random;

/**
 * @author gabryel
 *
 */
public class NumerosAleatorios {

	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
		//Uso da classe Ramdom para gerar números aleatórios
		Random gerador = new Random();
		//Exemplo 1:
		//(100) Gerar números entre 0 e 99
		int numero = gerador.nextInt(100);
		System.out.println(numero);
		//Exemplo 2:
		int dado = gerador.nextInt(6) + 1;
		System.out.println("Face do dado: " + dado);
		//Exemplo 3:
		//A linha abaixo cria um objeto que contém caracteres
		String chassi = new String("0123456789ABCDEFGHIJKLMNOPQRSTUVXZ");
		System.out.print("Chassi: * ");
		for (int i = 0; i < 16; i++) {
			//A linha abaixo cria uma variável do tipo char que usa o objeto
			//gerador para gerar u número aleatório ente 0 e o tamanho máximo
			//de caracters do objeto chassi (.lenght() -> tamanho da String)
			//(char) converter a tipo int para o tipo char
			char numeracao = (char)gerador.nextInt(chassi.length());
			//a linha abaixo imprime o valor da variável numeração
			//(.charAt() -> imprime apenas 1 caracter
			System.out.print(chassi.charAt(numeracao));
		}
		System.out.println(" * ");
	}

}
