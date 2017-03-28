// File : VisitorTest.java
// PIC : Nur Latifah Ulfah - 13514015

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Nur Latifah Ulfah - 13514015
 */
public class VisitorTest {
	@Test
	public void test_getX() {
		System.out.println("Test getX");
		Visitor ulfah = new Visitor(5,4);
		
		assertTrue(ulfah.getX() == 5);
	}

	@Test
	public void test_getY() {
		System.out.println("Test getY");
		Visitor ulfah = new Visitor(5,4);
		
		assertTrue(ulfah.getY() == 4);
	}

	@Test
	public void test_setPosition() {
		System.out.println("Test setPosition");
		Visitor ulfah = new Visitor(5,4);
		ulfah.setPosition(4,5);
		assertTrue(ulfah.getX() == 4);
		assertTrue(ulfah.getY() == 5);
	}

	@Test
	public void test_getSimbol() {
		System.out.println("Test getSimbol");
		Visitor ulfah = new Visitor(5,4);
		
		assertTrue(ulfah.getSimbol() == 'V');
	}
}