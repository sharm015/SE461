import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TetrisTest {
	
	private Tetris tetris;
	private BoardPanel boardP;
	private TileType currentPiece;
	
	@BeforeEach
	void setUp() throws Exception {
		tetris = new Tetris();
        tetris.startGame();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}
	
/*
	@Test
	void testTetris() {
		fail("Not yet implemented");
	}

	@Test
	void testStartGame() {
		fail("Not yet implemented");
	}
*/
	@Test
	void testUpdateGame() {
		//tetris.updateGame();
		currentPiece = tetris.getPieceType();
		//At any time, the no. of rows cleared should be less than or equal to 4
        assertTrue(boardP.isValidAndEmpty(currentPiece, 4, 4, 1));
        
	}

}
