import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.*;

class TileTypeTest {
	
	public static final OutputStream outContent = null;
	public final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	public final PrintStream ogOut = System.out;
	public final PrintStream ogErr = System.err;
	
	public TileType tile;
	
	@BeforeEach
	void setUp() throws Exception {
		tile = TileType.TypeI;
		
	}
 
	@AfterEach
	void tearDown() throws Exception {
		tile = null;
	}

	@Test
	void getRightInsetTest() {
		tile.getRightInset(0);
		tile.getBaseColor();
		tile.getLightColor();
		tile.getDarkColor();
		tile.getDimension();
		tile.getSpawnColumn();
		tile.getSpawnRow();
		tile.getRows();
		tile.getCols();
		
	}
	
	@Test
	void getBottomInsetTest() {
		tile.getBottomInset(0);
	}
	
	@Test
	void getLeftInsetTest() {
		tile.getLeftInset(0);
		
	}

}
