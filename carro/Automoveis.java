/**
 * 
 */
package carro;

import java.util.Random;

/**
 * @author gabryel
 *
 */
public class Automoveis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Carro carroBranco = new Carro();
		carroBranco.modelo = "Ford Ka";
		carroBranco.ano = 2013;
		carroBranco.cor = "Branco";
		System.out.println("Cor: " + carroBranco.cor);
		System.out.println("Ano: " + carroBranco.ano);
		System.out.println("Modelo: " + carroBranco.modelo);
		carroBranco.acelerar();

		Carro carroAzul = new Carro();
		carroAzul.modelo = "Fusca";
		carroAzul.ano = 1934;
		carroAzul.cor = "Azul";
		System.out.println("Cor: " + carroAzul.cor);
		System.out.println("Ano: " + carroAzul.ano);
		System.out.println("Modelo: " + carroAzul.modelo);
		carroAzul.ligar();

		Random gerador = new Random();
		String chassi = new String("0123456789ABCDEFGHIJKLMNOPQRSTUVXZ");
		System.out.print("Chassi: * ");
		for (int i = 0; i < 16; i++) {
			char numeracao = (char) gerador.nextInt(chassi.length());
			System.out.print(chassi.charAt(numeracao));
		}
		System.out.println(" * ");

	}

}
