import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.io.PrintStream;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class TetrisTest {
	
	public static final OutputStream outContent = null;
	public final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	public final PrintStream ogOut = System.out;
	public final PrintStream ogErr = System.err;
	
	public Tetris tetris;
	public BoardPanel boardP;
	public TileType tile1; 
	public int OriginalRow;
	public int TcurrentCol ;
	public int TcurrentRotation;
	public int TcurrentRow;
	public int TScore;
	
	@BeforeEach
	void setUp() throws Exception {
		tetris = new Tetris();
		boardP  = new BoardPanel(tetris); 
		tile1 = TileType.TypeJ;
		OriginalRow = tetris.getPieceRow();
		TcurrentCol = tetris.getPieceCol();
		TcurrentRotation = tetris.getPieceRotation();
		TScore = tetris.getScore();
		TcurrentRow = tetris.currentRow;
		
	}
 
	@AfterEach
	void tearDown() throws Exception {
		//tetris = null;
		boardP = null;
		tetris = null;
		tile1= null;
		OriginalRow = TcurrentRow;
		TcurrentCol = 0;
		TcurrentRotation = 0;
		TcurrentRow = 0;
		TScore = 0;
		System.setOut(ogOut);
		System.setErr(ogErr);
		
	}
	/*
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
*/
	@Test
	void testUpdateGame() {

		//----------Test path: [1,2]--------------//
		assertTrue(boardP.isValidAndEmpty(tile1, TcurrentCol, OriginalRow + 1 ,TcurrentRotation));
		errContent.reset();
		
		//----------Test path: [1,3,4,5]---------//
		assertTrue(boardP.isValidAndEmpty(tile1, TcurrentCol, OriginalRow + 1 ,TcurrentRotation));
		boardP.addPiece(tile1, TcurrentCol, OriginalRow + 1 ,TcurrentRotation);
		int Tcleared = boardP.checkLines();
		//TScore = TScore +50 << Tcleared;
		//assertTrue(Tcleared > 0);
		//assertNotSame(TScore, tetris.score);
		assertEqual(expected value, tetris.updateGame());
		
	}
		

	    
		 //TcurrentRow = OriginalRow + 1;
		// assertTrue(TcurrentRow > OriginalRow);
		 //assertEquals(2,tetris.updateGame());
        
		 //assertNotNull(boardP);
        //output.reset();
        
        //TestPath: [1,3,4,5]
}

