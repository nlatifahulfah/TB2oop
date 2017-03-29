// File : AnimalTest.java
//PIC : Nur Latifah Ulfah - 13514015

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Nur Latifah Ulfah - 13514015
 */
public class AnimalTest {
	@Test
	public void test_getX() {
		System.out.println("Test apakah getX menghasilkan nilai dengan benar");
		Animal kodok = new Animal(2,3,"frog");
		
		assertTrue(kodok.getX()==2);
	}

	@Test
	public void test_getY() {
		System.out.println("Test apakah getY menghasilkan nilai dengan benar");
		Animal kodok = new Animal(2,3,"frog");
		
		assertTrue(kodok.getY()==3);
	}

	@Test
	public void test_setX() {
		System.out.println("Test apakah setX menghasilkan nilai dengan benar");
		Animal kodok = new Animal(2,3,"frog");
		kodok.setX(0);

		assertTrue(kodok.getX()==0);
	}

	@Test
	public void test_setY() {
		System.out.println("Test apakah setY menghasilkan nilai dengan benar");
		Animal kodok = new Animal(2,3,"frog");
		kodok.setY(0);

		assertTrue(kodok.getY()==0);
	}

	@Test
	public void test_getBobot() {
		System.out.println("Test apakah getBobot menghasilkan nilai dengan benar");
		Animal kodok = new Animal(2,3,"frog");
		
		assertTrue(kodok.getBobot()==5);
	}

	@Test
	public void test_addBobot() {
		System.out.println("Test apakah addBobot menghasilkan nilai dengan benar");
		Animal kodok = new Animal(2,3,"frog");
		kodok.addBobot();

		assertTrue(kodok.getBobot()==6);
	}

	@Test
	public void test_getNHabitat() {
		System.out.println("Test apakah getNHabitat menghasilkan nilai dengan benar");
		Animal kodok = new Animal(2,3,"frog");
		
		assertTrue(kodok.getNHabitat()==2);
	}

	@Test
	public void test_getTipeHabitat() {
		System.out.println("Test apakah getTipeHabitat menghasilkan nilai dengan benar");
		Animal kodok = new Animal(2,3,"frog");
		
		assertTrue(kodok.getTipeHabitat(0).equals("land"));
	}

	@Test
	public void test_getTipeAnimal() {
		System.out.println("Test apakah getTipeAnimal menghasilkan nilai dengan benar");
		Animal kodok = new Animal(2,3,"frog");
		
		assertTrue(kodok.getTipeAnimal().equals("frog"));
	}	

	@Test
	public void test_getSimbol() {
		System.out.println("Test apakah getSimbol menghasilkan nilai dengan benar");
		Animal kodok = new Animal(2,3,"frog");
		
		assertTrue(kodok.getSimbol() == 'f');
	}

	@Test
	public void test_interact() {
		System.out.println("Test apakah interact menghasilkan nilai dengan benar");
		Animal kodok = new Animal(2,3,"frog");
		
		assertTrue(kodok.interact().equals("ribbit"));
	}

	@Test
	public void test_getMusuh() {
		System.out.println("Test apakah getMusuh menghasilkan nilai dengan benar");
		Animal kodok = new Animal(2,3,"frog");
		
		assertTrue(kodok.getMusuh(0).equals("rhino"));
	}
}