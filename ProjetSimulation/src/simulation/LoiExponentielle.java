/**
 * loiExponentielle.java
 * info2 - 2019/2020
 */
package simulation;

import exception.ErreurParametreNegatif;

/**
 * @author info2
 */
public class LoiExponentielle {

	/**
	 * vérifie si la valeur est positif
	 * @param x , valeur à vérifier
	 * @return true si x > 0 et false si x < 0 
	 */
	public static boolean verifLoisExpo (double x) {
		return x > 0 ;
	}
	
	/**
	 * Simulation de la loi exponentielle
	 * @param x , position 
	 * @param lambda, paramètre de la lois
	 * @return le résultat de la lois
	 * @throws ErreurParametreNegatif 
	 */
	public static double loiExpo(double lambda) throws ErreurParametreNegatif {
		
		/* Vérification du paramètre 
		 *if (!verifLoisExpo(lambda)) {
		 *	throw new ErreurParametreNegatif();
		 *}
		 */
		
		/* Simulation */
		return (-1/lambda)* Math.log(Math.random()) ;
	}
	
}
