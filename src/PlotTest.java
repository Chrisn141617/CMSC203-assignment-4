import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTest {
	private Plot plot1, plot5, plot6;

	@BeforeEach
	void setUp() throws Exception {
		plot1 = new Plot(2, 2, 6, 6);
		plot5 = new Plot(3, 4, 4, 3);
		plot6 = new Plot(4, 5, 1, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		plot1 = plot5 = null;
	}

	@Test
	void testGetX() {
		assertEquals(plot1.getX(), 2);
	}

	@Test
	void testGetY() {
		assertEquals(plot1.getY(), 2);
	}

	@Test
	void testGetWidth() {
		assertEquals(plot1.getWidth(), 6);
	}

	@Test
	void testGetDepth() {
		assertEquals(plot5.getDepth(), 3);
	}

	@Test
	void testEncompasses() {
		assertTrue(plot5.encompasses(plot6));
		assertFalse(plot6.encompasses(plot5));
	}

	@Test
	void testOverlaps() {
		assertTrue(plot1.overlaps(plot5));
	}

	@Test
	void testToString() {
		assertEquals("3,4,4,3",plot5.toString());
	}

}
