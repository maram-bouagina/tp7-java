package tp7;

public class Assietteronde extends Assiette {
				private double rayon;

				public Assietteronde(int annee, double rayon) {
					super(annee);
					this.rayon = rayon;
				}

				public double getRayon() {
					return rayon;
				}

				public void setRayon(double rayon) {
					this.rayon = rayon;
				}
				public double calculersurface() {
					return  rayon * rayon *3.14 ;
				}
			
}
