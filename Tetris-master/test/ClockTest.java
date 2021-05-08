

import static org.junit.Assert.*;


import java.io.PrintStream;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

import org.junit.jupiter.api.*;




class ClockTest { 
	private static final OutputStream outContent = null;
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream ogOut = System.out;
	private final PrintStream ogErr = System.err;
	
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
	}
	
	

}
