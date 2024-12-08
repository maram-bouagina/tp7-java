package tp7;

public  abstract class Ustencile {
			protected int annee;

			public Ustencile(int annee) {
				this.annee = annee;
			}
			public String toString() {
				return "annee"+annee;
			}
			public abstract double calculersurface();
			public double calculervaleur() {
				if(2024-annee<50) {
					return 0;
				}
				return  2024-annee-50;
			}
}
