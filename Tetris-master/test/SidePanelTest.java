import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SidePanelTest {
	private static final OutputStream outContent = null;
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream ogOut = System.out;
	private final PrintStream ogErr = System.err;
	SidePanel s;
	Tetris t;
	@BeforeEach
	void setUp() throws Exception {
		t=new Tetris();
		s= new SidePanel(t);
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@AfterEach
	void tearDown() throws Exception {
		s=null;
		System.setOut(ogOut);
		System.setErr(ogErr);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
 
}
