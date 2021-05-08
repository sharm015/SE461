import static org.junit.Assert.assertEquals;
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
	
	@BeforeEach
	void setUp() throws Exception {
		this.tetris = new Tetris();
		this.boardP  = new BoardPanel(tetris); 
		
		this.tetris.random = new Random();
		this.tetris.isNewGame = true;
		this.tetris.gameSpeed = 1.0f;
		this.tetris.logicTimer = new Clock(1.0f);
		this.tetris.board = boardP; 
	}
 
	@AfterEach
	void tearDown() throws Exception {
		this.tetris = null;
		this.boardP = null;
	}
	
	@Test
	void testUpdateGame() {
		
		TileType tile = TileType.TypeO;
		this.tetris.resetGame();
		this.tetris.board.addPiece(tile, 2,3,1);
		
		this.tetris.updateGame();
		assertEquals(1L,(long)this.tetris.level);
		assertEquals(0L,(long)this.tetris.score);
	}
	
	@Test
	void rotatePieceTest() {
		this.tetris.currentType=TileType.TypeI;

		this.tetris.rotatePiece(2);
	}
	
	@Test 
	void keyPressedTest()
	{
		this.key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_S,'a');
		this.tetris.isPaused=false;
		this.tetris.dropCooldown=0;
		this.tetris.dispatchEvent(key);
		this.tetris.dropCooldown=1;
		this.tetris.dispatchEvent(key);
		this.tetris.isPaused=true;
		this.tetris.dispatchEvent(key);
		
		
		//Key a
		this.key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_A,'a');
		this.tetris.isPaused=true;
		this.tetris.dispatchEvent(key);
		
		
		//Key d
		this.key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_D,'a');
		this.tetris.dispatchEvent(key);
		
		
		//Key q
		this.key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_Q,'a');
		
		TileType tile1 = TileType.TypeO;
		this.boardP.isValidAndEmpty(tile1, 2, 2, 2);
		this.tetris.dispatchEvent(key);
		
		
		//key e
		this.key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_E,'a');
		this.tetris.isPaused=true;
		this.tetris.dispatchEvent(key);
		
		
		//key p
		this.key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_P,'a');
		this.tetris.isNewGame=true;
		this.tetris.dispatchEvent(key);
		
		//key enter
		this.key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_ENTER,'a');
		this.tetris.isNewGame=true;
		this.tetris.dispatchEvent(key);
		
		
		//key released
		this.key = new KeyEvent(tetris, KeyEvent.KEY_RELEASED, System.currentTimeMillis(), 0, KeyEvent.VK_S,'a');
		this.tetris.dispatchEvent(key);
	}
	
}






