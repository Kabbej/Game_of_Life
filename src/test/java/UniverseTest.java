import org.junit.Test;
import se.iths.gameOfLife.Cell;
import se.iths.gameOfLife.Universe;
import se.iths.gameOfLife.Cell.cellState;

import static org.junit.Assert.assertArrayEquals;

public class UniverseTest {

    public static final cellState X = cellState.ALIVE;
    public static final cellState O = cellState.DEAD;


    @Test
    public void shouldStoreInitialState() {
        cellState[][] firstArray = {
                {X, O, X},
                {O, O, O},
                {O, X, X},
        };

        Universe testUniverse = new Universe();

        testUniverse.getState);


        }
}
