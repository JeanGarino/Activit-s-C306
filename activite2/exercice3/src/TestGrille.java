import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GrilleImplVideTest {

    private GrilleImplVide grille;

    @Before
    public void setUp() {
        grille = new GrilleImplVide(9); // Remplacez le paramètre de la dimension par la valeur réelle de la dimension
    }

    @Test
    public void testGetElements() {
        Set<ElementDeGrille> expectedElements = new HashSet<>();
		
		//expectedElements.add();
        // Ajoutez les éléments attendus à la liste

        Set<ElementDeGrille> actualElements = grille.getElements();

        Assert.assertEquals(expectedElements, actualElements);
    }

    @Test
    public void testGetDimension() {
        int expectedDimension = 9; // Remplacez par la dimension attendue de la grille
        int actualDimension = grille.getDimension();

        Assert.assertEquals(expectedDimension, actualDimension);
    }

    @Test
    public void testSetValue() {
        // Effectuez les tests pour la méthode setValue
    }

    @Test
    public void testGetValue() {
        // Effectuez les tests pour la méthode getValue
    }

    @Test
    public void testIsComplete() {
        boolean expectedComplete = true; // Remplacez par la valeur attendue pour la méthode isComplete
        boolean actualComplete = grille.isComplete();

        Assert.assertEquals(expectedComplete, actualComplete);
    }

    @Test
    public void testIsPossible() {
        // Effectuez les tests pour la méthode isPossible
    }

    @Test
    public void testIsValeurInitiale() {
        // Effectuez les tests pour la méthode isValeurInitiale
    }
}