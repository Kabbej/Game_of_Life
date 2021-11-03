import org.junit.Test;
import se.iths.gameOfLife.Cell;
import se.iths.gameOfLife.Universe;
import se.iths.gameOfLife.Cell.cellState;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class UniverseTest {

    public static final cellState X = cellState.ALIVE;
    public static final cellState O = cellState.DEAD;


    @Test
    public void shouldStoreTheInitialState(){
        cellState[][] original = {
                {X, O, X},
                {O, O, O},
                {O, X, X},
        };
        Universe testUniverse = new Universe(original);

        Cell.cellState[][] actual = testUniverse.getState();
        assertArrayEquals(original, actual);

    }

    @Test
    public void shouldUpdateCells(){
       Universe testUniverse = new Universe(new cellState[][]{{X}});

       testUniverse.update();
       cellState[][] actual = testUniverse.getState();

       assertEquals(cellState.DEAD, actual[0][0]);
    }

    @Test
    public void shouldUpdateAllCellsState(){
        Universe testUniverse = new Universe(new cellState[][] {
                {O, X, X},
                {X, O, X},
                {O, O, X}
        });
        cellState[][] expected = new cellState[][]{
                {O, X, X},
                {O, O, X},
                {O, X, O}
        };

        testUniverse.update();
        cellState[][] actual = testUniverse.getState();

        assertArrayEquals(expected, actual);
    }
}
