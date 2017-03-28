// File : MatrixCellTest.java
// PIC : Nur Latifah Ulfah - 13514015

import org.junit.*;
import static org.junit.Assert.*;

/**
*
* @author Nur Latifah Ulfah - 13514015
*/
public class MatrixCellTest {
  @Test
  public void test_setCell() {
    System.out.println("Test setCell");
    MatrixCell m = new MatrixCell(5,5);
    Cell c = new Cell(0,0,'c');
    m.setCell(c,0,0);
    assertTrue(m.getCell(0,0).render()=='c');
  }

  @Test
  public void test_getNBrs() {
    System.out.println("Test getNBrs");
    MatrixCell m = new MatrixCell(5,4);
    
    assertTrue(m.getNBrs()==5);
  }

  @Test
  public void test_getNKol() {
    System.out.println("Test getNKol");
    MatrixCell m = new MatrixCell(5,4);
    
    assertTrue(m.getNKol()==4);
  }
}