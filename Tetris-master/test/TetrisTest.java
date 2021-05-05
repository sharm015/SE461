import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Tetris;

class TetrisTest {
	private static final OutputStream outContent = null;
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream ogOut = System.out;
	private final PrintStream ogErr = System.err;
	private Tetris update;
	

	@BeforeEach
	void setUp() throws Exception {
		update = new Tetris();
		
		System.setOut(new PrintStream(errContent));
	}

	@AfterEach
	void tearDown() throws Exception {
		update = null;
		System.setOut(ogOut);
	}

	@Test
	void testCPC() {
		update.updateGame();
	}

}
