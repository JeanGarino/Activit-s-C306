package info.ht;
/**
*Classe Produit représentant un produit avec un prix et une référence.
*@author jean garino.
*@version 1.1
*/

public  class Produit {
/**
*reference.
*/
private final String reference;
/**
*prix.
*/
private double prix;
/**
*TVA.
*/
public static final double TVA = 0.20;

/**
*Constructor of the class.
*@param reference2
*/
public Produit(final String reference2) {
   this.reference = reference2;
}

/**
*return the price.
*@return le prix
*/
public final double getPrix() {
   return this.prix;
}

/**
*modifie le prix.
*@param prix2
*/
public final void setPrix(final double prix2) {
   this.prix = prix2;
}

/**
*return the reference of the class.
* @return la reference si le prix est positif, null sinon
*/
public final String getReference() {
   String resultat;

   if (prix > 0) {
      resultat = this.reference;
   } else {
      resultat = null;
      }
   return resultat;
}

/**
*methode equals.
*@param o
*@return t;
*/

@Override
public  boolean equals(final Object o) {
boolean t = false;
   if (o instanceof Produit) {
      Produit p = (Produit) o;
   t = this.reference.equals(p.reference);
   }

return t;
}

/**
*methode equals.
*@return t;
*/
@Override
public int hashCode() {
    final int vAL = 42;
    assert false : "hashCode not designed";
    return vAL; // any arbitrary constant will do
}

}
