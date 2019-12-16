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
	 * v�rifie si la valeur est positif
	 * @param x , valeur � v�rifier
	 * @return true si x > 0 et false si x < 0 
	 */
	public static void verifLoisExpo (double x) throws ErreurParametreNegatif {
		if (x < 0)
                throw new ErreurParametreNegatif();
	}
        
        
	
	/**
	 * Simulation de la loi exponentielle
	 * @param x , position 
	 * @param lambda, param�tre de la lois
	 * @return le r�sultat de la lois
	 * @throws ErreurParametreNegatif 
	 */
	public static double loiExpo(double lambda) {
		
		/* Simulation */
		return (-1/lambda)* Math.log(Math.random()) ;
	}
	
}
