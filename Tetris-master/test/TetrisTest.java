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
		boardP = null;
	}
	
	
	@Test
	void rotatePieceTest() {
		tetris.currentType = TileType.TypeI;

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
	}
	

	@Test 
	void keyPressedTest()
	{
		key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_S,'a');
		tetris.isPaused=false;
		tetris.dropCooldown=0;
		tetris.dispatchEvent(key);
		tetris.dropCooldown=1;
		tetris.dispatchEvent(key);
		tetris.isPaused=true;
		tetris.dispatchEvent(key);
		
		
		//Key a
		key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_A,'a');
		tetris.isPaused=true;
		tetris.dispatchEvent(key);
		
		
		//Key d
		key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_D,'a');
		tetris.dispatchEvent(key);
		
		
		//Key q
		key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_Q,'a');
		
		TileType tile1 = TileType.TypeO;
		boardP.isValidAndEmpty(tile1, 2, 2, 2);
		tetris.dispatchEvent(key);
		
		
		//key e
		key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_E,'a');
		tetris.isPaused=true;
		tetris.dispatchEvent(key);
		
		
		//key p
		key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_P,'a');
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
	
	
}







