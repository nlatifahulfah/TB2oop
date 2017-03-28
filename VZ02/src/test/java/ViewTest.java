// File : ViewTest.java
// PIC : Nur Latifah Ulfah - 13514015

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Nur Latifah Ulfah - 13514015
 */
public class ViewTest {
	@Test
	public void test_setVal() {
		System.out.println("Test setVal");
		View screen = new View(5,5);
		
    for(int i=0; i<5; i++) {
      for(int j=0; j<5; j++) {
        screen.setVal(i,j,'z');
      }
    }
		assertTrue( screen.getVal(0,0)=='z');
	}

  @Test
  public void test_getVal() {
    System.out.println("Test getVal");
    View screen = new View(5,5);
    
    assertTrue( screen.getVal(0,0)==' ');
  }

  @Test
  public void test_getNBrs() {
    System.out.println("Test getNBrs");
    View screen = new View(5,4);
    
    assertTrue( screen.getNBrs()==5);
  }

  @Test
  public void test_getNKol() {
    System.out.println("Test getNKol");
    View screen = new View(5,4);
    
    assertTrue( screen.getNKol()==4);
  }
}