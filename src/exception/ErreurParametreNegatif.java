/**
 * ErreurParametreNegatif.java
 * info 2 - 2019/2020
 */
package exception;

/**
 * Class créant un objet Exception pour les problémes de paramètre négatif
 * @author info2
 */
public class ErreurParametreNegatif extends Exception {

	/**
	 * Constructeur par défault
	 * Renvoi :
	 * "Il ne faut pas rentrer un paramètre négatif."
	 */
	public ErreurParametreNegatif() {
		super("Il ne faut pas rentrer un paramètre négatif.");
	}

	/**
	 * Constructeur permettant d'afficher un message de l'erreur
	 * @param message , message expliquant l'erreur
	 */
	public ErreurParametreNegatif(String message) {
		super(message);
	}
	
	/**
	 * Constructeur permettant d'afficher un message de l'erreur avec la valeur ( int)  incorrecte
	 * Renvoi :
	 * "La valeur [valeur] ne doit pas être une valeur négative."
	 * @param valeur , valeur incorrecte rentrée
	 */
	public ErreurParametreNegatif(int valeur ) {
		super("La valeur " + valeur + " ne doit pas être une valeur négative.");
	}
	
	
	/**
	 * Constructeur permettant d'afficher un message de l'erreur avec la valeur ( double ) incorrecte
	 * Renvoi :
	 * "La valeur [valeur] ne doit pas être une valeur négative."
	 * @param valeur , valeur incorrecte rentrée
	 */
	public ErreurParametreNegatif(double valeur ) {
		super("La valeur " + valeur + " ne doit pas être une valeur négative.");
	}

}
