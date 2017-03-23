import org.junit.*;
import static org.junit.Assert.*;

public class FlyingfishTest {
	@Test
	public void test_addBobot() {
		System.out.println("Test apakah addBobot menambahkan bobot dengan benar");
		Flyingfish F = new Flyingfish(2,3);
		F.addBobot();
		assertTrue(F.getBobot()==11);
	}
}
