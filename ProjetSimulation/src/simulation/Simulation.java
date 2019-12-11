package simulation;

import java.lang.Math;

public class Simulation {

	/**
	 * Ne v�rifie pas les erreurs de param�tres (ensemble vide, NaN ...) 
	 * @param ensemble
	 * @return
	 */
	public static double loiUniformeDiscrete(double[] ensemble) {
		int rand;
		
		// le type cast arrondi � l'inf�rieur
		rand = (int) (Math.random()*ensemble.length);
				
		return ensemble[rand];
	}
	
	/**
	 * Ne v�rifie pas les erreurs de param�tres (ensemble vide, NaN ...) 
	 * @param ensemble
	 * @param listeProba
	 * @return
	 */
	public static double loiDiscrete(double[] ensemble, double[] listeProba) {
		double alea;
		int index;
		
		normaliserProba(listeProba); // la somme sera = 1
		
		alea = Math.random();
		index = recupIndex(ensemble, listeProba, alea);
				
		return ensemble[index];
	}
	
	/**
	 * 
	 * @param m esperance
	 * @param v variance
	 * @return
	 */
	public static double loiNormale(double m, double v) {
		return Math.sqrt(-2 * Math.log(Math.random())) 
				          * Math.cos(2*Math.PI*Math.random())
						  * Math.sqrt(v)+m;
	}
	
	
	/**
	 * Si la somme est diff�rente de 1, 
	 * alors modifie les valeurs pour que cela soit vrai
	 * @return
	 */
	private static double[] normaliserProba(double[] proba) {
		double somme;
		int i;
		
		if (proba == null || proba.length == 0) {
			return proba;
		}
		
		somme = somme(proba);
		if (somme != 1) {
			i = 0;
			while (i < proba.length) {
				proba[i] /= somme;
			}
		}
		
		return proba;
	}
	


	private static int recupIndex(double[] ensemble, double[] listeProba, double alea) {
		int i;
		double probaCumul;
		
		probaCumul = 0;
		i=0;
		do {
			probaCumul += listeProba[i];
			i++;
		} while(alea > probaCumul);
		
		return i;
	}
	
	private static double somme (double[] liste) {
		int somme;
		
		somme = 0;
		for (double d : liste) {
			// TODO gestion NaN
			somme += d;
		}
		
		return somme;
	}
	
/* ---------------------------------------------------------------------*/
/* ----------------------------- verif ---------------------------------*/
/* ---------------------------------------------------------------------*/
	
	public static void verifLoiNormale(double m, double v) 
	throws IllegalArgumentException {
		verifPositif(v);
		// TODO verif NaN ...
	}

	public static void verifLoiDiscrete(double[] ensemble, double[] listeProba) 
	throws IllegalArgumentException {
		verifEnsembleVide(ensemble);
		verifEnsembleVide(ensemble);
		// TODO verif NaN ...
	}
	
	
	public static void verifLoiUniformeDiscrete(double[] ensemble) 
		throws IllegalArgumentException{
		verifEnsembleVide(ensemble);
		// TODO v�rif NaN, POSITIVE_INFINITY ...
	}
		
	private static void verifEnsembleVide(double[] ensemble) 
	throws IllegalArgumentException {
		if (ensemble.length == 0) {
			throw new IllegalArgumentException("Erreur : ensemble non vide n�cessaire");
		}
	}
	
	private static void verifPositif(double val) 
	throws IllegalArgumentException {
		if (val < 0) {
			throw new IllegalArgumentException();
		}
	}
}
