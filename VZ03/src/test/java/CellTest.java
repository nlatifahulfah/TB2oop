// File : CellTest.java
// PIC : Nur Latifah Ulfah - 13514015

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Nur Latifah Ulfah - 13514015
 */
public class CellTest {
	@Test
	public void test_getTipe() {
		System.out.println("Test getTipe");
		Cell waterHabitat = new WaterHabitat(0,0,'~');
		assertTrue(waterHabitat.getTipe().equals("water"));

		Cell entrance = new (0,0,'\\');
		assertTrue(entrance.getTipe().equals("entrance"));
	}

	//~ @Test
	//~ public void test_getX() {
		//~ System.out.println("Test getX");
		//~ Cell waterHabitat = new Cell(1,2,'~');
		//~ assertTrue(waterHabitat.getX() == 1);
//~ 
	//~ }
//~ 
	//~ @Test
	//~ public void test_getY() {
		//~ System.out.println("Test getY");
		//~ Cell waterHabitat = new Cell(1,2,'~');
		//~ assertTrue(waterHabitat.getY() == 2);
		//~ 
	//~ }
//~ 
	//~ @Test
	//~ public void test_setX() {
		//~ System.out.println("Test setX");
		//~ Cell waterHabitat = new Cell(1,2,'~');
		//~ assertTrue(waterHabitat.getX() == 1);
		//~ waterHabitat.setX(2);
		//~ assertTrue(waterHabitat.getX() == 2);
//~ 
	//~ }
//~ 
	//~ @Test
	//~ public void test_setY() {
		//~ System.out.println("Test setY");
		//~ Cell waterHabitat = new Cell(1,2,'~');
		//~ assertTrue(waterHabitat.getY() == 2);
		//~ waterHabitat.setY(1);
		//~ assertTrue(waterHabitat.getY() == 1);
//~ 
	//~ }
//~ 
	//~ @Test
	//~ public void test_render() {
		//~ System.out.println("Test render");
		//~ Cell waterHabitat = new Cell(1,2,'~');
		//~ assertTrue(waterHabitat.render() == '~');
//~ 
	//~ }

}
