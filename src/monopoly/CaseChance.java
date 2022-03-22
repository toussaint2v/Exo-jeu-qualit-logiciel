package monopoly;

public class CaseChance extends Case {
	
	private int montant;
	
	public CaseChance() {
		super();
	}
	
	public void action() {
		for(Joueur j:joueurs) {
			j.addToCompte(montant);
		}
	}

}
