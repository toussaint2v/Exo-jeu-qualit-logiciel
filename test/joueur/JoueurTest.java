package joueur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cases.Case;
import cases.propriete.CaseProprieteImmobilier;
import structure.Pion;
import structure.Plateau;

class JoueurTest {

    private final Pion p=new Pion("rouge");
    private final Joueur j=new Joueur("jean",p);
    private final Case c1=new CaseProprieteImmobilier();
    private final Case c2=new CaseProprieteImmobilier();
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
        assertEquals(Plateau.getCase(10).getCaseId() ,j.getCase());
        j.sortirPrison();
        assertEquals(0,j.getAnnePrison());
    }

    @DisplayName("test deplacer")
    @Test
    void testDeplacer() {
        j.setCase(c1);
        j.allerPrison();
        j.deplacer(c2);
        assertEquals(Plateau.getCase(10).getCaseId(), j.getCase());
        j.deplacer(c2);
        assertEquals(c2.getCaseId(), j.getCase());
    }








}
