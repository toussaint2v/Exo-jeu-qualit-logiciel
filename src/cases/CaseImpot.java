package cases;

import design.Color;
import joueur.Joueur;

public class CaseImpot extends Case{
	

	public CaseImpot() {
		super();
	}

	@Override
	public void action(Joueur j) {

		int impot = getImpot();
		j.takeFromCompte(impot);
		System.out.println( Color.colors.get("red") +
				"Dommage... -" + impot + " sur le compte." +Color.colors.get("reset"));

	}

	public int getImpot() {
		return (int) ((Math.random()*200) + 100);
	}

}
