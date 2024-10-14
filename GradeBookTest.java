import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook gradeBook1;
	 private GradeBook gradeBook2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		gradeBook1 = new GradeBook(5);
	    gradeBook2 = new GradeBook(5);
	       //Adding random scores
	       gradeBook1.addScore(55.0);
	       gradeBook1.addScore(85.0);
	       gradeBook2.addScore(69.0);
	       gradeBook2.addScore(92.0);

	}

	@AfterEach
	void tearDown() throws Exception {
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(gradeBook1.toString().equals("55.0 85.0"));
	    assertTrue(gradeBook2.toString().equals("69.0 92.0"));
	    assertEquals(gradeBook1.getScoreSize(), 2);
        assertEquals(gradeBook2.getScoreSize(), 2);

	}

	@Test
	void testSum() {
		assertEquals(gradeBook1.sum(), 140.0, 0.01);
	    assertEquals(gradeBook2.sum(), 161.0, 0.01);
	}

	@Test
	void testMinimum() {
		assertEquals(gradeBook1.minimum(), 55.0 , 0.001);
		assertEquals(gradeBook2.minimum(), 69.0 , 0.001);
	}

	@Test
	void testFinalScore() {
		assertEquals(gradeBook1.finalScore(), 85.0, 0.001);
		assertEquals(gradeBook2.finalScore(), 92.0, 0.001);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(gradeBook1.getScoreSize(),2);
	    assertEquals(gradeBook2.getScoreSize(),2);
	}

	@Test
	void testToString() {
		assertEquals(gradeBook1.toString(), "55.0 85.0");
	    assertEquals(gradeBook2.toString(), "69.0 92.0");
	}
}

	
	
