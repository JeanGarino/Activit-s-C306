
public final class Calcul {
   /**
   *Constructeur de la class.
   */
   private Calcul() {

   }
/**
*Calcul la somme de deux nombres .
*@param a
*@param b
*@return la somme de a et b
**/
   public static int somme(final int a, final int b) {
      return a + b;
   }
/**
*Renvoie la note, bornée par les valeurs min et max, exemples:.
* noteBornee(12.5,0.0,20.0) doit renvoyer 12.2
* noteBornee(25.0,0.0,20.0) doit renvoyer 20.0
* noteBornee(-2.0,0.0,20.0) doit renvoyer 0.0
*@param note
*@param min
*@param max
*@return resultat
**/
   public static double noteBornee(final double note,
                                   final double min, final double max) {
   double resultat = note;
      if (note >= max) {
         resultat = max;
      }
      if (note <= min) {
         resultat = min;
      }
   return resultat;
   }
/**
*calcul la division.
*@param a
*@param b
*@return a / b si b != 0
* @throw IllegalArgumentException si b == 0
*/
   public static int division(final int a, final int b) {
      if (b == 0) {
         throw new IllegalArgumentException("b ne doit pas etre 0");
      }
   return a / b;
   }
}
