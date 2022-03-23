package cases;

import design.Color;
import joueur.Joueur;

public class CaseChance extends Case {
	

	public CaseChance() {
		super();
	}

	@Override
	public void action(Joueur j) {
		int montant = getMontant();
		j.addToCompte(montant);
		System.out.println( Color.colors.get("green") +
				"Quelle chance !! +" + montant + " sur le compte." +Color.colors.get("reset"));

	}

	public int getMontant() {
		return (int) ((Math.random()*200) + 100);
	}
}
