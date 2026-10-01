package liste;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NoeudTest {
    private Noeud noeudATester;
    private Noeud noeudSuivant;

    @BeforeEach 
    void init() {
        noeudSuivant = new Noeud(2, null);
        noeudATester = new Noeud(1, noeudSuivant);
    }

    @Test
    void constructeurEtGetters() {
        assertEquals(1, noeudATester.getElement());
        assertEquals(noeudSuivant, noeudATester.getSuivant());
    }

    @Test
    void setters() {    
        noeudATester.setElement(3);

        Noeud nouveauSuivant = new Noeud(4, null);
        noeudATester.setSuivant(nouveauSuivant);

        assertEquals(3, noeudATester.getElement());
        assertEquals(nouveauSuivant, noeudATester.getSuivant());
    }

    @Test 
    void toStringTest() {
        assertEquals("Noeud(1)", noeudATester.toString());
    }
}
