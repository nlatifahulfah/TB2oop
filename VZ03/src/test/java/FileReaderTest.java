// File : FileReaderTest.java
// PIC : Nur Latifah Ulfah - 13514015

import org.junit.*;
import static org.junit.Assert.*;

/**
*
* @author Nur Latifah Ulfah - 13514015
*/
public class FileReaderTest {
  @Test
  public void test_getNBrs() {
    System.out.println("Test getNBrs");
   	FileReader f = new FileReader("input.txt");
    // System.out.println(f.getNBrs());
    assertTrue(f.getNBrs()==16);
  }

  @Test
  public void test_getNKol() {
    System.out.println("Test getNKol");
   	FileReader f = new FileReader("input.txt");

    assertTrue(f.getNKol()==6);
  }

  @Test
  public void test_getNCellType() {
    System.out.println("Test getNCellType");
   	FileReader f = new FileReader("input.txt");

    assertTrue(f.getNCellType()==8);
  }

  @Test
  public void test_getCellSimbol() {
    System.out.println("Test getCellSimbol");
   	FileReader f = new FileReader("input.txt");

    assertTrue(f.getCellSimbol(0)=='#');
  }

  @Test
  public void test_getCellType() {
    System.out.println("Test getCellType");
   	FileReader f = new FileReader("input.txt");

    assertTrue(f.getCellType(0).equals("airhabitat"));
  }

  @Test
  public void test_getMaps() {
    System.out.println("Test getMaps");
   	FileReader f = new FileReader("input.txt");

    assertTrue(f.getMaps(0,0)=='#');
  }

  @Test
  public void test_getNCageArea() {
    System.out.println("Test getNCageArea");
   	FileReader f = new FileReader("input.txt");

    assertTrue(f.getNCageArea(0)==10);
    assertTrue(f.getNCageArea(1)==7);
    assertTrue(f.getNCageArea(2)==7);
  }

  @Test
  public void test_getCageSimbol() {
    System.out.println("Test getCageSimbol");
   	FileReader f = new FileReader("input.txt");

    assertTrue(f.getCageSimbol(0)=='+');
    assertTrue(f.getCageSimbol(1)=='%');
    assertTrue(f.getCageSimbol(2)=='&');
  }

  @Test
  public void test_getCageType() {
    System.out.println("Test getCageType");
   	FileReader f = new FileReader("input.txt");

    assertTrue(f.getCageType(0).equals("water"));
    assertTrue(f.getCageType(1).equals("land"));
    assertTrue(f.getCageType(2).equals("air"));
  }

  @Test
  public void test_getPosX() {
    System.out.println("Test getPosX");
   	FileReader f = new FileReader("input.txt");

    assertTrue(f.getPosX(0)==0);
    assertTrue(f.getPosX(1)==0);
    assertTrue(f.getPosX(2)==1);
  }

  @Test
  public void test_getPosY() {
    System.out.println("Test getPosY");
   	FileReader f = new FileReader("input.txt");

    assertTrue(f.getPosY(0)==3);
    assertTrue(f.getPosY(1)==4);
    assertTrue(f.getPosY(2)==3);
  }

  @Test
  public void test_getNAnimal() {
    System.out.println("Test getNAnimal");
   	FileReader f = new FileReader("input.txt");

    assertTrue(f.getNAnimal(0)==5);
    assertTrue(f.getNAnimal(1)==3);
    assertTrue(f.getNAnimal(2)==4);
  }
}