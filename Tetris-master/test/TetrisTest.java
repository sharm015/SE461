import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.io.PrintStream;
import java.util.Random;
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
	public Random random;
	
	@BeforeEach
	void setUp() throws Exception {
		tetris = new Tetris();
		boardP  = new BoardPanel(tetris); 
		
		tetris.random = new Random();
		tetris.isNewGame = true;
		tetris.gameSpeed = 1.0f;
		tetris.logicTimer = new Clock(1.0f);
		tetris.board = boardP; 
	}
 
	@AfterEach
	void tearDown() throws Exception {
		tetris = null;
		boardP = null;
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
		
		TileType tile = TileType.TypeO;
		assertTrue(boardP.isValidAndEmpty(tile, 2, 2, 2));
		this.tetris.resetGame();
		this.tetris.board.addPiece(tile, 2, 3, 1);
		
		
			this.tetris.updateGame();
			assertAll(
					() -> assertEquals(1L, (long)this.tetris.level),
					() -> assertEquals(0L, (long)this.tetris.score)
			);
	}
}
