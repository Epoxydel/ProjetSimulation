/**
 * ErreurParametreNegatif.java
 * info 2 - 2019/2020
 */
package exception;

/**
 * Class cr�ant un objet Exception pour les probl�mes de param�tre n�gatif
 * @author info2
 */
public class ErreurParametreNegatif extends Exception {

	/**
	 * Constructeur par d�fault
	 * Renvoi :
	 * "Il ne faut pas rentrer un param�tre n�gatif."
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
	 * "La valeur [valeur] ne doit pas �tre une valeur n�gative."
	 * @param valeur , valeur incorrecte rentr�e
	 */
	public ErreurParametreNegatif(int valeur ) {
		super("La valeur " + valeur + " ne doit pas ètre une valeur négative.");
	}
	
	
	/**
	 * Constructeur permettant d'afficher un message de l'erreur avec la valeur ( double ) incorrecte
	 * Renvoi :
	 * "La valeur [valeur] ne doit pas �tre une valeur n�gative."
	 * @param valeur , valeur incorrecte rentr�e
	 */
	public ErreurParametreNegatif(double valeur ) {
		super("La valeur " + valeur + " ne doit pas être une valeur négative.");
	}

}
