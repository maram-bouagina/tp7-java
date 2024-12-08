package tp7;

public class Assiettecarree extends Assiette {
			private double cote;

			public Assiettecarree(int annee, double cote) {
				super(annee);
				this.cote = cote;
			}

			public double getCote() {
				return cote;
			}

			public void setCote(double cote) {
				this.cote = cote;
			}
				public double calculersurface() {
					return  cote * cote;
				}
			
			public double calculervaleur() {
				if(2024-annee<50) {
						return 0;
				}
				return ( 2024-annee-50)*5;
				}
}
