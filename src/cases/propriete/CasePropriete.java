package cases.propriete;

import cases.Case;
import design.Color;
import joueur.Joueur;

import java.util.Scanner;

public class CasePropriete extends Case {
	
	private Joueur proprietaire;
	private int loyer=200;
	private int prixAchat=1000;
	private String nom;
	
	public CasePropriete() {
		super();
	}

	@Override
	public void action(Joueur j) {
		// TODO Auto-generated method stub
		if(proprietaire!=null) {
			if(j!=proprietaire) {
				payerLoyer(j);
			}
		}
		else {
			if(j.getCompte()>=prixAchat) {
				proposerAchat(j);
			}
		}
	}

	private void proposerAchat(Joueur j) {
		// TODO Auto-generated method stub
		System.out.println(j+" peut acheter "+this+"[Y/N]");
		boolean c=input(j);
		if(c) {
			setProprietaire(j);
			j.takeFromCompte(prixAchat);
		}
	}
	
	private void setProprietaire(Joueur j) {
		// TODO Auto-generated method stub
		proprietaire=j;
	}

	public boolean input(Joueur j) {
		boolean res=true;
		String input="";
		Scanner scanner=new Scanner(System.in);
		input=scanner.nextLine();
		if(input.equals("N") || input.equals("n")) {
			res= false;
		}
		return res;
		
		
	}

	private void payerLoyer(Joueur j) {
		// TODO Auto-generated method stub
		System.out.println(j+ Color.colors.get("purple") + " paye "+loyer+" de loyer" + Color.colors.get("reset"));
		j.takeFromCompte(loyer);
		proprietaire.addToCompte(loyer);
	}
	public String toString() {
		return super.toString();
	}


}
