package structure;

import cases.Case;

public class Pion {
	
	private Case pCase;
	private String couleur;
	
	public Pion(String couleur){
		this.couleur=couleur;
	}
	
	
	
	public Case getCase() {
		return pCase;
	}
	
	public void setCase(Case c) {
		pCase=c;
	}

	public String getCouleur() {
		return couleur;
	}
}
