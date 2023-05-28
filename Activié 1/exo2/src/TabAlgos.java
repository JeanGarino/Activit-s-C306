/**
*@version 1.0
*@author Jean Garino
*/
package info.net;

public final class TabAlgos {

/**
*constructor of the class.
*/
private TabAlgos() {

}

/** @return valeur la plus grande d'un tableau.
*@param tab of int.
*/
public static int plusGrand(final int[] tab) {
   int a = tab[0];

   for (int i: tab) {
      if (a < i) {
         a = i;
      }
   }

return a;
}
/**
* @return moyenne des valeurs du tableau.
*@param tab of int.
* @throw IllegalArgumentException si tab et null ou vide.
**/
public static double moyenne(final int[] tab) {
   double a = 0;
   int b = 0;
   if (tab != null) {
      for (int i:tab) {
         a = a + i;
         b++;
      }
   }
   if (b == 0 || tab == null) {
           throw new IllegalArgumentException();
         }

return a / b;
}
/** Compare le contenu de 2 tableaux en tenant compte de l'ordre.
* @return true si les 2 tableaux contiennent les mêmes éléments
* avec les mêmes nombres d'occurences (avec les elements dans le meme ordre).
*@param tab1 of int.
*@param tab2 of int.
**/
public static boolean egaux(final int[] tab1, final int[] tab2) {
// TODO

int j = 0;
boolean result = true;
   for (int i: tab1) {
      if (i != tab2[j]) {
         result = false;
      }
      j++;
   }

return result;
}
/** Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
* @return true si les 2 tableaux contiennent les mêmes éléments
* avec les mêmes nombres d'occurrence (pas forcément dans le meme ordre).
*@param tab1 of int
*@param tab2 of int
**/
public static boolean similaires(final int[] tab1, final int[] tab2) {
// TODO
int a1 = 0;
int a2 = 0;
   for (int i: tab1) {
      for (int j:tab1) {
         if (i == j) {
            a1++;
         }
      }

      for (int k:tab2) {
         if (i == k) {
            a2++;
         }
      }

      if (a1 != a2) {
         return false;

      }


   }


return true;
}

}
