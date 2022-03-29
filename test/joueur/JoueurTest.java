package joueur;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import structure.Pion;

class JoueurTest {

    static Joueur joueur;
    @BeforeAll
    static void init(){
        Pion pion = new Pion("blue");
        joueur = new Joueur("pierre",pion);
    }
    @Test
    void deplacer() {

    }

    @Test
    void allerPrison() {
    }

    @Test
    void sortirPrison() {
    }

    @Test
    void addToCompte() {
    }

    @Test
    void takeFromCompte() {
    }
}