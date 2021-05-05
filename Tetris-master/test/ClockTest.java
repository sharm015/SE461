import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.PrintStream;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import src.Clock;

class ClockTest {
	private static final OutputStream outContent = null;
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream ogOut = System.out;
	private final PrintStream ogErr = System.err;
	
	public Clock clock;
	
	@BeforeEach
	public void setUp() throws Exception {
		clock = new Clock(1);
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@AfterEach
	public void tearDown() throws Exception {
		clock = null;
		System.setOut(ogOut);
		System.setErr(ogErr);
	}

	@Test
	public void CPCtest() { //for constructor 
		
		clock.setCyclesPerSecond(1);
        assertNotNull(1,outContent.toString().trim());
        ((ByteArrayOutputStream) outContent).reset();
	}

}
