import org.junit.Test;
import se.iths.gameOfLife.Universe;
import se.iths.gameOfLife.Cell.CellState;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class UniverseTest {

    public static final CellState X = CellState.ALIVE;
    public static final CellState O = CellState.DEAD;


    @Test
    public void shouldStoreTheInitialState(){
        CellState[][] original = {
                {X, O, X},
                {O, O, O},
                {O, X, X},
        };
        Universe testUniverse = new Universe(original);

        CellState[][] actual = testUniverse.getState();
        assertArrayEquals(original, actual);

    }

    @Test
    public void shouldUpdateCell(){
       Universe testUniverse = new Universe(new CellState[][]{{X}});

       CellState[][] actual = getNextState(testUniverse);

       assertEquals(CellState.DEAD, actual[0][0]);
    }

    @Test
    public void shouldUpdateAllCellsState(){
        Universe testUniverse = new Universe(new CellState[][] {
                {O, X, X},
                {X, O, X},
                {O, O, X}
        });
        CellState[][] expected = new CellState[][]{
                {O, X, X},
                {O, O, X},
                {O, X, O}
        };

        CellState[][] actual = getNextState(testUniverse);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCheckAllNeighbours(){
        Universe testUniverse = new Universe(new CellState[][] {
                {X, X, X},
                {X, X, X},
                {X, X, X}
        });
        CellState[][] expected = new CellState[][]{
                {X, O, X},
                {O, O, O},
                {X, O, X}
        };

        CellState[][] actual = getNextState(testUniverse);

        assertArrayEquals(expected, actual);

    }

    private CellState[][] getNextState(Universe testUniverse) {
        testUniverse.update();
        return testUniverse.getState();
    }

}
