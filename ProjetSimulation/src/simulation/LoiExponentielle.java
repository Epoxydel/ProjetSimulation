/**
 * loiExponentielle.java
 * info2 - 2019/2020
 */
package simulation;

/**
 * @author info2
 */
public class LoiExponentielle {

	/**
	 * TODO faire
	 * @param x
	 * @return
	 */
	public boolean verifValeur (int x) {
		return x > 0 ;
	}
	
	/**
	 * 
	 * @param x , position 
	 * @param lambda, param�tre de la lois
	 * @return le r�sultat de la lois
	 */
	public double loiExpo(int x, double lambda) {
		
		if (!verifValeur(x)) {
			//TODO finir
		}
		return 1-Math.exp(-lambda*x);
	}
	
}
