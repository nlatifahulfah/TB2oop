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
		System.out.println("Test apakah getCageArea menghasilkan nilai dengan benar");
		Cage kandang = new Cage('c', "land");
		
		assertTrue(kandang.getCageArea==50);
	}
}