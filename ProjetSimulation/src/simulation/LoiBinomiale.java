/* Gestion d'une loi binomiale
 * LoiBinomiale.java		20/11/2019
 */

package simulation;

/**
 * Effectue la gestion d'une loi binomiale
 * @author lucas.gremont
 *
 */
public class LoiBinomiale {
	
	/** Le nombre d'essais total */
	int n;
	
	/** la probabilit� de r�ussite */
	double p;
	
	/**
	 * Constructeur de la classe, initialisant les attributs de la classe.
	 * @param n le nombre d'essais total
	 * @param p la probabilit� de r�ussite
	 * @throws ErreurEnsemble si les param�tres sont hors de l'ensemble pr�vu
	 */
	public LoiBinomiale(int n, double p) throws ErreurEnsemble{
		if (n <= 0) {
			throw new ErreurEnsemble("Erreur : le param�tre n n'appartient pas � l'ensemble N* !");
		}
		if (p < 0 || p > 1) {
			throw new ErreurEnsemble("Erreur : le param�tre p n'appartient pas � l'ensemble [0;1] !");
		}
		this.n = n;
		this.p = p;
	}
	
	/**
	 * Simule 
	 */
}
