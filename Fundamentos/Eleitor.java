/**
 * Fundamentos do Java
 * Vari�veis, operadores e estruturas de controle
 * Exerc�cio 1 - APP Eleitor
 * Desenvolver um APP no modo console que em fun��o da idade do
 * eleitor avise se o voto � obrigat�rio ou n�o
 * Abaixo de 16 anos - VOTO PROIBIDO
 * Entre 18 e 70 (incluindo 18 e 70) - VOTO OBRIGAT�RIO
 * 16,17 ou acima de 70 - VOTO FACULTATIVO
 */
package fundamentos;

import java.util.Scanner;

/**
 * @author gabryel
 *
 */
public class Eleitor {

	/**
	 * M�todo principal
	 * @param args
	 */
	public static void main(String[] args) {
		//vari�veis
		int idade;
		//objetos
		Scanner teclado = new Scanner(System.in);
		System.out.println("APP Eleitor ===============");
		System.out.print("Digite sua idade: ");
		//entrada
		idade = teclado.nextInt();
		// apoio ao teste do fluxo (verificar se a idade foi capturada)
		//System.out.println(idade);
		// processamento e sa�da
		if (idade < 16) {
			System.out.println("PROIBIDO VOTAR");
		}
		  else if (idade > 17 && idade < 71){
			System.out.println("VOTO OBRIGAT�RIO");
		} 
		  else {
			System.out.println("VOTO FACULTATIVO");
		}
		// encerrar a captura de dados
		teclado.close();
	}

}
