/**
 * Fundamentos do Java
 * Variáveis, operadores e estruturas de controle
 * Exercício 1 - APP Eleitor
 * Desenvolver um APP no modo console que em função da idade do
 * eleitor avise se o voto é obrigatório ou não
 * Abaixo de 16 anos - VOTO PROIBIDO
 * Entre 18 e 70 (incluindo 18 e 70) - VOTO OBRIGATÓRIO
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
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
		//variáveis
		int idade;
		//objetos
		Scanner teclado = new Scanner(System.in);
		System.out.println("APP Eleitor ===============");
		System.out.print("Digite sua idade: ");
		//entrada
		idade = teclado.nextInt();
		// apoio ao teste do fluxo (verificar se a idade foi capturada)
		//System.out.println(idade);
		// processamento e saída
		if (idade < 16) {
			System.out.println("PROIBIDO VOTAR");
		}
		  else if (idade > 17 && idade < 71){
			System.out.println("VOTO OBRIGATÓRIO");
		} 
		  else {
			System.out.println("VOTO FACULTATIVO");
		}
		// encerrar a captura de dados
		teclado.close();
	}

}
