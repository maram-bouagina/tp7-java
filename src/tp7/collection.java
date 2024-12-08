package tp7;

public class collection {

	public static void main(String[] args) {
		 Ustencile[] us = new Ustencile[5];
		us[0] = new Assietteronde(1926, 8.4); 
		us[1] = new Cuillere(1881, 7.3);
		us[2]= new Assiettecarree(1935, 5.6);
		us[3]= new Cuillere(1917, 8.8);
		us[4] = new Assietteronde(1837, 5.4);
		
		afficherCuilleres(us); 
		afficherSurfaceAssiettes(us); 
		afficherValeurTotale(us);
		 } 
		static void afficherCuilleres(Ustencile[] us) { 
		int nbCuilleres = 0;
		 for (int i = 0; i < us.length; i++) {
				if(us[i] instanceof Cuillere) {
					nbCuilleres++;
		}
		 }
		System.out.println("Il y a " + nbCuilleres + " cuillères.");
		 } 
		static void afficherSurfaceAssiettes(Ustencile[] us) { 
		double somme = 0;
		 for (int i = 0; i < us.length; i++) {
			 if(us[i] instanceof Assietteronde) {
					somme+=us[i].calculersurface();
		}
			 else if (us[i] instanceof Assiettecarree) {
					somme+=us[i].calculersurface();
		}
		 }
		System.out.println("Surface totale des assiettes : " + somme);
		 } 
		 static void afficherValeurTotale(Ustencile[] us) { 
		double somme = 0;
		 for (int i = 0; i < us.length; i++) {
			 somme+=us[i].calculervaleur();
		 }
		System.out.println("Valeur totale de la collection : " + somme);
		 		

	}

}
