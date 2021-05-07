import static org.junit.jupiter.api.Assertions.*;
import java.io.PrintStream;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class TetrisTest {
	
	private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final PrintStream ogOut = System.out;
	private final PrintStream ogErr = System.err;
	
	private Tetris tetris;
	private BoardPanel boardP;
	private TileType TcurrentPiece;
	private int TcurrentCol;
	private int Tcurrentrow;
	private int Tcurrentrotation;
	boolean node1 = true;
	//boardP.isValidAndEmpty(TcurrentPiece, TcurrentCol, Tcurrentrow + 1 , Tcurrentrotation);
	
	@BeforeEach
	void setUp() throws Exception {
		tetris = new Tetris();
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
		//tetris.startGame();
        //tetris.updateGame();
		
	}
 
	@AfterEach
	void tearDown() throws Exception {
		tetris = null;
		System.setOut(ogOut);
		System.setErr(ogErr);
	}
	

	@Test
	void testKeyPressed() {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_Q);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_P);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_S);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testStartGame() {
		//tetris.startGame();
	}

	@Test
	void testUpdateGame() {

		//----------Test path: [1,2]--------------//
		
		TcurrentPiece = tetris.getPieceType();
		TcurrentCol = tetris.getPieceCol();
		Tcurrentrow = tetris.getPieceRow();
		Tcurrentrotation = tetris.getPieceRotation();
		//boolean a = (this.node1 == this.node1);
        //assertTrue(a);
        //assertEquals(Tcurrentrow+2, tetris.updateGame());
		//boardP.isValidAndEmpty(TcurrentPiece, TcurrentCol, Tcurrentrow + 1 , Tcurrentrotation)
        assertNull(boardP);
        output.reset();
        
        //TestPath: [1,3,4,5]
	}
}
