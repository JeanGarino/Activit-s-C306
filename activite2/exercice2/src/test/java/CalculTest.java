
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class CalculTest {
@Test
public void testConstructeur() { new Calcul(); }
@Test
public void testSomme() { assertEquals(5,Calcul.somme(2,3)); }
@Test
public void testDivision() { assertEquals(4,Calcul.division(8,2)); }
@Test
public void testDivision2(){

 try {
	Calcul.division(8,0); 
	 fail("cette ligne de code ne s'affiche pas");
	 
 } catch(IllegalArgumentException e){
	 System.out.println("exception attendue " + e.getMessage()); 
 }	
	
}


@Test
public void testNoteBornee1(){
	
	assertEquals(12.5,Calcul.noteBornee(12.5,0.0,20.0));
	
}

@Test
public void testNoteBornee2(){
	
	assertEquals(20,Calcul.noteBornee(25.0,0.0,20.0));
	
}

@Test
public void testNoteBornee3(){
	
	assertEquals(0.0,Calcul.noteBornee(-12.5,0.0,20.0));
	
}

}