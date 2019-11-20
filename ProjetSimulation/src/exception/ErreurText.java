/**
 * ErreurText.java
 * info 2 - 2019/2020
 */
package exception;

/**
 * Class cr�ant un objet Exception pour les probl�mes lors d'entr�e de String dans les param�tres
 * @author info2
 */
public class ErreurText extends Exception {

	/**
	 * Constructeur par d�fault
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
