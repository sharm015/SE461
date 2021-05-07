import static org.junit.jupiter.api.Assertions.*;
import java.io.PrintStream;

import java.io.ByteArrayOutputStream;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TetrisTest {
	
	private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
	
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
		//tetris.startGame();
        //tetris.updateGame();
		
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
	}

}
