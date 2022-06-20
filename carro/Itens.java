/**
 * Fundamento Classe Modelo
 */
package carro;

import java.util.Random;

/**
 * @author gabryel
 */
public class Itens {

	/**
	 * Construtor
	 */
	public Itens() {

	}

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Aviao aviaoAirbus = new Aviao();
		aviaoAirbus.modelo = "Airbus 380";
		aviaoAirbus.ano = 2008;
		aviaoAirbus.cor = "Azul";
		aviaoAirbus.envergadura = 80;
		System.out.println("Cor: " + aviaoAirbus.cor);
		System.out.println("Ano: " + aviaoAirbus.ano);
		System.out.println("Modelo: " + aviaoAirbus.modelo);
		if (aviaoAirbus.aterrizar == "Permitida")
			;
		System.out.println("------------------------------");
		System.out.println("Pista Liberada");
		System.out.println("Boa Aterrissagem");
		System.out.println("------------------------------");
		aviaoAirbus.acelerar();

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
