import static org.junit.Assert.assertEquals;
<<<<<<< HEAD
import java.io.PrintStream;
import java.util.Random;
import java.awt.event.KeyEvent;
<<<<<<< HEAD
=======
=======

>>>>>>> be710431eda1a04b45d001823de4b55bfbc262c2
>>>>>>> 47588b46b3f462b1bda693e0d6213c23e1e71ff5
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Random;

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
	public KeyEvent key;
	
	@BeforeEach
	void setUp() throws Exception {
<<<<<<< HEAD
		this.tetris = new Tetris();
		this.boardP  = new BoardPanel(tetris); 
		//this.key = new KeyEvent();
=======
		tetris = new Tetris();
		boardP  = new BoardPanel(tetris); 
>>>>>>> be710431eda1a04b45d001823de4b55bfbc262c2
		
		tetris.random = new Random();
		tetris.isNewGame = true;
		tetris.gameSpeed = 1.0f;
		tetris.logicTimer = new Clock(1.0f);
		tetris.board = boardP; 
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
		this.tetris.currentType = TileType.TypeI;

		this.tetris.rotatePiece(2);
	}
	
<<<<<<< HEAD
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
	
=======
	
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
	
	
	
	key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_A,'a');
	tetris.isPaused=true;
	tetris.dispatchEvent(key);
	
	key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_D,'a');
	tetris.dispatchEvent(key);
	
	key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_Q,'a');
	tetris.isPaused=true;
	TileType tile = TileType.TypeO;
	boardP.isValidAndEmpty(tile, 2, 2, 2);
	tetris.dispatchEvent(key);
	
	key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_E,'a');
	tetris.isPaused=true;
	tetris.dispatchEvent(key);
	
	key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_P,'a');
	tetris.dispatchEvent(key);
	
	key = new KeyEvent(tetris, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_ENTER,'a');
	tetris.isNewGame=true;
	tetris.dispatchEvent(key);
	
	key = new KeyEvent(tetris, KeyEvent.KEY_RELEASED, System.currentTimeMillis(), 0, KeyEvent.VK_S,'a');
	tetris.dispatchEvent(key);
	}
>>>>>>> 47588b46b3f462b1bda693e0d6213c23e1e71ff5
}







