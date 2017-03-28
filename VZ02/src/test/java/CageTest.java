// File : CageTest.java
// PIC : Nur Latifah Ulfah - 13514015

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Nur Latifah Ulfah - 13514015
 */
public class CageTest {
	@Test
	public void test_getCageArea() {
		System.out.println("Test getCageArea");
		Cage kandang = new Cage('c', "land");
		
		assertTrue(kandang.getCageArea()==50);
	}

	@Test
	public void test_getNArea() {
		System.out.println("Test getNArea");
		Cage kandang = new Cage('c', "land");
		
		assertTrue(kandang.getNArea()==0);
	}

	@Test
	public void test_getNAnimal() {
		System.out.println("Test getNAnimal");
		Cage kandang = new Cage('c', "land");
		
		assertTrue(kandang.getNAnimal()==0);
	}

	@Test
	public void test_getTipeHabitat() {
		System.out.println("Test getTipeHabitat");
		Cage kandang = new Cage('c', "land");
		
		assertTrue(kandang.getTipeHabitat().equals("land"));
	}

	@Test
	public void test_addCagePosition() {
		System.out.println("Test addCagePosition");
		Cage kandang = new Cage('c', "land");
		Cell firstPos = new Cell(1,2,'w');
		kandang.addCagePosition(firstPos);

		assertTrue(kandang.getCagePosition(0).render()=='w');
	}	

	@Test
	public void test_getCagePosition() {
		System.out.println("Test getCagePosition");
		Cage kandang = new Cage('c', "land");
		Cell firstPos = new Cell(1,2,'w');
		kandang.addCagePosition(firstPos);

		assertTrue(kandang.getCagePosition(0).getX()==1);
		assertTrue(kandang.getCagePosition(0).getY()==2);
	}	

	@Test
	public void test_addAnimal() {
		System.out.println("Test addAnimal");
		
		Cage kandang = new Cage('c', "land");
		Cell firstPos = new Cell(1,2,'w');
		kandang.addCagePosition(firstPos);
		Animal kodok = new Animal(1,2,"frog");
		kandang.addAnimal(kodok);
		//Animal tidak bisa ditambahkan karena maxAnimal == 0
		assertTrue(kandang.getNAnimal() == 0);

		//4 cage position -> 1 Animal
		for(int i=0; i<3; i++) {
			Cell nextPos = new Cell(1,i,'w');
			kandang.addCagePosition(nextPos);
		}
		Animal kodok2 = new Animal(1,0,"frog");
		assertTrue(kandang.getNAnimal() == 0);
		kandang.addAnimal(kodok2);
		
		assertTrue(kandang.getNAnimal() == 1);
	}	

	@Test
	public void test_getAnimal() {
		System.out.println("Test getAnimal");
		Cage kandang = new Cage('c', "land");
		Cell firstPos = new Cell(1,2,'w');
		kandang.addCagePosition(firstPos);
		
		//4 cage position -> 1 Animal
		for(int i=0; i<3; i++) {
			Cell nextPos = new Cell(1,i,'w');
			kandang.addCagePosition(nextPos);
		}
		Animal kodok2 = new Animal(1,0,"frog");
		assertTrue(kandang.getNAnimal() == 0);
		kandang.addAnimal(kodok2);

		assertTrue(kandang.getAnimal(0).getTipeAnimal().equals("frog"));
	}	

	@Test
	public void test_getMaxAnimal() {
		System.out.println("Test getMaxAnimal");
		
		Cage kandang = new Cage('c', "land");
		Cell firstPos = new Cell(1,2,'w');
		kandang.addCagePosition(firstPos);
		Animal kodok = new Animal(1,2,"frog");
		kandang.addAnimal(kodok);
		//Animal tidak bisa ditambahkan karena maxAnimal == 0
		assertTrue(kandang.getMaxAnimal() == 0);

		//4 cage position -> 1 Animal
		for(int i=0; i<3; i++) {
			Cell nextPos = new Cell(1,i,'w');
			kandang.addCagePosition(nextPos);
		}
		
		
		assertTrue(kandang.getMaxAnimal() == 1);
	}	

	@Test
	public void test_getTotalMakanan() {
		System.out.println("Test getTotalMakanan");
		Cage kandang = new Cage('c', "land");
		Cell firstPos = new Cell(1,2,'w');
		kandang.addCagePosition(firstPos);
		
		//4 cage position -> 1 Animal
		for(int i=0; i<3; i++) {
			Cell nextPos = new Cell(1,i,'w');
			kandang.addCagePosition(nextPos);
		}
		Animal kodok2 = new Animal(1,0,"frog");
		assertTrue(kandang.getNAnimal() == 0);
		kandang.addAnimal(kodok2);

		assertTrue(kandang.getTotalMakanan() == 5);
	}	

	@Test
	public void test_isPositionEmpty() {
		System.out.println("Test isPositionEmpty");
		Cage kandang = new Cage('c', "land");
		Cell firstPos = new Cell(1,2,'w');
		kandang.addCagePosition(firstPos);
		
		assertTrue(kandang.isPositionEmpty(firstPos) == true);

		//4 cage position -> 1 Animal
		for(int i=0; i<3; i++) {
			Cell nextPos = new Cell(1,i,'w');
			kandang.addCagePosition(nextPos);
		}
		Animal kodok = new Animal(1,2,"frog");
		kandang.addAnimal(kodok);

		assertTrue(kandang.isPositionEmpty(firstPos) == false);
	}	

	@Test
	public void test_isPositionInCage() {
		System.out.println("Test isPositionInCage");
		Cage kandang = new Cage('c', "land");
		Cell firstPos = new Cell(1,2,'w');
		kandang.addCagePosition(firstPos);
		
		//4 cage position -> 1 Animal
		for(int i=0; i<3; i++) {
			Cell nextPos = new Cell(1,i,'w');
			kandang.addCagePosition(nextPos);
		}
		
		assertTrue(kandang.isPositionInCage(1,2) == true);
		assertTrue(kandang.isPositionInCage(1,0) == true);
		assertTrue(kandang.isPositionInCage(1,1) == true);
		assertTrue(kandang.isPositionInCage(1,2) == true);
		assertTrue(kandang.isPositionInCage(2,2) == false);
	}	
}