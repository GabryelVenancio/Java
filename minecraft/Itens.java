/**
 * 
 */
package minecraft;

/**
 * @author gabryel
 *
 */
public class Itens {

	/**
	 * Construtor
	 */
	public Itens() {
		
	}

	/**
	 * M�todo principal
	 * @param args
	 */
	public static void main(String[] args) {
		Enxada enxadaDiamante = new Enxada();
		enxadaDiamante.resistencia = 10;
		enxadaDiamante.textura = "Diamante";
		enxadaDiamante.conquista = false;
		System.out.println("Enxada de " + enxadaDiamante.textura);
		System.out.println("Resist�ncia: " + enxadaDiamante.resistencia);
		enxadaDiamante.arar();
		if (enxadaDiamante.conquista == true) {
			System.out.println("--------------------------------------");
			System.out.println("Conquista obtida!");
			System.out.println("Dedica��o s�ria. Hora do plantio");
			System.out.println("--------------------------------------");
		}		
		enxadaDiamante.minerar();
	}

}
