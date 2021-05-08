import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.*;

class BoardPanelTest {
	public static final OutputStream outContent = null;
	public final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	public final PrintStream ogOut = System.out;
	public final PrintStream ogErr = System.err;
	public TileType ty;
	public TileType ty2;
	public TileType ty3;
	public BoardPanel b;
	public Tetris t;

	@BeforeEach
	void setUp() throws Exception {

		t= new Tetris();
		b = new BoardPanel(t);
		ty = TileType.TypeJ;
		ty2=TileType.TypeI;
		ty3 = TileType.TypeS;

		//System.setOut(new PrintStream(outContent));
		//System.setErr(new PrintStream(errContent));
	}

	@AfterEach
	void tearDown() throws Exception {
		b = null;
		t = null;
		ty= null;
		System.setOut(ogOut);
		System.setErr(ogErr);
	}

	@Test
	void clearTest() {
		//t.startGame();
		//ty.getDimension();

		b.clear();
		assertNull(b.tiles[0][1]);
		//assertEquals("zero", outContent.toString().trim());
		//outContent.flush();

	}

	@Test
	void isValidAndEmptyTest()
	{
		b.isValidAndEmpty(ty, 3, 3, 2);
		//assertEquals("true",outContent.toString().trim());
		b.isValidAndEmpty(ty, 0, 0, 0);
		//assertEquals("true",outContent.toString().trim());
		b.isValidAndEmpty(ty2, 4, 4, 1);

		b.isValidAndEmpty(ty3, 4, 4, 1);
	}

	@Test
	void addPieceTest()
	{
		//b.addPiece(ty, 3, 3, 2);
		TileType tile2 = TileType.TypeL;
		this.b.addPiece(tile2, 3,2,2);

		assertEquals(false, this.b.isValidAndEmpty(tile2, 3,2,2));
	}

	@Test
	void checklinesTest()
	{
		//t.board.tiles[1][1] = null;
		assertEquals(true,this.b.checkLine(1));
		assertEquals(22,this.b.checkLines());

	}










}
