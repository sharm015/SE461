import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardPanelTest {
	private static final OutputStream outContent = null;
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream ogOut = System.out;
	private final PrintStream ogErr = System.err;
	
	BoardPanel b;
	Tetris t;
	@BeforeEach
	void setUp() throws Exception {
		t= new Tetris();
		b = new BoardPanel(t);
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@AfterEach
	void tearDown() throws Exception {
		b = null;
		t = null;
		System.setOut(ogOut);
		System.setErr(ogErr);
	}

	@Test
	void clearTest() {
		b.clear();
		equals(null);
	}

}
