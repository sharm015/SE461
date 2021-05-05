import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;

import java.io.PrintStream;
import java.time.Clock;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class ClockTest {
	private static final OutputStream outContent = null;
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream ogOut = System.out;
	private final PrintStream ogErr = System.err;
	
	private Clock clock;
	
	@BeforeEach
	void setUp() throws Exception {
		clock = new Clock();
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@AfterEach
	void tearDown() throws Exception {
		clock = null;
		System.setOut(ogOut);
		System.setErr(ogErr);
	}

	@Test
	void CPCtest() {
		
		ClockTest.clock(0);
        assertEquals(outContent.toString().trim());
        ((ByteArrayOutputStream) outContent).reset();
	}

}
