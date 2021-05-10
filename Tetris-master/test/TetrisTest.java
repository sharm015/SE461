import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.PrintStream;
import java.util.Random;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.*;


class TetrisTest {
	
	public static final OutputStream outContent = null;
	public final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	public final PrintStream ogOut = System.out;
	public final PrintStream ogErr = System.err;
	
	public Tetris tetris;
	public BoardPanel boardP;
	public Random random;
	public KeyEvent key;
	public TileType tileType;
	
	@BeforeEach
	void setUp() throws Exception {

		tetris = new Tetris();
		boardP  = new BoardPanel(tetris); 
		//key = new KeyEvent();
		
		
		tetris.random = new Random();
		tetris.isNewGame = true;
		tetris.gameSpeed = 1.0f;
		tetris.logicTimer = new Clock(1.0f);
		tetris.board = boardP; 
	}
 
	@AfterEach
	void tearDown() throws Exception {
		tetris = null;
	}
	
	
	@Test
	void rotatePieceTest() {
		tetris.currentType = TileType.TypeI;

		tetris.rotatePiece(2);
		tetris.currentType = TileType.TypeJ;

		tetris.rotatePiece(1);
		tetris.currentType = TileType.TypeO;
		tetris.level=10;
		tetris.rotatePiece(2);
	}
	
	@Test
	void testUpdateGame() {
		TileType tile = TileType.TypeO;
        tetris.resetGame();
        tetris.board.addPiece(tile, 2,3,1);
        tetris.updateGame();
        tetris.renderGame();
        assertEquals(1L,(long)tetris.level);
        tetris.resetGame();
        tetris.board.addPiece(tile, 2,3,1);
        tetris.updateGame();
        tetris.renderGame();
        assertEquals(0L,(long)tetris.score);
        tetris.updateGame();
        tetris.renderGame();
        tetris.resetGame();
	}
	
/*
	@Test 
	void keyPressedTest()
	{
		key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_S,'S');
		tetris.isPaused=false;
		tetris.dropCooldown=0;
		tetris.dispatchEvent(key);
		tetris.dropCooldown=1;
		tetris.dispatchEvent(key);
		tetris.isPaused=true;
		tetris.dispatchEvent(key);
		
		
		//Key a
		key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_A,'A');
		//tetris.isPaused= true;
		assertEquals(0, tetris.currentCol);
		/*tileType = TileType.TypeI;
		tetris.isPaused= false;
		tetris.board.isValidAndEmpty(tileType, 4, 4, 1);
		System.out.println("CurrentCol" + " "+ tetris.getPieceCol());
		//tetris.dispatchEvent(key);
		assertEquals(0, tetris.getPieceCol());
		System.out.println("col after running " + tetris.currentCol);
		tetris.dispatchEvent(key);
		
		for(int x =0 ; x < 10; x++) {
			for(int y = 0; y < 22; y++) {
				System.out.println(x +" "+ y + " " +tileType);
			}
		}
		
		tetris.board.isValidAndEmpty(tileType, 7, 0, 0);
		//tetris.dispatchEvent(key);
		assertEquals(3, tetris.getPieceCol());
		
		tetris.isPaused = true;
		tetris.dispatchEvent(key);
		
		//Key d
		key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_D,'D');
		tetris.dispatchEvent(key);
		
		
		//Key q
		key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_Q,'Q');
		
		TileType tile1 = TileType.TypeO;
		boardP.isValidAndEmpty(tile1, 2, 2, 2);
		tetris.dispatchEvent(key);
		
		
		//key e
		key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_E,'E');
		tetris.isPaused=true;
		tetris.dispatchEvent(key);
		
		
		
		
		//key p
		key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_P,'P');
		tetris.isNewGame=true;
		tetris.dispatchEvent(key);
		
		//key enter
		key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_ENTER,'a');
		tetris.isNewGame=true;
		tetris.dispatchEvent(key);
		
		
		//key released
		key = new KeyEvent(tetris, KeyEvent.KEY_RELEASED, System.currentTimeMillis(), 0, KeyEvent.VK_S,'a');
		tetris.dispatchEvent(key);
	}
*/
	
	@Test
	void spawnPieceTest()
	{
		TileType tile = TileType.TypeI;
		tetris.board.isValidAndEmpty(tile, 2, 2, 2);
		assertEquals(false, tetris.isGameOver());
		
	}
	
	@Test
	void startGameTest() {
		TileT
	}
	
	
}







