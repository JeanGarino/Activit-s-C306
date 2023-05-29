public class GrilleImlVide implements Grills{
private int dimension;

    /**
     * Renvoie les ElementDeGrille pouvant exister dans le grille.
     */
	@Override 
    Set<ElementDeGrille> getElements(){
		
		
	}

    /**
     * @return largeur/hauteur de la grille
     */
	 @override
    int getDimension(){
		
	return this.dimension;}

    /**
     * Affecte une valeur dans une case de la grille, ou null pour 'vider' la case
     *
     * @param x     position x dans la grille
     * @param y     position y dans la grille
     * @param value élément de grille à mettre dans la case, null pour vider la case
     * @throws ValeurImpossibleException           si l'élément de grille n'est pas autorisé à cette position dans la grille
     *                                             aux vues des autres valeurs de la grille
     * @throws ElementInterditException            si l'élément de grille n'est pas autorisé dans cette grille pouvant être mis dans la grille
     * @throws HorsBornesException                 si x ou y sont en dehors de la grille
     * @throws ValeurInitialeModificationException si une valeur initiale de la grille est en position x,y
     */
	@override
    void setValue(int x, int y, ElementDeGrille value)
            throws HorsBornesException, ValeurImpossibleException, ElementInterditException, ValeurInitialeModificationException {
				
				
				
			}

    /**
     * Renvoie une valeur de la grille.
     *
     * @param x position x dans la grille
     * @param y position y dans la grille
     * @return élément de la grille de la case x,y, null s'il n'y a pas d'élément à cette position
     * @throws HorsBornesException si x ou y sont en dehors de la grille
     */
	 @override 
    ElementDeGrille getValue(int x, int y) throws HorsBornesException{
		
		
	return null;}

    /**
     * Teste si une grille est remplie.
     *
     * @return true si la grille est complete
     */
	@override 
    boolean isComplete(){
		
		
	return true;}

    /**
     * Teste si une valeur peut être placée dans la grille.
     *
     * @param x     position x dans la grille
     * @param y     position y dans la grille
     * @param value valeur a mettre dans la case
     * @return true si value peut être placé dans la grille en position x,y en respectant les règles du sudoku et sans modifier une valeur initiale.
     * @throws HorsBornesException      si x ou y sont hors bornes
     * @throws ElementInterditException si value n'est pas un caractere pouvant être mis dans la grille
     */
	 @override 
    boolean isPossible(int x, int y, ElementDeGrille value)
            throws HorsBornesException, ElementInterditException{
				
				
			return false ;}

    /**
     * @param x     position x dans la grille
     * @param y     position y dans la grille
     * @return true si la case x,y contient une valeur initiale de la grille.
     */
	 @override 
    boolean isValeurInitiale(int x,int y){
		
		
	return true;}

}