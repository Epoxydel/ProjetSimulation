/**
 * ErreurEnsemble.java
 * info 2 - 2019/2020
 */
package exception;

/**
 * class créant un objet Exception pour les problémes sur les ensembles
 * @author info2
 */
public class ErreurEnsemble extends Exception {

	/**
	 * Constructeur par défault qui renvoie :
	 * "Problème  dans l'ensemble rentré en paramétre." 
	 */
	public ErreurEnsemble() {
		super("Problème  dans l'ensemble rentré en paramétre.");

	}

	/**
	 * Constructeur permettant d'afficher un message de l'erreur
	 * @param message , message expliquant l'erreur
	 */
	public ErreurEnsemble(String message) {
		super(message);
	}
	
	/**
	 * Constructeur permettant d'afficher un message de l'erreur la valeur incorrecte dans l'ensemble [0,1]
	 * Renvoie : 
	 * " la valeur [valeur] n'est pas contenue dans l'ensemble [0,1]."
	 * @param valeur , valeur incorrecte 
	 */
	public ErreurEnsemble(double valeur) {
		super(" la valeur " + valeur + " n'est pas contenue dans l'ensemble [0,1].");
	}
}
