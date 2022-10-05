package personnage;

public class Village {
	
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}

	public String getNom() {
		return nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		this.villageois[this.nbVillageois] = gaulois;
		this.nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int place) {
		return this.villageois[place];
	}
	
	
	public void afficherVillageois() {
		System.out.println(
				"Dans " + getNom()+" du chef "+ chef.getNom() + " vivent les legendaires gaulois "
				);
		for(int i = 0; i < nbVillageois; i++) {
			System.out.println("- "+villageois[i].getNom());
		}
	}
	
	
	public static void main(String args[]) {
		Village village = new Village("Village des Irreductibles", 30);
		/*
		 * system.out.println(village.trouverHabitant(30));
		 * genere IndexOutOfBoundsException
		 * Il faut que place soit entre 0 et 29 compris.
		 */
		Chef abra = new Chef("Abraracourcix", 6, 1, village);
		village.setChef(abra);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		
		village.afficherVillageois();
		
	}
	
}
