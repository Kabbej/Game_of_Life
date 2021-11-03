
/*
1.  Any live cell with fewer than two live neighbors dies, as if caused by under population.
2.  Any live cell with two or three live neighbors lives on to the next generation.
3.  Any live cell with more than three live neighbors dies, as if by overpopulation.
4.  Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
   */
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;


@RunWith(JUnitParamsRunner.class)
public class CellTest {

    @Test
    @Parameters({
            "ALIVE, 0, DEAD",
            "ALIVE, 1, DEAD",
            "ALIVE, 2, ALIVE",
            "ALIVE, 3, ALIVE",
            "ALIVE, 4, DEAD",
            "ALIVE, 5, DEAD",
            "ALIVE, 6, DEAD",
            "ALIVE, 7, DEAD",
            "ALIVE, 8, DEAD",
            "DEAD, 0, DEAD",
            "DEAD, 1, DEAD",
            "DEAD, 2, DEAD",
            "DEAD, 3, ALIVE",
            "DEAD, 4, DEAD",
            "DEAD, 5, DEAD",
            "DEAD, 6, DEAD",
            "DEAD, 7, DEAD",
            "DEAD, 8, DEAD",})

    public void shouldCheckAllRulesForCells(String initial, int numberOfNeighbours, String expected) {
        Cell.cellState initialState = Cell.cellState.valueOf(initial);
        Cell testCell = new Cell(initialState);

        testCell.getNextGeneration(numberOfNeighbours);
        Cell.cellState actual = testCell.getState();

        Cell.cellState expectedState = Cell.cellState.valueOf(expected);
        assertEquals(expectedState, actual);

    }


}