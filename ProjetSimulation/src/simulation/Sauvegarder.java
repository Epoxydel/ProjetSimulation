/* Sauvegarder.java			04/12/19
 */
package simulation;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Effectue la sauvegarde d'une ArrayList dans un fichier CSV
 * @author lucas.gremont
 */
public class Sauvegarder {
	
	/**
	 * Sauvegarde le contenu de liste dans un fichier CSV
	 * @param liste la liste de valeurs à sauvegarder
	 * @param cheminFichier le chemin vers le fichier CSV
	 * @return true si la sauvegarde s'est déroulée correctement, false sinon
	 */
	public static boolean sauvegarder(ArrayList liste, String cheminFichier) {
		boolean ecritureReussie = false;
		try (PrintWriter fichier = new PrintWriter(new FileWriter(cheminFichier))) {
			for (int i = 0; i < liste.size(); i++) {
				fichier.println(liste.get(i).toString() + ";");
			}
			ecritureReussie = true;
		} catch (IOException e) {
			ecritureReussie = false;
		}
		return ecritureReussie;
	}
}
