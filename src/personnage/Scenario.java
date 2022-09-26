package personnage;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 8);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		
		panoramix.parler("Je vais aller pr�parer une petite potion...");
		
		panoramix.booster(obelix);
		asterix.parler("Par B�l�nos, �a n'est pas juste !");
		panoramix.booster(asterix);
		
		asterix.parler("Bojour � tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

	}

}
