/* Gestion d'une loi binomiale
 * LoiBinomiale.java		20/11/2019
 */

package simulation;

import exception.ErreurEnsemble;

/**
 * Effectue la gestion d'une loi binomiale
 * @author lucas.gremont
 *
 */
public class LoiBinomiale {
	
	/** Le nombre d'essais total */
	int n;
	
	/** la probabilité de réussite */
	double p;
	
	/**
	 * Constructeur de la classe, initialisant les attributs de la classe.
	 * @param n le nombre d'essais total
	 * @param p la probabilité de réussite
	 * @throws ErreurEnsemble si les paramètres sont hors de l'ensemble prévu
	 */
	public LoiBinomiale(int n, double p) throws ErreurEnsemble{
		if (n <= 0) {
			throw new ErreurEnsemble("Erreur : le paramètre n n'appartient pas à l'ensemble N* !");
		}
		if (p < 0 || p > 1) {
			throw new ErreurEnsemble("Erreur : le paramètre p n'appartient pas à l'ensemble [0;1] !");
		}
		this.n = n;
		this.p = p;
	}
	
	/**
	 * Simule le comportement de la loi
	 * @return le nombre de succès obtenus
	 */
	public double simuler(int k) {
		int nbSucces = 0;
		for (int i = 0; i < n; i++) {
			if (Math.random() <= p) {
				nbSucces++;
			}
		}
		return nbSucces;
	}
}
