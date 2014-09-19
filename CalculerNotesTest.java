

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculerNotesTest {

	@Test
	public void testCalculerA() {
		String notetotale = CalculerNotes.calculer(65, 15);
		assertEquals("A",notetotale);
	}
	@Test
	public void testCalculerB() {
		String notetotale = CalculerNotes.calculer(50, 15);
		assertEquals("B",notetotale);
	}
	@Test
	public void testCalculerC() {
		String notetotale = CalculerNotes.calculer(30, 15);
		assertEquals("C",notetotale);
	}
	
	@Test
	public void testCalculerD() {
		String notetotale = CalculerNotes.calculer(10, 15);
		assertEquals("D",notetotale);
	}
	@Test
	public void testCalculerFm() {
		String notetotale = CalculerNotes.calculer(-10, -15);
		assertEquals("FM",notetotale);
	}
	
}
