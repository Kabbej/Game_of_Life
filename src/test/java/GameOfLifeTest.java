
/*
1.  Any live cell with fewer than two live neighbors dies, as if caused by under population.
2.  Any live cell with two or three live neighbors lives on to the next generation.
3.  Any live cell with more than three live neighbors dies, as if by overpopulation.
4.  Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
   */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GameOfLifeTest {


    @Test
    public void aliveCellWithOnlyOneNeighbourShouldDie(){
        Cell changingCell = new Cell(Cell.CellState.ALIVE);

        Cell.CellState actual = changingCell.getNextState(1);

        assertEquals(Cell.CellState.DEAD, actual);
    }

    @Test
    public void aliveCellWithZeroNeighboursShouldDie(){
        Cell changingCell = new Cell(Cell.CellState.ALIVE);

        Cell.CellState actual = changingCell.getNextState(0);
    }




}
