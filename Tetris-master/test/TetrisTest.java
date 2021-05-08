import static org.junit.Assert.assertEquals;
import java.io.PrintStream;
import java.util.Random;

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
}






