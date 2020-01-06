/**
 * ErreurEnsemble.java
 * info 2 - 2019/2020
 */
package exception;

/**
 * class cr�ant un objet Exception pour les probl�mes sur les ensembles
 *
 * @author info2
 */
public class ErreurEnsemble extends Exception {

    /**
     * Constructeur par d�fault qui renvoie : "Probl�me dans l'ensemble rentr�
     * en param�tre."
     */
    public ErreurEnsemble() {
        super("Problème  dans l'ensemble rentré en paramètre.");

    }

    /**
     * Constructeur permettant d'afficher un message de l'erreur
     *
     * @param message , message expliquant l'erreur
     */
    public ErreurEnsemble(String message) {
        super(message);
    }

    /**
     * Constructeur permettant d'afficher un message de l'erreur la valeur
     * incorrecte dans l'ensemble [0,1] Renvoie : " la valeur [valeur] n'est pas
     * contenue dans l'ensemble [0,1]."
     *
     * @param valeur , valeur incorrecte
     */
    public ErreurEnsemble(double valeur) {
        super(" la valeur " + valeur + " n'est pas contenue dans l'ensemble [0,1].");
    }
}
