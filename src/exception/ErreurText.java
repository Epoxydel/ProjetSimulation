/**
 * ErreurText.java
 * info 2 - 2019/2020
 */
package exception;

/**
 * Class créant un objet Exception pour les problémes lors d'entrée de String dans les paramètres
 * @author info2
 */
public class ErreurText extends Exception {

	/**
	 * Constructeur par défault
	 * Renvoi :
	 * "Il ne faut pas rentrer des textes."
	 */
	public ErreurText() {
		super("Il ne faut pas rentrer de texte.");
	}

	/**
	 * Constructeur permettant d'afficher un message de l'erreur
	 * @param message , message expliquant l'erreur
	 */
	public ErreurText(String message) {
		super(message);
	}
}
