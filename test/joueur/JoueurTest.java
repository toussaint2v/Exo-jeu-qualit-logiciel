package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cases.Case;
import cases.CasePropriete;
import joueur.Joueur;
import structure.Pion;
import structure.Plateau;

class joueurTest {
	
	private final Pion p=new Pion("rouge");
	private final Joueur j=new Joueur("jean",p);
	private final Case c1=new CasePropriete();
	private final Case c2=new CasePropriete();
	private final Plateau plateau=new Plateau();
	
	
	
	

	@DisplayName("test getNom=jean")
	@Test
	void testGetNom() {
		j.getNom();
		assertEquals("jean",j.getNom());
	}
	
	@DisplayName("test setCase=1")
	@Test
	void testSetCase() {
		j.setCase(c1);
		assertEquals(c1.getCaseId(),j.getCase());
	}
	
	@DisplayName("test add to compte +500")
	@Test
	void testAddToCompte() {
		j.addToCompte(500);
		assertEquals(2000,j.getCompte());
	}
	
	@DisplayName("test année prison")
	@Test
	void testPrison() {
		j.allerPrison();
		assertEquals(1,j.getAnnePrison());
		j.sortirPrison();
		assertEquals(0,j.getAnnePrison());		
	}
	
	
	
	
	
	
	

}
