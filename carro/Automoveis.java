/**
 * 
 */
package carro;

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
	carroBranco.ano = 2013;
	carroBranco.cor = "Branco";
	carroBranco.modelo = "Ford Ka";
	System.out.println("Cor: " + carroBranco.cor);
	System.out.println("Ano: " + carroBranco.ano);
	System.out.println("Modelo: " + carroBranco.modelo);
	carroBranco.acelerar();

	Carro carroAzul = new Carro();
	carroAzul.ano = 1934;
	carroAzul.cor = "Azul";
	carroAzul.modelo = "Fusca";
	System.out.println("Cor: " + carroAzul.cor);
	System.out.println("Ano: " + carroAzul.ano);
	System.out.println("Modelo: " + carroAzul.modelo);
	carroAzul.ligar();
	
	}

}
