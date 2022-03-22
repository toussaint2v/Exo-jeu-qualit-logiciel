package monopoly;

public class CaseImpot extends Case{
	
	private int impot;
	
	public CaseImpot() {
		super();
	}
	
	public void action() {
		for(Joueur j:joueurs) {
			j.takeFromCompte(impot);
		}
	}

}
