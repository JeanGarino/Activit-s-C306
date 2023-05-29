package info.net;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;


public class TestTabAlgos {
@Test
public  void testPlusGrand1() {
   final int resultat = 7;
   final int[] tab1 = {1, 2, 4, 6, 7, 7};
   assertEquals(resultat, TabAlgos.plusGrand(tab1));
}
@Test
public  void testPlusGrand2() {
   final int resultat = 9;
   final int[] tab1 = {9, 2, 4, 6, 5, 0};
   assertEquals(resultat, TabAlgos.plusGrand(tab1));
}

@Test
public  void testPlusGrand3() {
   final int resultat = 11;
   final int[] tab1 = {1, 2, 4, 11, 5, 3};
   assertEquals(resultat, TabAlgos.plusGrand(tab1));
}

@Test
public void testMoyenne1() {
   final  int resultat = 5;
   final  int[] tab = {9, 3, 4, 6, 7, 1};
   assertEquals(resultat, TabAlgos.moyenne(tab));
}

@Test
public  void testMoyenne2() {
final int[] tab1 = {};

   try {
      TabAlgos.moyenne(tab1);
      fail("should not reach here");
    } catch (IllegalArgumentException e) {
      System.out.println("exception attendue " + e.getMessage());
      }
}

@Test
public  void testMoyenne3() {
   final int[] tab1 = null;

   try {
      TabAlgos.moyenne(tab1);
      fail("should not reach here");
      } catch (IllegalArgumentException e) {

     System.out.println("exception attendue " + e.getMessage());

 }

}


@Test
public void testEgaux1() {
   final int[] tab1 = {1, 2, 5, 8, 9};
   final int[] tab2 = {9, 8, 5, 2, 1};
   assertFalse(TabAlgos.egaux(tab1, tab2));
}
@Test
public void testEgaux2() {
   final int[] tab1 = {1, 2, 5, 8, 9};
   final int[] tab2 = {1, 2, 5, 8, 9};
   assertTrue(TabAlgos.egaux(tab1, tab2));
}

@Test
public void testSimilaires1() {
   final int[] tab1 = {5, 2, 1, 8, 9};
   final int[] tab2 = {1, 2, 5, 8, 9};
   assertTrue(TabAlgos.similaires(tab1, tab2));
}

@Test
public void testSimilaires2() {
   final int[] tab1 = {5, 2, 1, 8, 9};
   final int[] tab2 = {1, 2, 4, 8, 9};
   assertFalse(TabAlgos.similaires(tab1, tab2));
}


}
