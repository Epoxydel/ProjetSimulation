/**
 * 
 */
package test;

import exception.ErreurParametreNegatif;
import simulation.LoiExponentielle;

/**
 * @author yanis.delmas
 *
 */
public class testLoiExponentielle {

	public static void testLoiExponentiell() {
		double somme = 0;
			for (int i =0;i<10000;i++) {
				somme += LoiExponentielle.loiExpo(-10.0);
			}
			somme /= 10000;
			
			System.out.print(somme);
			
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testLoiExponentiell();
	}

}
