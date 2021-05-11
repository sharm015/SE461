import static org.junit.Assert.*;
import org.junit.jupiter.api.*;


class ClockTest { 
	
	public Clock Tclock;
	
	@BeforeEach
	public void setUp() throws Exception {
		Tclock = new Clock(1.0f);
		Tclock.update();
		
	}

	@AfterEach
	public void tearDown() throws Exception {
		Tclock = null;
		//System.setOut(ogOut);
		//System.setErr(ogErr);
	}
	
	
	@Test
	public void update() {
		Tclock.isPaused = true;
		Tclock.update();
		Tclock.isPaused = false;
		Tclock.update();
	}
	
	@Test
	public void testhasElapsedCycle() { 
		Tclock.elapsedCycles = 1;
		assertTrue(Tclock.hasElapsedCycle());
		assertFalse(Tclock.hasElapsedCycle());
	}
	
	@Test
	public void testsetPaused() {
		Tclock.setPaused(true);
		Tclock.setPaused(false);
	}
	
	@Test
	public void testisPaused() {
		Tclock.isPaused = true;
		assertTrue(Tclock.isPaused());
		Tclock.isPaused = false;
		assertFalse(Tclock.isPaused());
	}
	
	@Test
	public void testpeekElapsedCycle() {
		Tclock.elapsedCycles = 2;
		assertTrue(Tclock.peekElapsedCycle());
		Tclock.elapsedCycles = 0;
		assertFalse(Tclock.peekElapsedCycle());
	}
	

}
